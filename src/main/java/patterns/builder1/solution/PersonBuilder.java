package patterns.builder1.solution;

public class PersonBuilder<T extends PersonBuilder<T>> {

    protected Person person = new Person();

    public T withName(String name) {
        person.setName(name);
        return self();
    }

    /* now whoever extends this
    will receive a type of itself
    when calling methods on parent */
    protected T self() {
        return (T) this;
    }

    public Person build() {
        return person;
    }
}
