package dk.previsto.economic.repository;

import dk.previsto.economic.model.Account;
import dk.previsto.economic.model.PaymentTerm;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class PaymentTermResourceTest extends ResourceTestBase<PaymentTerm> {

    public PaymentTermResourceTest() {
        super(new PaymentTermResource(buildRestTemplate(), "http://server/Api"), PaymentTerm.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("payment-terms_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("payment-terms_list.json"), MediaType.APPLICATION_JSON);
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
        return "1000";
    }
    
    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        return Arrays.asList(new RequestMatcher[]{jsonPath("$.account.bankAccountNo").doesNotExist()});
    }

    @Override
    protected void doCheckEntity(PaymentTerm entity) {
        if ("1".equals(entity.getId())) {
            assertEquals("Netto 8 dage", entity.getName());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals("Netto 14 dage", entity.getName());
            return;
        }
        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
