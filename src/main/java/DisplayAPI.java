import java.util.Map;

public interface DisplayAPI {
    Map<Object, Object> getFields();
    void setFocus(String fieldName);
}
