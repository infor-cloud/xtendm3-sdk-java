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

  /**
   * Get container for In values for Transactions. Contained values are already converted to the proper type
   * @return Container
   * @since 0.15.0
   */
  ReadOnlyMap<String, Object> getIn();

  /**
   * Returns the max amount of records allowed to be written by the transaction
   *
   * @return Max records
   * @since 0.16.0
   */
  int getMaxRecords();

  /**
   * Returns the remaining amount of records allowed to be written by the current transaction
   *
   * @return Remaining records
   * @since 0.16.0
   */
  int getRemainingRecords();

  /**
   * Checks if the current transaction can still write additional records
   *
   * @return {@code true} if more records can be written, false if max records has been reached
   * @since 0.16.0
   */
  boolean hasRemainingRecords();

  /**
   * Returns the current date format. Possible formats: YMD8, YMD6, MDY6, DMY6, YWD5
   *
   * @return Ddate format
   * @since 0.16.0
   */
  String getDateFormat();

  /**
   * Returns the current date separator
   *
   * @return Date separator
   * @since 0.16.0
   */
  char getDateSeparator();
}
