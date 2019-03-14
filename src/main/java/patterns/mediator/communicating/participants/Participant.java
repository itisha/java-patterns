package patterns.mediator.communicating.participants;

public class Participant {

    private static int generator = 0;

    int id = generator++;
    int value = 0;
    Mediator mediator;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
    }

    public void say(int n) {
        this.value = n;
        System.out.println("Participant id:" + this.id + " broadcasting its' value of " + this.value);
        mediator.broadcast(this, value);
    }

    public void update(int n) {
        this.value = n;
        System.out.println("Participant id:" + id + " updated its' value to " + this.value);
    }
}

