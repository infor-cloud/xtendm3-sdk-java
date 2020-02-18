/**
 * API for Interactive programs, contains API Display
 *
 * @since API Version 1.0
 */
public interface InteractiveAPI {

  /**
   * Get display API
   *
   * @return Display API
   * @since API Version 1.0
   */
  DisplayAPI getDisplay();

  /**
   * Show message for user
   *
   * @param messageId ID of message to show
   * @since API Version 1.0
   */
  void showInfo(String messageId);

  /**
   * Show message for
   *
   * @param messageId   ID of message to show
   * @param messageData Data for the given message
   * @since API Version 1.0
   */
  void showInfo(String messageId, String messageData);

  /**
   * Show custom message for user
   *
   * @param message Message to show
   * @since API Version 1.0
   */
  void showCustomInfo(String message);

  /**
   * Show message for user, set focus on given field and flag program error occurred
   *
   * @param fieldName   Name of field to focus
   * @param messageId   ID for message to show
   * @param messageData Data for the given message
   * @since API Version 1.0
   */
  void showError(String fieldName, String messageId, String messageData);

  /**
   * Show message for user, set focus on given field and flag program error occurred
   *
   * @param fieldName Name of field to focus
   * @param messageId ID for message to show
   * @since API Version 1.0
   */
  void showError(String fieldName, String messageId);

  /**
   * Show custom message for user, set focus on given field and flag program error occurred
   *
   * @param fieldName Name of field to focus
   * @param message   Message to show
   * @since API Version 1.0
   */
  void showCustomError(String fieldName, String message);

  /**
   * Returns string describing the current mode, possible modes: 'add', 'change', 'copy', 'delete', 'unknown'
   *
   * @return Name of current mode
   * @since API Version 1.0
   */
  String getMode();

  /**
   * Value not accessible, will always return empty string
   *
   * @return Selected option
   * @since API Version 10.0
   * @deprecated Deprecated since API Version 10.0
   */
  String getSelectedListOption();

  /**
   * Show dialog with 'Ok' and 'Cancel' buttons. If user does not click 'Ok' the program will be flagged for error.
   * This method is intended for use during PRE PxCHK
   *
   * @param message Message to display
   * @since API Version 4.0
   */
  void showWarningDialog(String message);

  /**
   * Show dialog with 'Ok' button
   *
   * @param message message to display
   * @return {@code true} if 'Ok' was pressed, otherwise {@code false}
   * @since API Version 4.0
   */
  boolean showOkDialog(String message);

  /**
   * Show dialog with 'Ok' and 'Cancel' buttons
   *
   * @param message Message to display
   * @return {@code true} if 'Ok' was pressed, otherwise {@code false}
   * @since API Version 4.0
   */
  boolean showOkCancelDialog(String message);

  /**
   * Show dialog with 'Yes' and 'No' buttons
   *
   * @param message Message to display
   * @return {@code true} if 'Yes' was pressed, otherwise {@code false}
   * @since API Version 4.0
   */
  boolean showYesNoDialog(String message);
}
