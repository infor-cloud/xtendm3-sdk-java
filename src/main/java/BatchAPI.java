/**
 * API for batch
 *
 * @since API Version 0.23
 */
public interface BatchAPI {

  /**
   * Get batch job id
   *
   * @return batch job id
   * @since API Version 0.23
   */
  String getJobId();

  /**
   * Get batch reference id
   *
   * @return batch job reference id
   * @since API Version 0.23
   */
  String getReferenceId();
}
