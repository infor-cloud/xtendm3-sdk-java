/**
 * API for indicator access
 *
 * @since API Version 1.0
 */
public interface IndicatorAPI {

  /**
   * Getter for indicator
   *
   * @param indicatorNumber Number of the indicator to get
   * @return Value of indicator
   * @since API Version 1.0
   */
  boolean get(int indicatorNumber);
}
