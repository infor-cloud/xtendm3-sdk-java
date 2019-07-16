import java.util.Map;

public interface IonAPI {
    IonResponseAPI get(String url, Map<String, String> headers, Map<String, String> parameters);
    IonResponseAPI post(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);
    IonResponseAPI post(String url, Map<String, String> headers, Map<String, String> parameters, String body);
    IonResponseAPI put(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, String> formParameters);
    IonResponseAPI put(String url, Map<String, String> headers, Map<String, String> parameters, String body);
    IonResponseAPI delete(String url, Map<String, String> headers, Map<String, String> parameters);
}
