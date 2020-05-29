import java.util.Map;

/**
 * API for session
 *
 * @since API Version 0.2.0
 */
public interface SessionAPI {

  /**
   * Get session parameters
   *
   * @return Map of session parameters
   * @since API Version 0.2.0
   */
  Map<String, Object> getParameters();
}
