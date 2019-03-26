package patterns.chain.of.responsibility.command.query.separation;

public class Demo {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreaseDefenseModifier icm = new IncreaseDefenseModifier(game, goblin);
        System.out.println(goblin);

        try (DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}
