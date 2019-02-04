package patterns.builder.faceted;

public class PersonCompanyBuilder extends PersonBuilder {

    public PersonCompanyBuilder(Person person) {
        this.person = person;
    }

    public PersonCompanyBuilder worksAt(String companyName) {
        this.person.companyName = companyName;
        return this;
    }

    public PersonCompanyBuilder asA(String position) {
        this.person.position = position;
        return this;
    }

    public PersonCompanyBuilder earning(Integer annualIncome) {
        this.person.annualIncome = annualIncome;
        return this;
    }
}
