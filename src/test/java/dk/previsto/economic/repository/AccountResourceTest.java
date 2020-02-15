package dk.previsto.economic.repository;

import dk.previsto.economic.model.Account;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.*;
import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class AccountResourceTest extends ResourceTestBase<Account> {

    public AccountResourceTest() {
        super(new AccountResource(buildRestTemplate(), "http://server/Api"), Account.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("accounts_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("accounts_list.json"), MediaType.APPLICATION_JSON);
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
    protected void doCheckEntity(Account entity) {
        if ("1000".equals(entity.getId())) {
            assertEquals("RESULTATOPGØRELSE", entity.getName());
            return;
        }

        if ("1001".equals(entity.getId())) {
            assertEquals("Omsætning", entity.getName());
            return;
        }
        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
