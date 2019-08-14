package dk.previsto.economic;

public class EconomicClientFactory {

    private final String serviceUrl;

    public EconomicClientFactory(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }
    
    public EconomicClient create(String appSecretToken, String agreementGrantToken) {
        return new EconomicClient(appSecretToken, serviceUrl);
    }
}
