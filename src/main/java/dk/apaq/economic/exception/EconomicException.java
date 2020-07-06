package dk.apaq.economic.exception;

public abstract class EconomicException extends RuntimeException {

    private String httpStatusCode;
    private String developerHint;

    public EconomicException(String message, String httpStatusCode, String developerHint) {
        super(message, null);
        this.httpStatusCode = httpStatusCode;
        this.developerHint = developerHint;
    }

    public EconomicException(String message, String httpStatusCode, String developerHint, Throwable e) {
        super(message, e);
        this.httpStatusCode = httpStatusCode;
        this.developerHint = developerHint;
    }

    public EconomicException(String message) {
        super(message, null);
    }

    public EconomicException(String message, Throwable e) {
        super(message, e);
    }

    private static final long serialVersionUID = 1L;

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getDeveloperHint() {
        return developerHint;
    }

    public void setDeveloperHint(String developerHint) {
        this.developerHint = developerHint;
    }
}
