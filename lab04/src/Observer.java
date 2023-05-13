public interface Observer<T> {
    void update(T eventType, int valueUpdated);
}
