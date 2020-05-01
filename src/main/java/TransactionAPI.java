import java.util.Map;

/**
 * API for extending MI transactions
 * @since API Version 12.0
 */
public interface TransactionAPI {

  /**
   * Get transaction parameters
   * @return transaction parameters
   * @since API Version 12.0
   */
  Map<String, String> getParameters();

  /**
   * Abort the current transaction
   * @param field Error Field
   * @param messageId Error message ID
   * @param data Error message data
   * @since API Version 12.0
   */
  void abortTransaction(String field, String messageId, String data);
}
