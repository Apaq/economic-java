package dk.apaq.economic.repository;

import dk.apaq.economic.model.VatZone;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class VatZoneResourceTest extends ResourceTestBase<VatZone> {

    public VatZoneResourceTest() {
        super(new VatZoneResource(buildRestTemplate(), "http://server/Api"), VatZone.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("vat-zones_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("vat-zones_list.json"), MediaType.APPLICATION_JSON);
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
        return "2";
    }

    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        return Arrays.asList(new RequestMatcher[]{});
    }
    

    @Override
    protected void doCheckEntity(VatZone entity) {
        if ("1".equals(entity.getId())) {
            assertEquals("Domestic", entity.getName());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals("EU", entity.getName());
            return;
        }
        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
