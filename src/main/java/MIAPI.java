/**
 * API for performing MI actions in a Transaction
 * @since API Version 0.9.0
 */
public interface MIAPI {

  /**
   * Get out data
   * @return Out data
   * @since API Version 0.9.0
   */
  MiOutDataAPI getOutData();

  /**
   * Get in data
   * @return In data
   * @since API Version 0.9.0
   */
  MiInDataAPI getInData();

  /**
   * Write response from data present in outData.
   * This will clear all values in outData.
   * Single transactions will refuse to write multiple times.
   * @since API Version 0.9.0
   */
  void write();

  /**
   * Write error response.
   * The transaction is unable to write responses after calling this method.
   * @param errorMessage error message to display (only supports 240 characters)
   * @since API Version 0.9.0
   */
  void error(String errorMessage);

  /**
   * Write error response.
   * The transaction is unable to write responses after calling this method.
   * @param errorMessage error message to display (only supports 240 characters)
   * @param field field error occurred for (only supports 10 characters)
   * @param errorCode code for error which occurred (only supports 2 characters)
   * @since API Version 0.9.0
   */
  void error(String errorMessage, String field, String errorCode);
}
