import java.util.Map;

/**
 * Response object returned from IonAPI
 *
 * @since API Version 0.6.0
 */
public interface IonResponse {

  /**
   * Get int value from status code
   *
   * @return Value of status code
   * @since API Version 0.6.0
   */
  int getStatusCode();

  /**
   * Get String value from the response
   *
   * @return Value of the reason phrase
   * @since API Version 0.6.0
   */
  String getReason();

  /**
   * Get headers from response
   *
   * @return Headers from response
   * @since API Version 0.6.0
   */
  Map<String, String> getHeaders();

  /**
   * Get content entity as string
   *
   * @return Content from response
   * @since API Version 0.6.0
   */
  String getContent();

  /**
   * Check if an internal error occurred when making a request
   *
   * @return {@code true} if error occurred
   * @since API Version 0.6.0
   */
  boolean getError();

  /**
   * Get error message if an error occurred
   *
   * @return Exception message
   * @since API Version 0.6.0
   */
  String getErrorMessage();
}
