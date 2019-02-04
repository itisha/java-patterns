package patterns.builder.fluent.solution;

public class Demo {

    public static void main(String[] args) {

        EmployeeBuilder personBuilder = new EmployeeBuilder();
        Person tisha = personBuilder
                .withName("Tisha")
                .worksAt("Developer")

                .build();

        System.out.println(tisha);
    }

}
