package patterns.chain.of.responsibility;

public class Creature {

    String name;
    int attack, defence;

    public Creature(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
