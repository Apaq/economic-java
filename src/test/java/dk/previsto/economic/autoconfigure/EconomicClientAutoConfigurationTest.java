package dk.previsto.economic.autoconfigure;

import dk.previsto.economic.EconomicClient;
import org.junit.After;
import org.junit.Test;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static org.junit.Assert.*;

public class EconomicClientAutoConfigurationTest {

    private AnnotationConfigApplicationContext context;

    @After
    public void tearDown() {
        if (this.context != null) {
            this.context.close();
        }
    }

    @Test
    public void defaultNativeConnectionFactory() {
        load(EmptyConfiguration.class, 
                "economic.serviceUrl=https://restapi.e-conomic.com",
                "economic.appSecretToken=qwerty123",
                "economic.agreementGrantToken=1321");
        EconomicClient client = this.context.getBean(EconomicClient.class);
        assertEquals("qwerty123", client.getAppSecretToken());
    }

    @Configuration
    static class EmptyConfiguration {
    }

    private void load(Class<?> config, String... environment) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        TestPropertyValues.of(environment).applyTo(applicationContext);
        applicationContext.register(config);
        applicationContext.register(EconomicClientAutoConfiguration.class, EconomicClientFactoryAutoConfiguration.class);
        applicationContext.refresh();
        this.context = applicationContext;
    }

}
