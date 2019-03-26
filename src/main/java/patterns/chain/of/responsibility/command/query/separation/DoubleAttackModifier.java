package patterns.chain.of.responsibility.command.query.separation;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {

    private final int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(this.creature.name) && q.argument == Query.Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }

    @Override
    public void close() throws Exception {
        game.queries.unsubscribe(token);
    }
}
