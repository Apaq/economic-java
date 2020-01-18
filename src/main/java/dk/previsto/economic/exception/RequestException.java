package dk.previsto.economic.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestException extends EconomicException {

    private Map<String, Object> validationErrors = null;
    
    @JsonCreator
    public RequestException(@JsonProperty(value = "httpStatusCode") String httpStatusCode, @JsonProperty(value = "message") String message, @JsonProperty("developerHint") String developerHint) {
        super(message, httpStatusCode, developerHint);
    }

    public RequestException(String message) {
        super(message);
    }

    public Map<String, Object> getValidationErrors() {
        return validationErrors;
    }

    private static final long serialVersionUID = 1L;

    
}
