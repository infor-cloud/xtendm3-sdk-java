/**
 * API for database access
 *
 * @param <T> Generic table
 * @since API Version 0.5.0
 */
public interface DatabaseAPI<T> {

  /**
   * Set index sort order when creating a database action. Default is the unique index.
   *
   * @param lf Name of index to access
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  DatabaseAPI<T> index(String lf);

  /**
   * Set the table name, when creating a database action
   *
   * @param table Name of database table to access
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  DatabaseAPI<T> table(String table);

  /**
   * Select columns from table, when creating a database action
   *
   * @param columns The column names to return
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  DatabaseAPI<T> selection(String... columns);

  /**
   * Select all columns from table, when creating a database action
   * @return Self reference, builder
   * @since API Version 0.8.0
   */
  DatabaseAPI<T> selectAllFields();

  /**
   * Set match expression, when creating a database action
   *
   * @param exp The expression to match
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  DatabaseAPI<T> matching(ExpressionFactory exp);

  /**
   * Create a DBAction
   *
   * @return DBAction
   * @since API Version 0.5.0
   */
  DBAction<T> build();

  /**
   * Create an ExpressionFactory
   *
   * @param table The table to match the expression against
   * @return An ExpressionFactory to create Expressions used in DBAction.matching(...)
   * @since API Version 0.5.0
   */
  ExpressionFactory getExpressionFactory(String table);

  /**
   * Create a new database container
   *
   * @param table The name of the database table
   * @return New container for table
   * @since API Version 0.5.0
   */
  DBContainer<T> createContainer(String table);

  /**
   * Get a database container with current state
   *
   * @param table The name of the database table
   * @return Container with current state
   * @since API Version 0.5.0
   */
  DBContainer<T> getContainer(String table);
}
