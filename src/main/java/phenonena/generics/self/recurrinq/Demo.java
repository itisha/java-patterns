package phenonena.generics.self.recurrinq;

public class Demo {

    public static void main(String[] args) {
        Subtype s1 = new Subtype();
        Subtype s2 = new Subtype();

        s1.setElement(s2);

        Subtype s3 = s1.getElement();

        s1.f();
    }

}
