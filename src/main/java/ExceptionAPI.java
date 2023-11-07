/**
 * API containing exceptions to be thrown from extensions. All exceptions can be thrown with throw-statements as well. Calls their corresponding API method upon termination.
 * @since API Version 0.24.0
 */
public interface ExceptionAPI {
  
  /**
   * Show dialog with 'Ok' button. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param message message to display
   * @since API Version 0.24.0
   */
  void throwShowOkDialogException(String message);

  /**
   * Show dialog with 'Ok' and 'Cancel' buttons. If user does not click 'Ok' the program will be flagged for error. This method is intended for use during PRE PxCHK. Throws an exception. The corresponding action will be taken once the extension has terminated. 
   * @param message message to display
   * @since API Version 0.24.0
   */
  void throwShowWarningDialogException(String message);

  /**
   * Show custom message for user. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param message message to show
   * @since API Version 0.24.0
   */
  void throwShowCustomInfoException(String message);

  /**
   * Show message for user. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param messageId ID of message to show
   * @since API Version 0.24.0
   */
  void throwShowInfoException(String messageId);

  /**
   * Show message for user. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param messageId ID of message to show
   * @param messageData data for the given message
   * @since API Version 0.24.0
   */
  void throwShowInfoException(String messageId, String messageData);

  /**
   * Show custom message for user, set focus on given field and flag program for error. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param field name of field to focus
   * @param message message to show
   * @since API Version 0.24.0
   */
  void throwShowCustomErrorException(String field, String message);

  /**
   * Show message for user, set focus on given field and flag program for error. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param messageId ID for message to show
   * @param field name of field to focus
   * @since API Version 0.24.0
   */
  void throwShowErrorException(String messageId, String field);

  /**
   * Show message for user, set focus on given field and flag program for error. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param field name of field to focus
   * @param messageId ID for message to show
   * @param messageData data for the given message
   * @since API Version 0.24.0
   */
  void throwShowErrorException(String field, String messageId, String messageData);

  /**
   * Write error response. The transaction is unable to write responses after calling this method. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param message error message to display (only supports 240 characters)
   * @param field field error occurred for (only supports 10 characters)
   * @param errorCode code for error which occurred (only supports 2 characters)
   * @since API Version 0.24.0
   */
  void throwErrorMIResponseException(String message, String field, String errorCode);

  /**
   * Write error response. The transaction is unable to write responses after calling this method. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param message error message to display (only supports 240 characters)
   * @since API Version 0.24.0
   */
  void throwErrorMIResponseException(String message);

  /**
   * Depending on context: Show dialog in interactive programs. Write error repsonse in MI programs. Otherwise create a log entry. Throws an exception. The corresponding action will be taken once the extension has terminated.
   * @param message error message to display (only supports 240 characters when called from an MI program)
   * @since API Version 0.24.0
   */
  void throwAdaptiveShortCircuitException(String message);
}