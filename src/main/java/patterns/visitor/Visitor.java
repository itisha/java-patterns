package patterns.visitor;

public interface Visitor {

    void visit(Alcohol alcohol);

    void visit(Tobacco tobacco);

    void visit(Necessity necessity);


}
