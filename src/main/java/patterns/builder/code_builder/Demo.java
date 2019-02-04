package patterns.builder.code_builder;

import static junit.framework.TestCase.assertEquals;

public class Demo {

    public static void main(String[] args) {
        emptyTest();
        personTest();

    }

    private static String preprocess(String text) {
        return text.replace("\r\n", "\n").trim();
    }

    public static void emptyTest() {
        CodeBuilder cb = new CodeBuilder("Foo");
        String clazz = cb.toString();
        clazz = preprocess(clazz);
        System.out.println(clazz);
        assertEquals("public class Foo {\n}", clazz);
    }

    public static void personTest() {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        String clazz = cb.toString();
        clazz = preprocess(clazz);
        System.out.println(clazz);
        assertEquals("public class Person {\n" +
                        "\tpublic\tString\tname\n" +
                        "\tpublic\tint\tage\n" +
                        "}",
                clazz);
    }

}
