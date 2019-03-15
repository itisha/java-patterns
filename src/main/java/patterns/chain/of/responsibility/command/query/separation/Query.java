package patterns.chain.of.responsibility.command.query.separation;

public class Query {

    public String creatureName;
    public Argument argument;
    public int result;

    public Query(String creatureName, Argument argument, int reqult) {
        this.creatureName = creatureName;
        this.argument = argument;
        this.result = reqult;
    }

    enum Argument {ATTACK, DEFENSE}

}
