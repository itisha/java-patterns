package patterns.observer.simple;

public interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);

}
