package patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {

    private Object target;
    private Map<String, Integer> calls = new HashMap<>();


    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();


        calls.merge(name, 1, Integer::sum);


        if (name.contains("toString")) {
            return calls.toString();
        }

        return method.invoke(target, args);
    }
}
