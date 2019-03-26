package patterns.chain.of.responsibility.command.query.separation;

public class IncreaseDefenseModifier extends CreatureModifier {


    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(q -> {
            if (q.creatureName.equals(this.creature.name)
                    && q.argument == Query.Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }
}
