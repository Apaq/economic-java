package dk.previsto.economic.autoconfigure;

import dk.previsto.economic.EconomicClient;
import dk.previsto.economic.EconomicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(EconomicClient.class)
@ConditionalOnProperty("economic.appSecretToken")
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
        return clientFactory.create(properties.getAppSecretToken());
    }
}
