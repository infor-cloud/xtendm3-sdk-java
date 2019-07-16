interface LockedResultAPI<T> extends DBContainerAPI<T> {
    boolean update()
    boolean delete()
}
