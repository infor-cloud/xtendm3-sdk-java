/**
 * API for creating Expressions used for Database.matching(...)
 *
 * @since API Version 5.0
 */
public interface ExpressionFactoryAPI {

  /**
   * Equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ equals value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI eq(String columnName, String value);

  /**
   * Greater than
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is greater than value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI gt(String columnName, String value);

  /**
   * Less than
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is less than value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI lt(String columnName, String value);

  /**
   * Greater than or equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is greater than or equals to value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI ge(String columnName, String value);

  /**
   * Less than or equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is less than or equals to value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI le(String columnName, String value);

  /**
   * Not equal
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is not equal to value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI ne(String columnName, String value);

  /**
   * Like
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is LIKE value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI like(String columnName, String value);

  /**
   * Between
   *
   * @param columnName Name of the column
   * @param fromValue  _columnName_ is greater than value
   * @param toValue    _columnName_ is less than value
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI between(String columnName, String fromValue, String toValue);

  /**
   * In
   *
   * @param columnName Name of the column
   * @param value      _columnName_ is equal to any values
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI in(String columnName, String... value);

  /**
   * And
   *
   * @param rightExp The expression to 'and'
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI and(ExpressionFactoryAPI rightExp);

  /**
   * Or
   *
   * @param rightExp The expression to 'or'
   * @return Self reference, builder
   * @since API Version 5.0
   */
  ExpressionFactoryAPI or(ExpressionFactoryAPI rightExp);

  /**
   * Get expression from ExpressionFactory
   *
   * @return Expression
   * @since API Version 5.0
   */
  Expression getExpression();
}
