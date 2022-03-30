/**
 * API to work with running Batch extensions
 */
public interface BatchAPI {

  /**
   * Get batch job id
   * @return job id
   */
  Integer getJobId();

  /**
   * Get reference id, batch job id as string
   * @return job reference id
   */
  String getReferenceId();
}
