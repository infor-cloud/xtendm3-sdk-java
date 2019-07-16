import java.util.Map;

public interface IonResponseAPI {
    int getStatusCode();
    Map<String, String> getHeaders();
    String getReason();
    boolean getError();
    String getErrorMessage();
    String getContent();
}
