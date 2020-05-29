import java.util.Map;

/**
 * API for Display in Interactive
 *
 * @since API Version 0.1.0
 */
public interface DisplayAPI {

  /**
   * Retrieve display fields as map
   *
   * @return Map containing all available fields for the current display
   * @since API Version 0.1.0
   */
  Map<Object, Object> getFields();

  /**
   * Set focus on a display field
   *
   * @param fieldName Name of field to focus
   * @since API Version 0.1.0
   */
  void setFocus(String fieldName);
}
