interface DatabaseAPI<T> {
    DatabaseAPI<T> index(String lf)
    DatabaseAPI<T> table(String table)
    DatabaseAPI<T> selection(String... columns)
    DatabaseAPI<T> matching(ExpressionFactoryAPI exp)
    DBActionAPI<T> build()
    ExpressionFactoryAPI getExpressionFactory(String table)
    DBContainerAPI createContainer(String table)
    DBContainerAPI getContainer(String table)
}
