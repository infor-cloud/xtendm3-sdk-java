interface DBActionAPI<T> {
    boolean read(DBContainerAPI container)
    boolean readLock(DBContainerAPI container, Closure<?> callback)
    int readAll(DBContainerAPI keyContainer, int nrOfKeys, Closure<?> callback)
    boolean insert(DBContainerAPI container)
    boolean insert(DBContainerAPI container, Closure<?> callback)
    DBContainerAPI createContainer()
    DBContainerAPI getContainer()
}
