/**
 * Container for InData values for Transactions
 *
 * @since API Version 0.9.0
 */
public interface MiInDataAPI {

  /**
   * Gets value from data container.Alternative to
   * <pre>MI.inData.key</pre>
   * @param key name of field
   * @return Value associated with field
   * @since API Version 0.9.0
   */
  String get(String key);
}
