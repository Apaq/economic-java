package dk.previsto.economic.autoconfigure;

import javax.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

@ConfigurationProperties("economic")
public class EconomicProperties {

    /**
     * The secret app token key for econommic.
     */
    private String appSecretToken;

    /**
     * The grant issued by an agreement, to allow access to data.
     */
    private String agreementGrantToken;

    /**
     * The API url for economic.
     */
    private String serviceUrl;


    @PostConstruct
    protected void init() {
        Assert.notNull(this.serviceUrl, "Service url must be specified via 'economic.serviceUrl'.");
    }


    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getAppSecretToken() {
        return appSecretToken;
    }

    public void setAppSecretToken(String appSecretToken) {
        this.appSecretToken = appSecretToken;
    }

    public String getAgreementGrantToken() {
        return agreementGrantToken;
    }

    public void setAgreementGrantToken(String agreementGrantToken) {
        this.agreementGrantToken = agreementGrantToken;
    }
}
