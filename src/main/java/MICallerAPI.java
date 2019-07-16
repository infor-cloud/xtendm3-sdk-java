import groovy.lang.Closure;

import java.util.Map;

public interface MICallerAPI {
    void call(String program, String transaction, Closure<?> callback);
    void call(String program, String transaction, Map<String, String> parameters, Closure<?> callback);
}
