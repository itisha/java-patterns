package patterns.builder1.faceted;

public class PersonBuilder {

    protected Person person = new Person();

    public PersonBuilder withName(String name) {
        this.person.name = name;
        return this;
    }


    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonCompanyBuilder works() {
        return new PersonCompanyBuilder(person);
    }

    public Person build() {
        return person;
    }

}
