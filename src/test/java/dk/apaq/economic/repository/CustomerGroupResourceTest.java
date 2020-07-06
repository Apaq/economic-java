package dk.apaq.economic.repository;

import dk.apaq.economic.model.CustomerGroup;
import org.junit.Assert;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class CustomerGroupResourceTest extends ResourceTestBase<CustomerGroup> {

    public CustomerGroupResourceTest() {
        super(new CustomerGroupResource(buildRestTemplate(), "http://server/Api"), CustomerGroup.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("customer-groups_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("customer-groups_list.json"), MediaType.APPLICATION_JSON);
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
    protected void doCheckEntity(CustomerGroup entity) {
        if ("1".equals(entity.getId())) {
            assertEquals("Danske", entity.getName());
            Assert.assertEquals("Debitorer", entity.getAccount().getName());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals("Udenlandske", entity.getName());
            Assert.assertEquals("Debitorer", entity.getAccount().getName());
            return;
        }

        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
