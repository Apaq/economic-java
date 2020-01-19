package dk.previsto.economic.repository;

import dk.previsto.economic.model.BookedInvoice;
import dk.previsto.economic.model.DraftInvoice;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class BookedInvoiceResourceTest extends ResourceTestBase<BookedInvoice> {

    public BookedInvoiceResourceTest() {
        super(new BookedInvoiceResource(buildRestTemplate(), "http://server/Api"), BookedInvoice.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("bookedinvoices_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("bookedinvoices_list.json"), MediaType.APPLICATION_JSON);
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
    protected void doCheckEntity(BookedInvoice entity) {
        if ("10002".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2011-10-31"), entity.getDate());
            //assertEquals(InvoiceState.Approved, entity.getState());
            return;
        }

        if ("10001".equals(entity.getId())) {
            assertEquals(LocalDate.parse("2011-10-10"), entity.getDate());
            //assertEquals(InvoiceState.Draft, entity.getState());
            return;
        }

        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
