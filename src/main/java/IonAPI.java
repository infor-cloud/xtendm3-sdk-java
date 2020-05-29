import java.util.Map;

/**
 * API for ION calls
 *
 * @since API Version 0.6.0
 */
public interface IonAPI {

  /**
   * Perform a get request to an ION API
   *
   * @param url        ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers    Request headers
   * @param parameters Request parameters
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse get(String url, Map<String, String> headers, Map<String, String> parameters);

  /**
   * Perform a post request to an ION API
   *
   * @param url            ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers        Request headers
   * @param parameters     Request parameters
   * @param formParameters Request form parameters
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse post(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);

  /**
   * Perform a post request to an ION API
   *
   * @param url        ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers    Request headers
   * @param parameters Request parameters
   * @param body       Request body
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse post(String url, Map<String, String> headers, Map<String, String> parameters, String body);

  /**
   * Perform a put request to an ION API
   *
   * @param url            ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers        Request headers
   * @param parameters     Request parameters
   * @param formParameters Request form parameters
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse put(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);

  /**
   * Perform a put request to an ION API
   *
   * @param url        ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers    Request headers
   * @param parameters Request parameters
   * @param body       Request body
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse put(String url, Map<String, String> headers, Map<String, String> parameters, String body);

  /**
   * Perform a delete request to an ION API
   *
   * @param url        ION API api URL, tenant name is not needed in the URL. Can begin with '/' or without
   * @param headers    Request headers
   * @param parameters Request parameters
   * @return ION Response API
   * @since API Version 0.6.0
   */
  IonResponse delete(String url, Map<String, String> headers, Map<String, String> parameters);
}
