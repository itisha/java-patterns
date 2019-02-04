package patterns.builder1.faceted;

public class Demo {

    public static void main(String[] args) {
        Person tisha = new PersonBuilder()
                .withName("Tisha")
                .lives()
                .at("Mstislauca str")
                .withPostcode("220114")
                .in("Minsk")
                .works()
                .worksAt("Google")
                .asA("Architect")
                .earning(100500)
                .withName("Tisha Kuprevich")
                .build();
        System.out.println(tisha);
    }

}
