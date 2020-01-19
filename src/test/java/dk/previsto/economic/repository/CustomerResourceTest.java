package dk.previsto.economic.repository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dk.previsto.economic.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class CustomerResourceTest extends ResourceTestBase<Customer> {

    public CustomerResourceTest() {
        super(new CustomerResource(buildRestTemplate(), "http://server/Api"), Customer.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("customers_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("customers_list.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected String generateExpectedGetParams() {
        return "";
    }

    @Override
    protected String generateExpectedGetQueryParams() {
        return "?skipPages=0&pageSize=1000";
    }

    @Override
    protected String generateSingularId() {
        return "1";
    }
    
    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        List<RequestMatcher> matchers = new ArrayList<>();
        //matchers.add(jsonPath("$.contact.isBarred").value(false));
        matchers.add(jsonPath("$.name").doesNotExist());
        //matchers.add(jsonPath("$.contact.paymentTermsDays").doesNotExist());
        //matchers.add(jsonPath("$.contact.paymentTermsMode").doesNotExist());
        return matchers;
    }

    @Override
    protected void doCheckEntity(Customer entity) {
        if ("1".equals(entity.getId())) {
            assertEquals(false, entity.isBarred());
            assertEquals(Instant.parse("2020-01-17T10:00:51Z"), entity.getLastUpdated());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals(true, entity.isBarred());
            assertEquals(Instant.parse("2019-08-21T09:18:27Z"), entity.getLastUpdated());
            return;
        }

        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
