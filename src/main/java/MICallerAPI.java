import groovy.lang.Closure;

import java.util.Map;

/**
 * API for MI calls
 *
 * @since API Version 1.0
 */
public interface MICallerAPI {

  /**
   * Performs MI transaction, if an error occurs the callback will recieve a map with keys 'error', 'errorMsid' and 'errorMessage'
   *
   * @param program     Program name
   * @param transaction Transaction name
   * @param callback    Callback function
   * @since API Version 1.0
   */
  void call(String program, String transaction, Closure<?> callback);

  /**
   * Performs MI transaction for the given parameters map, if an error occurs the callback will recieve a map with keys 'error', 'errorMsid' and 'errorMessage'
   *
   * @param program     Program name
   * @param transaction Transaction name
   * @param parameters  Parameter map
   * @param callback    Callback function
   * @since API Version 1.0
   */
  void call(String program, String transaction, Map<String, String> parameters, Closure<?> callback);
}
