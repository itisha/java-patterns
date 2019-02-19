package patterns.decorator.string_decorator;

public class Demo {
    public static void main(String[] args) {
        MagicString string = new MagicString("Hello");
        System.out.println(string);
        System.out.println("Length: " + string.length());
        System.out.println("Index of 'e': " + string.indexOf('e'));
        System.out.println("Number Of Vovels: " + string.getNumberOfVovels());
    }
}
