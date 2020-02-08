/**
 * API to execute Utilities
 *
 * @since API Version 7.0
 */
public interface UtilityAPI {

  /**
   * Calls method in a utility
   * @param utility name of utility to call method on (must be a string literal)
   * @param method method to call
   * @param arguments arguments call the method with
   * @return returns value returned from utility if applicable, otherwise void
   * @since API Version 7.0
   */
  Object call(String utility, String method, Object... arguments);
}
