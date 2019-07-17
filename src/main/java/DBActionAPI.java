import groovy.lang.Closure;

/**
 * Action API for database access
 *
 * @param <T> Generic table
 * @since API Version 5.0
 */
public interface DBActionAPI<T> {

  /**
   * Read a record in the database, matching the keys in the container
   *
   * @param container The container filled with values from read record
   * @return {@code true} if a record is found
   * @since API Version 5.0
   */
  boolean read(DBContainerAPI container);

  /**
   * Lock a record in the database, matching the keys in the container and execute the callback method if the record exists
   *
   * @param container The container filled with values from read record
   * @param callback  A defined Closure method to call for the locked record in database, matching the container key
   * @return {@code true} if a record is found
   * @since API Version 5.0
   */
  boolean readLock(DBContainerAPI container, Closure<?> callback);

  /**
   * Read all records in the database matching the keys in the container
   *
   * @param keyContainer The key container used to match records in the database
   * @param nrOfKeys     The number of keys to use when match records in database
   * @param callback     A defined Closure method to call for each record in database, matching the key
   * @return The number of records read from database
   * @since API Version 5.0
   */
  int readAll(DBContainerAPI keyContainer, int nrOfKeys, Closure<?> callback);

  /**
   * Try to insert a record into the database
   *
   * @param container The container to insert in database
   * @return {@code true} if the insert succeeds
   * @since API Version 5.0
   */
  boolean insert(DBContainerAPI container);

  /**
   * Try to insert a record in to the database. If the record exists, the callback method will be executed
   *
   * @param container The container to insert in database
   * @param callback  A defined Closure method to call when the record exists
   * @return {@code true} if the insert succeeds
   * @since API Version 5.0
   */
  boolean insert(DBContainerAPI container, Closure<?> callback);

  /**
   * Create a new database container
   *
   * @return New database container
   * @since API Version 5.0
   */
  DBContainerAPI createContainer();

  /**
   * Get a database container with the current state
   *
   * @return Container with the current state
   * @since API Version 5.0
   */
  DBContainerAPI getContainer();
}
