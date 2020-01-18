package dk.previsto.economic.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dk.previsto.economic.model.DraftInvoice;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import static org.junit.Assert.assertEquals;
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
        return "cSHBqWWITexZvQy29lqpYg";
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
        if ("UdsHDvAESV2eCZHSCYOfzA".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2016-12-23T08:18:20"), entity.getDate());
            //assertEquals(InvoiceState.Approved, entity.getState());
            return;
        }

        if ("cSHBqWWITexZvQy29lqpYg".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-12-23T08:16:46"), entity.getDate());
            //assertEquals(InvoiceState.Draft, entity.getState());
            return;
        }

        if ("o9bpexuzTb25IfEgW7E1Wg".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-12-23T08:13:48"), entity.getDate());
            //assertEquals(InvoiceState.Approved, entity.getState());
            return;
        }
        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
