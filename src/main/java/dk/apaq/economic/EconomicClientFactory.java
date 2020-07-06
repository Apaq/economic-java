package dk.apaq.economic;

public class EconomicClientFactory {

    private final String serviceUrl;
    private final String appSecretToken;

    public EconomicClientFactory(String serviceUrl, String appSecretToken) {
        this.serviceUrl = serviceUrl;
        this.appSecretToken = appSecretToken;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }
    
    public EconomicClient create(String agreementGrantToken) {
        return new EconomicClient(appSecretToken, agreementGrantToken, serviceUrl);
    }
}
