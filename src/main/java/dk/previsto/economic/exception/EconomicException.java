package dk.previsto.economic.exception;

public abstract class EconomicException extends RuntimeException {

    private String errorCode;
    private ExceptionMeta meta;
    
    public EconomicException(String message, String errorCode, ExceptionMeta meta) {
        super(message, null);
        this.errorCode = errorCode;
        this.meta = meta;
    }

    public EconomicException(String message, String errorCode, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
    }

    public EconomicException(String message) {
        super(message, null);
    }

    public EconomicException(String message, Throwable e) {
        super(message, e);
    }

    private static final long serialVersionUID = 1L;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ExceptionMeta getMeta() {
        return meta;
    }

    public void setMeta(ExceptionMeta meta) {
        this.meta = meta;
    }

}
