package patterns.chain.of.responsibility.method.chain;

public abstract class CreatureModifier {

    protected Creature creature;
    protected CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModifier creatureModifier) {
        if (next == null)
            next = creatureModifier;
        else
            next.add(creatureModifier);
    }

    public void handle() {
        if (next != null) {
            next.handle();
        }
    }
}
