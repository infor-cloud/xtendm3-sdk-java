/**
 * API for accessing database data container
 *
 * @param <T> Generic table
 * @since API Version 5.0
 */
public interface LockedResult<T> extends DBContainer<T> {

  /**
   * Update the database record
   *
   * @return {@code true} if record was updated
   * @since API Version 5.0
   */
  boolean update();

  /**
   * Delete the database record
   *
   * @return {@code true} if record was deleted
   * @since API Version 5.0
   */
  boolean delete();
}
