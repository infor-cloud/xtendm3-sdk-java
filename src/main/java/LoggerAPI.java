public interface LoggerAPI {
    void warning(String message);
    void error(String message);
    void info(String message);
    void trace(String message);
    void debug(String message);
}
