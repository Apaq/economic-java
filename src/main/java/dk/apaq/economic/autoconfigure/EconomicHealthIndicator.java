package dk.apaq.economic.autoconfigure;

import dk.apaq.economic.EconomicClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnEnabledHealthIndicator(value = "economic")
public class EconomicHealthIndicator implements HealthIndicator {

    @Autowired
    private EconomicClient client;
    
    @Override
    public Health health() {
        try {
            //client.getSubscriptionResource().findAll(new PageRequest(0, 1), false, false);
            return Health.up()
                    .withDetail("serviceUrl", client.getServiceUrl())
                    .build();
        } catch(Exception ex) {
            return Health.down(ex).build();
        }
    }

}
