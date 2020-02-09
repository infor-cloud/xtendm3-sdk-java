import java.util.Set;

/**
 * API for accessing datasbase data container
 *
 * @param <T> Generic table
 * @since API Version 5.0
 */
public interface DBContainer<T> {

  /**
   * Get value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  Object get(String columnName);

  /**
   * Get int value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  int getInt(String columnName);

  /**
   * Get double value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  double getDouble(String columnName);

  /**
   * Get long value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  long getLong(String columnName);

  /**
   * Get String value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  String getString(String columnName);

  /**
   * Get char value from a database container
   *
   * @param columnName Name of the column
   * @return Value of column
   * @since API Version 5.0
   */
  int getChar(String columnName);

  /**
   * Set value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void set(String columnName, Object value);

  /**
   * Set int value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void setInt(String columnName, int value);

  /**
   * Set double value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void setDouble(String columnName, double value);

  /**
   * Set long value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void setLong(String columnName, long value);

  /**
   * Set string value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void setString(String columnName, String value);

  /**
   * Set char value in the database container
   *
   * @param columnName Name of the column
   * @param value      Value of column
   * @since API Version 5.0
   */
  void setChar(String columnName, String value);

  /**
   * Check if value is set in the database container
   *
   * @param columnName Name of the column
   * @return {@code true} if value is set
   * @since API Version 5.0
   */
  boolean isSet(String columnName);

  /**
   * Check if value is set to null in the database container
   *
   * @param columnName Name of the column
   * @return {@code true} if value is {@code null}
   * @since API Version 5.0
   */
  boolean isNull(String columnName);

  /**
   * Create a copy of the database container
   *
   * @return A copy of current DBContainer
   * @since API Version 5.0
   */
  DBContainer createCopy();

  /**
   * Get all columns that is set in the database container
   *
   * @return A set of all columns that is set in the DBContainer
   * @since API Version 5.0
   */
  Set<String> getAllColumns();

  /**
   * Clear a field in the DBContainer
   *
   * @param columnName Name of the column
   * @since API Version 5.0
   */
  void clear(String columnName);

  /**
   * Create an ExpressionFactory
   *
   * @return An ExpressionFactory to create Expressions used in DBAction.matching(...)
   * @since API Version 5.0
   */
  ExpressionFactory getExpressionFactory();
}
