package patterns.proxy.dynamic;

public class Demo {


    public static void main(String[] args) {

        Human personProxy = PersonProxyFactory.getPersonProxy(new Person());

        personProxy.walk();

        personProxy.talk();
        personProxy.talk();

        System.out.println(personProxy);
    }
}
