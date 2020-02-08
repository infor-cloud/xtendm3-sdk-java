public class FileUtilException extends Exception {
  private static final long serialVersionUID = 1L;
  private final FileUtilError errorType;

  public FileUtilException(FileUtilError errorType, String message) {
    super(message);
    this.errorType = errorType;
  }

  public FileUtilException(FileUtilError errorType, String message, Throwable t) {
    super(message, t);
    this.errorType = errorType;
  }

  public FileUtilError getErrorType() {
    return errorType;
  }

  @Override
  public String getMessage() {
    return errorType + ": " + super.getMessage();
  }
}

