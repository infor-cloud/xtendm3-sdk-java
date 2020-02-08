import java.util.Map;

/**
 * API for ION calls
 *
 * @since API Version 6.0
 */
public interface IonAPI {

  /**
   * Perform a get request to an ION API
   *
   * @param url        ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers    Request headers
   * @param parameters Request parameters
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI get(String url, Map<String, String> headers, Map<String, String> parameters);

  /**
   * Perform a post request to an ION API
   *
   * @param url            ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers        Request headers
   * @param parameters     Request parameters
   * @param formParameters Request form parameters
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI post(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);

  /**
   * Perform a post request to an ION API
   *
   * @param url        ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers    Request headers
   * @param parameters Request parameters
   * @param body       Request body
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI post(String url, Map<String, String> headers, Map<String, String> parameters, String body);

  /**
   * Perform a put request to an ION API
   *
   * @param url            ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers        Request headers
   * @param parameters     Request parameters
   * @param formParameters Request form parameters
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI put(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);

  /**
   * Perform a put request to an ION API
   *
   * @param url        ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers    Request headers
   * @param parameters Request parameters
   * @param body       Request body
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI put(String url, Map<String, String> headers, Map<String, String> parameters, String body);

  /**
   * Perform a delete request to an ION API
   *
   * @param url        ION API Url starting with a slash and tenant name e.g. '/ACMECORP_PRD/xxxxx'
   * @param headers    Request headers
   * @param parameters Request parameters
   * @return ION Response API
   * @since API Version 6.0
   */
  IonResponseAPI delete(String url, Map<String, String> headers, Map<String, String> parameters);
}
