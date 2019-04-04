package patterns.visitor;

public class TaxVisitor implements Visitor {

    @Override
    public void visit(Alcohol alcohol) {
        System.out.println("Alcohol price:" + alcohol.getPrice() + " taxes: " + alcohol.getPrice() * .12);
    }

    @Override
    public void visit(Tobacco tobacco) {
        System.out.println("Tobacco price:" + tobacco.getPrice() + " taxes: " + tobacco.getPrice() * .11);
    }

    @Override
    public void visit(Necessity necessity) {
        System.out.println("Necessity price:" + necessity.getPrice() + " taxes: " + necessity.getPrice() * .05);
    }
}
