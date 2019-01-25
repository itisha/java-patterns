package brokerchain;

/**
 * Created by t on 1/21/2019.
 */
public class CreatureModifier {
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
