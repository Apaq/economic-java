package dk.apaq.economic.autoconfigure;

import dk.apaq.economic.EconomicClient;
import dk.apaq.economic.EconomicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EconomicProperties.class)
public class EconomicClientAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(EconomicClientAutoConfiguration.class);
    
    @Autowired
    private EconomicProperties properties;
    
    @Autowired
    private EconomicClientFactory clientFactory;
    
    @Bean
    public EconomicClient economicClient() {
        String displayKey = properties.getAppSecretToken() != null ? "Not NULL" : "NULL";
        LOG.info("Initializing EconomicClient. [apiKey={}]", displayKey);
        return clientFactory.create(properties.getAgreementGrantToken());
    }
}
