import java.util.Collection;
import java.util.Map;
import java.util.Set;

class ReadOnlyMap<K, V> implements Map<K, V> {
  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public int size() {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public boolean isEmpty() {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public boolean containsKey(Object key) {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public boolean containsValue(Object value) {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  @Override
  public V get(Object key) {
    return null;
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public V put(K key, V value) {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public V remove(Object key) {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public void putAll(Map<? extends K, ? extends V> m) {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public void clear() {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public Set<K> keySet() {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public Collection<V> values() {
    throw new UnsupportedOperationException("Operation not permitted");
  }

  /**
   * This API only supports {@link #get(Object)}, no other operation is supported
   * @return nothing, throws instead
   * @throws UnsupportedOperationException all the time
   */
  @Override
  public Set<Entry<K, V>> entrySet() {
    throw new UnsupportedOperationException("Operation not permitted");
  }
}
