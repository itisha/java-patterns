package patterns.brokerchain;

/**
 * Created by t on 1/21/2019.
 */
public class Query {
    public String creatureName;
    public Argument argument;
    public int result;

    public Query(String creatureName, Argument argument, int result) {
        this.creatureName = creatureName;
        this.argument = argument;
        this.result = result;
    }

    enum Argument {
        ATTACK, DEFENSE
    }
}
