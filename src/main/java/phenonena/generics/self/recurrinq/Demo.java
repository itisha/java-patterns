package phenonena.generics.self.recurrinq;

public class Demo {

    public static void main(String[] args) {
        Subtype s1 = new Subtype();
        Subtype s2 = new Subtype();

        s1.setElement(s2);

        //not allowed:
        //s1.setElement("");

        Subtype s3 = s1.getElement();

        s1.f();


        SubtypeNotGeneric subtypeNotGeneric = new SubtypeNotGeneric();

        // not allowed even though it's a subtype of a generic type:
        //s1.setElement(subtypeNotGeneric);

        //allowed since there's no generic restriction
        subtypeNotGeneric.setElement(s1);
        subtypeNotGeneric.f();
    }

}
