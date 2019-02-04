package patterns.builder1.faceted;

public class PersonAddressBuilder extends PersonBuilder {
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        this.person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        this.person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        this.person.postCode = postcode;
        return this;
    }
}
