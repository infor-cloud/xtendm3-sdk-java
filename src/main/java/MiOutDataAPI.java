/**
 * Container for OutData values for Transactions
 *
 * @since API Version 0.9.0
 */
public interface MiOutDataAPI {

  /**
   * Put value of field into container. Alternative to
   * <pre>MI.outData.key = value;</pre>
   * @param key name of field
   * @param value value of field as string
   * @return Previous value associated with field
   * @since API Version 0.9.0
   */
  @SuppressWarnings("unused")
  String put(String key, String value);
}
