package dk.previsto.economic.repository;

import dk.previsto.economic.model.Product;
import dk.previsto.economic.model.ProductGroup;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class ProductGroupResourceTest extends ResourceTestBase<ProductGroup> {

    public ProductGroupResourceTest() {
        super(new ProductGroupResource(buildRestTemplate(), "http://server/Api"), Product.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("product-groups_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("product-groups_list.json"), MediaType.APPLICATION_JSON);
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
    protected void doCheckEntity(ProductGroup entity) {
        if ("1".equals(entity.getId())) {
            assertEquals("Varer m/moms", entity.getName());
            return;
        }

        if ("2".equals(entity.getId())) {
            assertEquals("Varer u/moms", entity.getName());
            return;
        }
        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
