import groovy.lang.Closure;

import java.util.Map;

/**
 * API for MI calls
 *
 * @since API Version 0.1.0
 */
public interface MICallerAPI {

  /**
   * Performs MI transaction, if an error occurs the callback will receive a map with keys 'error', 'errorMsid' and 'errorMessage'
   *
   * @param program     Program name
   * @param transaction Transaction name
   * @param callback    Callback function
   * @since API Version 0.1.0
   */
  void call(String program, String transaction, Closure<?> callback);

  /**
   * Performs MI transaction for the given parameters map, if an error occurs the callback will receive a map with keys 'error', 'errorMsid' and 'errorMessage'
   *
   * @param program     Program name
   * @param transaction Transaction name
   * @param parameters  Parameter map
   * @param callback    Callback function
   * @since API Version 0.1.0
   */
  void call(String program, String transaction, Map<String, String> parameters, Closure<?> callback);

  /**
   * Sets the max amount of responses to receive when calling a list transaction
   *
   * @param maxRecords Max records
   * @since API Version 0.14.0
   */
  void setListMaxRecords(int maxRecords);

  /**
   * Sets the date format. Available formats: YMD8, YMD6, MDY6, DMY6, YWD5
   *
   * @param dateSep  Date separator
   * @param dateForm Date format
   */
  void setDateFormat(char dateSep, String dateForm);
}
