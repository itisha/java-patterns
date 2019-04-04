package patterns.visitor;

public class Demo {
    public static void main(String[] args) {
        Alcohol vodka = new Alcohol(11.11);
        Necessity milk = new Necessity(2.00);
        Tobacco winston = new Tobacco(6.05);

        System.out.println("\nTaxes:");

        TaxVisitor visitor = new TaxVisitor();
        vodka.accept(visitor);
        milk.accept(visitor);
        winston.accept(visitor);

        System.out.println("\n\nTaxes Holiday:");

        TaxVisitorHoliday visitorHoliday = new TaxVisitorHoliday();
        vodka.accept(visitorHoliday);
        milk.accept(visitorHoliday);
        winston.accept(visitorHoliday);
    }
}
