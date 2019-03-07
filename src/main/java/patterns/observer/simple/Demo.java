package patterns.observer.simple;

public class Demo {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(18);
        person.subscribe(eventArgs ->
                System.out.println("Person's " + eventArgs.propertyName
                        + " has been changed to " + eventArgs.newValue));

        person.setAge(19);
        person.setAge(20);
        person.setAge(21);
    }
}
