package dk.previsto.economic.repository;

import java.util.Arrays;
import java.util.List;

import dk.previsto.economic.model.Product;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.springframework.test.web.client.RequestMatcher;

public class ProductResourceTest extends ResourceTestBase<Product> {

    public ProductResourceTest() {
        super(new ProductResource(buildRestTemplate(), "http://server/Api"), Product.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("products_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("products_list.json"), MediaType.APPLICATION_JSON);
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
        return "ksSgZEGPQmGohQ9eWxVOoQ";
    }

    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        return Arrays.asList(new RequestMatcher[]{});
    }
    

    @Override
    protected void doCheckEntity(Product entity) {
        if ("ksSgZEGPQmGohQ9eWxVOoQ".equals(entity.getId())) {
            assertEquals("WC_PREVISTO", entity.getProductNumber());
            return;
        }

        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
