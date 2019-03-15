package patterns.chain.of.responsibility;

public class Demo {
    public static void main(String[] args) {
        Creature creature = new Creature("Strong Goblin", 2, 2);

        CreatureModifier modifier = new DoubleAttackModifier(creature);
        modifier.add(new IncreaseDefenceModifier(creature));

        System.out.println(creature);
        modifier.handle();
        System.out.println(creature);
    }
}
