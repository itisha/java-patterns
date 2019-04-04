package patterns.visitor;

public abstract class Goods implements Visitable {

    protected Double price;

    public Goods(Double price) {
        this.price = price;
    }

    Double getPrice() {
        return price;
    }

}
