package patterns.builder1.faceted;

//faceted builder
//for complicated builders that require multiple smaller builders
public class PersonBuilder {

    protected Person person = new Person();

    public PersonBuilder withName(String name) {
        this.person.name = name;
        return this;
    }

    //allows to switch between builders
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
