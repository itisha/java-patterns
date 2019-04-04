package patterns.visitor;

public class TaxVisitorHoliday implements Visitor {
    @Override
    public void visit(Alcohol alcohol) {
        System.out.println("Alcohol price:" + alcohol.getPrice() + " holiday taxes: " + alcohol.getPrice() * .09);
    }

    @Override
    public void visit(Tobacco tobacco) {
        System.out.println("Tobacco price:" + tobacco.getPrice() + " holiday taxes: " + tobacco.getPrice() * .07);
    }

    @Override
    public void visit(Necessity necessity) {
        System.out.println("Necessity price:" + necessity.getPrice() + " holiday taxes: " + necessity.getPrice() * 0.0);
    }
}
