package patterns.observer.event;

public class Person {

    public final Event<PropertyChangedEventArgs> propertyChangedEvent = new Event<>();

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) return;

        boolean oldCanVote = getCanVote();

        this.age = age;
        propertyChangedEvent.fire(new PropertyChangedEventArgs(
                this, "age"
        ));

        if (oldCanVote != getCanVote()) {
            propertyChangedEvent.fire(new PropertyChangedEventArgs(
                    this, "canVote"
            ));
        }
    }

    public boolean getCanVote() {
        return age >= 18;
    }
}