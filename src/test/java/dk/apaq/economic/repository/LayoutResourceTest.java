package dk.apaq.economic.repository;

import dk.apaq.economic.model.Layout;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class LayoutResourceTest extends ResourceTestBase<Layout> {

    public LayoutResourceTest() {
        super(new LayoutResource(buildRestTemplate(), "http://server/Api"), Layout.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("layouts_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("layouts_list.json"), MediaType.APPLICATION_JSON);
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
    protected void doCheckEntity(Layout entity) {
        if ("19".equals(entity.getId())) {
            assertEquals("DK. std. m. bankoplys. 1.5", entity.getName());
            return;
        }

        if ("20".equals(entity.getId())) {
            assertEquals("DK. std. m. girokort 1.5", entity.getName());
            return;
        }

        if ("21".equals(entity.getId())) {
            assertEquals("Eng. std. m. bankoplys. 1.5 07.01.14", entity.getName());
            return;
        }
        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
