package phenonena.generics.self.recurrinq;

public class GenericType<T extends GenericType<T>> {

    T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
