import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observable<T> {
    Map<T, List<Observer<T>>> observersMap = new HashMap();

    public Observable(T[] events) {
        for (T event : events) {
            this.observersMap.put(event, new ArrayList<Observer<T>>());
        }
    }

    public void notify(T eventType, int valueUpdated) {
        List<Observer<T>> observers = observersMap.get(eventType);

        for (Observer<T> observer : observers) {
            observer.update(eventType, valueUpdated);
        }
    }

    public void subscribe(T eventType, Observer<T> observer) {
        observersMap.get(eventType).add(observer);
    }

    public void unsubscribe(T eventType, Observer<T> observer) {
        observersMap.get(eventType).remove(observer);
    }
}
