package patterns.proxy.dynamic;

import java.lang.reflect.Proxy;

public class PersonProxyFactory {

    public static <T extends Human> T getPersonProxy(T object) {
        return (T) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class<?>[]{Human.class}, new LoggingHandler(object));

    }
}
