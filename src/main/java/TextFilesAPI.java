import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * API for handling text files
 *
 * @since API Version 11.0
 */
public interface TextFilesAPI {

  /**
   * Open a SubDirectory. Top or root directory is denotated by null. Throws FileUtilException on error.
   * @param subDirectory name of the subDirectory
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  void open(String subDirectory) throws FileUtilException;

  /**
   * Check if a file is accessible. Throws FileUtilException on error.
   * @param fileName name of the file
   * @return {@code true} if accessible
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  boolean exists(String fileName) throws FileUtilException;

  /**
   * Get the size of a file. Throws FileUtilException on error.
   * @param fileName name of the file
   * @return the size of the file
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  long size(String fileName) throws FileUtilException;

  /**
   * Delete a file. Throws FileUtilException on error.
   * @param fileName name of the file
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  void delete(String fileName) throws FileUtilException;

  /**
   * Lists all files. Throws FileUtilException on error.
   * @return string iterator for enumerating the file names
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  Iterator<String> listFiles() throws FileUtilException;

  /**
   * Lists all folders. Throws FileUtilException on error.
   * @return string iterator for enumerating the folder names
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  Iterator<String> listFolders() throws FileUtilException;

  /**
   * Performs read task on file. Throws FileUtilException on error.
   * @param fileName name of the file
   * @param encoding string representation of the encoding
   * @param readTask consumer accepting BufferedReader to read from file
   * @throws FileUtilException on error
   * @since API Version 11.
   */
  void read(String fileName, String encoding, Consumer<BufferedReader> readTask) throws FileUtilException;

  /**
   * Perform write task to file. Throws FileUtilException on error.
   * @param fileName name of the file
   * @param encoding string representation of the encoding
   * @param append if true, append to the contents, otherwise (re)create the file
   * @param writeTask writeTask - consumer accepting PrintWriter to print to file
   * @throws FileUtilException on error
   * @since API Version 11.0
   */
  void write(String fileName, String encoding, boolean append, Consumer<PrintWriter> writeTask) throws FileUtilException;
}
