package patterns.builder1.problem;

public class EmployeeBuilder extends PersonBuilder {

    /*
     * we only have one Person class but we can apply different builders
     * and build it with different field sets
     * */

    EmployeeBuilder worksAt(String position) {
        person.setPosition(position);
        return this;
    }

}
