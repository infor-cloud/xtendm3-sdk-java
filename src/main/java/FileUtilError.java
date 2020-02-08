public enum FileUtilError {
  /**
   * Something went wrong when communicating with the destination host.
   */
  COMMUNICATION_FAILURE, //
  /**
   * Something went wrong when trying to create a file or directory
   */
  CREATION_FAILURE, //
  /**
   * Something went wrong when trying to delete a file
   */
  DELETION_FAILURE, //
  /**
   * the file is already opened for output. Please close the fileUtil first.
   */
  OPEN_FOR_OUTPUT, //
  /**
   * the file is already opened for input. Please close the fileUtil first.
   */
  OPEN_FOR_INPUT, //
  /**
   * the file utility is not opened. Pleas open the fileUtil first
   */
  NOT_OPENED, //
  /**
   * the file utility is already opened. Pleas close the fileUtil first
   */
  ALREADY_OPENED, //
  /**
   * Failed to open file
   */
  FAILED_TO_OPEN, //
  /**
   * The Character Encoding is not supported
   */
  UNSUPPORTED_ENCODING, //
  /**
   * The name contains invalid characters. Valid characters include: 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789._-'
   */
  INVALID_NAME, //
  /**
   * The directory structure contains invalid components. Valid components include names containing 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789._-' excluding '..'
   */
  INVALID_STRUCTURE, //
}
