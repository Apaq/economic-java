package dk.previsto.economic.repository;

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
        return "";
    }

    @Override
    protected String generateSingularId() {
        return "DDAc0RmLQyelyZrv55JJKg";
    }
    
    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        List<RequestMatcher> matchers = new ArrayList<>();
        matchers.add(jsonPath("$.contact.isArchived").value(false));
        matchers.add(jsonPath("$.contact.name").isEmpty());
        matchers.add(jsonPath("$.contact.paymentTermsDays").doesNotExist());
        matchers.add(jsonPath("$.contact.paymentTermsMode").doesNotExist());
        return matchers;
    }

    @Override
    protected void doCheckEntity(Customer entity) {
        if ("1".equals(entity.getId())) {
            assertEquals(false, entity.isBarred());
            assertEquals(LocalDateTime.parse("2016-12-23T08:06:07"), entity.getLastUpdated());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals(false, entity.isBarred());
            assertEquals(LocalDateTime.parse("2016-12-23T08:06:40"), entity.getLastUpdated());
            return;
        }

        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
