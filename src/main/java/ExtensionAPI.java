/**
 * API for Extension
 *
 * @since API Version 0.1.0
 */
public interface ExtensionAPI {

  /**
   * Get Extension name
   *
   * @return Extension name
   * @since API Version 0.1.0
   */
  String getName();

  /**
   * Get Extension creator
   *
   * @return Extension creator user id
   * @since API Version 0.1.0
   */
  String getCreator();

  /**
   * Get last modified by
   *
   * @return Last modified by user id
   * @since API Version 0.1.0
   */
  String getLastModifiedBy();
}
