package patterns.visitor;

public class Tobacco extends Goods {

    public Tobacco(Double price) {
        super(price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
