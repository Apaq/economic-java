package dk.previsto.economic.autoconfigure;

import dk.previsto.economic.EconomicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(EconomicClientFactory.class)
@EnableConfigurationProperties(EconomicProperties.class)
public class EconomicClientFactoryAutoConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(EconomicClientFactoryAutoConfiguration.class);
    
    @Autowired
    private EconomicProperties properties;
    
    @Bean
    public EconomicClientFactory economicClientFactory() {
        LOG.info("Initializing EconomicClientFactory. [serviceUrl={}]", properties.getServiceUrl());
        return new EconomicClientFactory(properties.getServiceUrl());
    }
}
