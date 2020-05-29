/**
 * API for creating Expressions used for Database.matching(...)
 *
 * @since API Version 0.5.0
 */
public interface ExpressionFactory {

  /**
   * Equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ equals value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory eq(String columnName, String value);

  /**
   * Greater than
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is greater than value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory gt(String columnName, String value);

  /**
   * Less than
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is less than value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory lt(String columnName, String value);

  /**
   * Greater than or equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is greater than or equals to value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory ge(String columnName, String value);

  /**
   * Less than or equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is less than or equals to value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory le(String columnName, String value);

  /**
   * Not equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is not equal to value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory ne(String columnName, String value);

  /**
   * Like
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is LIKE value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory like(String columnName, String value);

  /**
   * Between
   *
   * @param columnName Name of the column
   * @param fromValue  _columnName_ is greater than value
   * @param toValue    _columnName_ is less than value
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory between(String columnName, String fromValue, String toValue);

  /**
   * In
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is equal to any values
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory in(String columnName, String... value);

  /**
   * And
   *
   * @param rightExp The expression to 'and'
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory and(ExpressionFactory rightExp);

  /**
   * Or
   *
   * @param rightExp The expression to 'or'
   * @return Self reference, builder
   * @since API Version 0.5.0
   */
  ExpressionFactory or(ExpressionFactory rightExp);

  /**
   * Get expression from ExpressionFactory
   *
   * @return Expression
   * @since API Version 0.5.0
   */
  Expression getExpression();
}
