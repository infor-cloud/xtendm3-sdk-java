import java.util.Set;

public interface DBContainerAPI<T> {
    Object get(String columnName);
    int getInt(String columnName);
    double getDouble(String columnName);
    long getLong(String columnName);
    String getString(String columnName);
    int getChar(String columnName);
    void set(String columnName, Object value);
    void setInt(String columnName, int value);
    void setDouble(String columnName, double value);
    void setLong(String columnName, long value);
    void setString(String columnName, String value);
    void setChar(String columnName, String value);
    boolean isSet(String columnName);
    boolean isNull(String columnName);
    DBContainerAPI createCopy();
    Set<String> getAllColumns();
    void clear(String columnName);
    ExpressionFactoryAPI getExpressionFactory();
}
