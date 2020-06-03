package dk.previsto.economic.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dk.previsto.economic.model.DraftInvoice;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class DraftInvoiceResourceTest extends ResourceTestBase<DraftInvoice> {

    public DraftInvoiceResourceTest() {
        super(new DraftInvoiceResource(buildRestTemplate(), "http://server/Api"), DraftInvoice.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("draftinvoices_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("draftinvoices_list.json"), MediaType.APPLICATION_JSON);
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
        return "123";
    }
    
    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        List<RequestMatcher> matchers = new ArrayList<>();
        matchers.add(jsonPath("$.invoice.isPaid").doesNotExist());
        matchers.add(jsonPath("$.invoice.paymentTermsDays").doesNotExist());
        matchers.add(jsonPath("$.invoice.paymentTermsMode").doesNotExist());
        return matchers;
    }

    @Override
    protected void doCheckEntity(DraftInvoice entity) {
        if ("35183".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2019-02-11"), entity.getDate());
            assertFalse(entity.getLines().isEmpty());
            return;
        }

        if ("35199".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2019-02-12"), entity.getDate());
            assertFalse(entity.getLines().isEmpty());
            return;
        }

        if ("35200".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2019-02-12"), entity.getDate());
            assertFalse(entity.getLines().isEmpty());
            return;
        }
        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
