package dk.previsto.economic;

import dk.previsto.economic.model.CustomerGroup;
import dk.previsto.economic.model.references.CustomerGroupReference;
import dk.previsto.economic.net.RestTemplateHelper;
import dk.previsto.economic.repository.*;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class EconomicClient {

    private static final Logger LOG = LoggerFactory.getLogger(EconomicClient.class);
    public static final LocalDate EPOCH = LocalDate.of(1970, Month.JANUARY, 1);
    private static final String APP_SECRET_TOKEN_HEADER = "X-AppSecretToken";
    private static final String AGREEEMENT_GRANT_TOKEN_HEADER = "X-AgreementGrantToken";

    private final RestTemplate restTemplate;
    private final String serviceUrl;
    private final String appSecretToken;
    private final String agreementGrantToken;
    private final HttpComponentsClientHttpRequestFactory requestFactory;

    public EconomicClient(String appSecretToken, String agreementGrantToken, String serviceUrl) {
        this(appSecretToken, agreementGrantToken, serviceUrl, false);
    }

    public EconomicClient(String appSecretToken, String agreementGrantToken, String serviceUrl, boolean allowUntrustedCert) {
        this.requestFactory = new HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        this.restTemplate = new RestTemplate(this.requestFactory);
        this.restTemplate.setErrorHandler(new ErrorHandler());
        this.serviceUrl = serviceUrl;
        this.appSecretToken = appSecretToken;
        this.agreementGrantToken = agreementGrantToken;
        
        //Apply default timeouts
        this.requestFactory.setConnectTimeout(10000);
        this.requestFactory.setReadTimeout(10000);

        RestTemplateHelper.configureForEconomicJargon(restTemplate);

        // Apply security
        Header appSecretTokenHeader = new BasicHeader(APP_SECRET_TOKEN_HEADER, appSecretToken);
        Header agreementGrantTokenHeader = new BasicHeader(AGREEEMENT_GRANT_TOKEN_HEADER, agreementGrantToken);
        SSLConnectionSocketFactory sslsf = null;
        SSLContextBuilder builder = new SSLContextBuilder();

        try {
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            sslsf = new SSLConnectionSocketFactory(builder.build());
        } catch (NoSuchAlgorithmException | KeyStoreException | KeyManagementException e) {
            LOG.error("Unable to create SSL context");
        }

        HttpClientBuilder clientBuilder = HttpClients.custom();
        clientBuilder.setDefaultHeaders(Arrays.asList(appSecretTokenHeader, agreementGrantTokenHeader));

        if(allowUntrustedCert) {
            clientBuilder.setSSLSocketFactory(sslsf);
        }

        HttpClient httpClient = clientBuilder.build();
        this.requestFactory.setHttpClient(httpClient);
    }
    
    public void setConnectTimeout(int millis) {
        this.requestFactory.setConnectTimeout(millis);
    }
    
    public void setReadTimeout(int millis) {
        this.requestFactory.setReadTimeout(millis);
    }
    
    public String getAppSecretToken() {
        return appSecretToken;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public CustomerResource getCustomerResource() {
        return new CustomerResource(restTemplate, serviceUrl);
    }
    public CustomerGroupResource getCustomerGroupResource() {
        return new CustomerGroupResource(restTemplate, serviceUrl);
    }

    public DraftInvoiceResource getDraftInvoiceResource() {
        return new DraftInvoiceResource(restTemplate, serviceUrl);
    }

    public BookedInvoiceResource getBookedInvoiceResource() {
        return new BookedInvoiceResource(restTemplate, serviceUrl);
    }

    public ProductResource getProductResource() {
        return new ProductResource(restTemplate, serviceUrl);
    }
    
    public AccountResource getAccountResource() {
        return new AccountResource(restTemplate, serviceUrl);
    }

}
