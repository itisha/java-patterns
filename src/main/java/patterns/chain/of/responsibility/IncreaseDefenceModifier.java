package patterns.chain.of.responsibility;

public class IncreaseDefenceModifier extends CreatureModifier {

    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + "'s defence by 3");
        creature.defence += 3;
        super.handle();
    }
}
