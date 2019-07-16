import java.util.Map;

public interface ProgramAPI {
    IndicatorAPI getIndicator();
    Map<Object, Object> getLDAZD();
    Map<Object, Object> getLDAZZ();
    boolean existsInCallStack(String program);
    String getProgramName();
    String getProgramType();
    String getJobNumber();
    String getUser();
    int getNumberOfInputParameters();
    boolean isShutdownInProgress();
    String getTenantId();
    Map<String, String> getTable(String tableName, String lf);
    Map<String, String> getTable(String tableName);
    boolean exitFlag();
    boolean existsError();
    String getMessageId();
    String getMessageData();
    String getMessage();
}
