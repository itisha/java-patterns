package patterns.builder.fluent.problem;

public class Demo {

    public static void main(String[] args) {

        EmployeeBuilder personBuilder = new EmployeeBuilder();
        Person tisha = personBuilder
                .withName("Tisha")
                //not available since withName() returns PersonBuilder:
                //.worksAt("Developer")
                .build();

        System.out.println(tisha);
    }

}
