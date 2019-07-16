interface ExpressionFactoryAPI {
    ExpressionFactoryAPI eq(String columnName, String value)
    ExpressionFactoryAPI gt(String columnName, String value)
    ExpressionFactoryAPI lt(String columnName, String value)
    ExpressionFactoryAPI ge(String columnName, String value)
    ExpressionFactoryAPI le(String columnName, String value)
    ExpressionFactoryAPI ne(String columnName, String value)
    ExpressionFactoryAPI like(String columnName, String value)
    ExpressionFactoryAPI between(String columnName, String fromValue, String toValue)
    ExpressionFactoryAPI and(ExpressionFactoryAPI rightExp)
    ExpressionFactoryAPI or(ExpressionFactoryAPI rightExp)
    Expression getExpression()
}
