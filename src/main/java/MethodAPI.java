/**
 * API for Method arguments and return value
 *
 * @since API Version 0.5.0
 */
public interface MethodAPI {

  /**
   * Receive the value of an argument
   *
   * @param argument Argument index
   * @return Selected argument
   * @since API Version 0.5.0
   */
  Object getArgument(int argument);

  /**
   * Sets the value to return from a overridden method
   *
   * @param newValue Value to return
   * @since API Version 0.5.0
   */
  void setReturnValue(Object newValue);

  /**
   * Get the value returned from the overridden method. Note if setReturnValue is called before this,
   * the value set by setReturnValue is returned
   *
   * @return value returned from the original method
   * @since API Version 0.5.0
   */
  Object getReturnValue();
}
