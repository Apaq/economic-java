package dk.previsto.economic.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourceNotFoundException extends EconomicException {
    
    @JsonCreator
    public ResourceNotFoundException(@JsonProperty(value = "errorCode") String errorCode, @JsonProperty(value = "errorMessage") String errorMessage, @JsonProperty("helpUrl") String helpUrl, @JsonProperty("meta") ExceptionMeta meta) {
        super(errorMessage, errorCode, meta);
    }
    
}
