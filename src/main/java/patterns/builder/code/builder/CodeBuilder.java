package patterns.builder.code.builder;

public class CodeBuilder {

    protected Class aClass = new Class();

    public CodeBuilder(String clazzName) {
        this.aClass.name = clazzName;
    }

    public CodeBuilder addField(String name, String type) {
        aClass.fieldList.add(new Field(name, type));
        return this;
    }

    @Override
    public String toString() {
        String separator = System.lineSeparator();

        StringBuilder builder = new StringBuilder();

        builder.append("public class ")
                .append(aClass.name)
                .append(" {")
                .append(separator);

        aClass.fieldList.forEach(field -> {
            builder
                    .append("\tpublic\t")
                    .append(field.type)
                    .append("\t")
                    .append(field.name)
                    .append(";")
                    .append(separator);
        });

        return builder.append("}").toString();
    }
}
