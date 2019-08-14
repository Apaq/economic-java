package dk.previsto.economic;

import com.fasterxml.jackson.databind.ObjectMapper;
import dk.previsto.economic.exception.ApiException;
import dk.previsto.economic.exception.AuthenticationException;
import dk.previsto.economic.exception.RequestException;
import dk.previsto.economic.exception.UnknownException;
import dk.previsto.economic.exception.EconomicException;
import dk.previsto.economic.exception.ResourceNotFoundException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class ErrorHandler implements ResponseErrorHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getRawStatusCode() >= 300;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        Class<? extends EconomicException> clazz;

        if (response.getRawStatusCode() >= 500) {
            clazz = ApiException.class;
        } else if (response.getRawStatusCode() == 401 || response.getRawStatusCode() == 403) {
            clazz = AuthenticationException.class;
        } else if (response.getRawStatusCode() == 404) {
            clazz = ResourceNotFoundException.class;
        } else {
            clazz = RequestException.class;
        }

        String content = IOUtils.toString(response.getBody());
        EconomicException ex;
        try {
            ex = objectMapper.readValue(content, clazz);
        }
        catch (Throwable t) {
            ex = objectMapper.readValue(content, UnknownException.class);
        }
        throw ex;
    }

}
