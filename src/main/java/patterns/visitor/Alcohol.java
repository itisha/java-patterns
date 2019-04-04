package patterns.visitor;

public class Alcohol extends Goods {

    public Alcohol(Double price) {
        super(price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
