package patterns.chain.of.responsibility.command.query.separation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//Observable
public class Event<T extends Query> {

    private int index = -1;
    private Map<Integer, Consumer<T>> handlers = new HashMap<>();

    public int subscribe(Consumer<T> handler) {
        handlers.put(++index, handler);
        return index;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(T query) {
        handlers.values().forEach(handler -> handler.accept(query));
    }
}
