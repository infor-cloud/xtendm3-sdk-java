import java.util.List;

/**
 * API for retrieving messages
 * @since API Version 0.19.0
 */
public interface MessageAPI {

  /**
   * Retrieves message
   * @param sysComp System component
   * @param language Lang code(e.g. GB, SE)
   * @param messageId The message id in the message file
   * @param parameters Parameters to insert in the message, the database only supports up to 4 parameters
   * @return String message
   * @since API Version 0.19.0
   */
  String getMessage(String sysComp, String language, String messageId, List<String> parameters);

  /**
   * Retrieves message with language and system component from current job context
   * @param messageId The message id in the message file
   * @param parameters Parameters to insert in the message, the database only support up to 4 parameters
   * @return String message
   * @since API Version 0.19.0
   */
  String getMessage(String messageId, List<String> parameters);
}