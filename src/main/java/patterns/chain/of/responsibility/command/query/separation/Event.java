package patterns.chain.of.responsibility.command.query.separation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//Command Query Separation QQS
public class Event<Args> {

    private int index = -1;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler) {
        handlers.put(++index, handler);
        return index;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Args args) {
        handlers.values().forEach(handler -> handler.accept(args));
    }
}
