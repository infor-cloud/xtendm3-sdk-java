import java.util.Map;

/**
 * General API for program, contains API Indicator and MICaller
 *
 * @since API Version 1.0
 */
public interface ProgramAPI {

  /**
   * Get indicator API
   *
   * @return Indicator API
   * @since API Version 1.0
   */
  IndicatorAPI getIndicator();

  /**
   * Get LDAZD variables map
   *
   * @return LDAZD variables map
   * @since API Version 1.0
   */
  ReadOnlyMap<Object, Object> getLDAZD();

  /**
   * Get LDAZZ variables map
   *
   * @return LDAZZ variables map
   * @since API Version 1.0
   */
  ReadOnlyMap<Object, Object> getLDAZZ();

  /**
   * Checks if given program is in the current call stack
   *
   * @param program Name of program
   * @return {@code true} if the program exists
   * @since API Version 1.0
   */
  boolean existsInCallStack(String program);

  /**
   * Gets the name of the current program
   *
   * @return Name of the current program
   * @since API Version 1.0
   */
  String getProgramName();

  /**
   * Gets the type of the current program (MI, BATCH, INTERACTIVE, CL, PRINT, UNKNOWN)
   *
   * @return Program type
   * @since API Version 1.0
   */
  String getProgramType();

  /**
   * Gets the current job number
   *
   * @return Current job number
   * @since API Version 1.0
   */
  String getJobNumber();

  /**
   * Gets the current M3user
   *
   * @return Current M3user
   * @since API Version 1.0
   */
  String getUser();

  /**
   * Gets the number of input parameters
   *
   * @return Number of input parameters
   * @since API Version 1.0
   */
  int getNumberOfInputParameters();

  /**
   * Checks if shutdown is in progress
   *
   * @return {@code true} if shutdown is in progress
   * @since API Version 1.0
   */
  boolean isShutdownInProgress();

  /**
   * Gets the current tenant id
   *
   * @return Current tenant id
   * @since API Version 1.0
   */
  String getTenantId();

  /**
   * Gets the values of a MDB table
   *
   * @param tableName Name of MDB table
   * @param lf        Logic file name
   * @return Map containing the values, {@code null} if error occurs
   * @since API Version 1.0
   */
  Map<String, String> getTable(String tableName, String lf);

  /**
   * Gets the values of a MDB table, eqvivalent to getTable(tableName, 'RR');
   *
   * @param tableName Name of MDB table
   * @return Map containing the values, {@code null} if error occurs
   * @since API Version 1.0
   */
  Map<String, String> getTable(String tableName);

  /**
   * Checks if the exit flag is active
   *
   * @return {@code true} of exit flag is active
   * @since API Version 1.0
   */
  boolean exitFlag();

  /**
   * Checks if the error flag is true (alternative to Program.indicator.get(60))
   *
   * @return Value of error flag
   * @since API Version 1.0
   */
  boolean existsError();

  /**
   * Gets message id
   *
   * @return Message ID
   * @since API Version 1.0
   */
  String getMessageId();

  /**
   * Gets message data
   *
   * @return Message data
   * @since API Version 1.0
   */
  String getMessageData();

  /**
   * Gets message
   *
   * @return Message
   * @since API Version 1.0
   */
  String getMessage();
}
