package patterns.flyweight.text.format;

public class Demo {
    public static void main(String[] args) {
        FormattedText ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);

        BetterFormattedText bft = new BetterFormattedText("Make America Great Again");
        bft.getRange(13, 18).capitalize = true;
        System.out.println(bft);
    }
}
