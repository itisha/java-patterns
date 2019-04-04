package patterns.visitor;

public class Necessity extends Goods implements Visitable {

    public Necessity(Double price) {
        super(price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
