package patterns.observer.event;

public class Demo {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Event<PropertyChangedEventArgs>.Subscription subscription =
                person.propertyChangedEvent.addHandler(x -> {
                    System.out.println("Person's " + x.propertyName + " has changed");
                });

        person.setAge(17);
        person.setAge(18);

        subscription.close();

        //no events fired
        person.setAge(19);
    }
}

