package dk.previsto.economic.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiException extends EconomicException {

    @JsonCreator
    public ApiException(@JsonProperty(value = "httpStatusCode") String httpStatusCode, @JsonProperty(value = "message") String message, @JsonProperty("developerHint") String developerHint) {
        super(message, httpStatusCode, developerHint);
    }
    
    private static final long serialVersionUID = 1L;

}
