/**
 * API for logging messages
 *
 * @since API Version 0.1.0
 */
public interface LoggerAPI {

  /**
   * Logs warning messages
   *
   * @param message message to log
   * @since API Version 0.1.0
   */
  void warning(String message);

  /**
   * Logs error messages
   *
   * @param message message to log
   * @since API Version 0.1.0
   */
  void error(String message);

  /**
   * Logs info messages
   *
   * @param message message to log
   * @since API Version 0.1.0
   */
  void info(String message);

  /**
   * Logs trace messages
   *
   * @param message message to log
   * @since API Version 0.1.0
   */
  void trace(String message);

  /**
   * Logs debug messages
   *
   * @param message message to log
   * @since API Version 0.1.0
   */
  void debug(String message);
}
