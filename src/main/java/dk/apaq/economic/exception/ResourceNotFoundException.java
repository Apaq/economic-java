package dk.apaq.economic.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceNotFoundException extends EconomicException {
    
    @JsonCreator
    public ResourceNotFoundException(@JsonProperty(value = "httpStatusCode") String httpStatusCode, @JsonProperty(value = "message") String message, @JsonProperty("developerHint") String developerHint) {
        super(message, httpStatusCode, developerHint);
    }

}
