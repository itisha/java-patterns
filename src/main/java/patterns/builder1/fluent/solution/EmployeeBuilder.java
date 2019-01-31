package patterns.builder1.fluent.solution;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    /*
     * we only have one Person class but we can apply different builders
     * and build it with different field sets
     * */

    PersonBuilder worksAt(String position) {
        person.setPosition(position);
        //todo why have it here? It returns this anyway
        return self();
    }

    @Override
    protected EmployeeBuilder self() {

        return this;
    }


}

