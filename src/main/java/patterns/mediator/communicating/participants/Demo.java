package patterns.mediator.communicating.participants;

public class Demo {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Participant participant1 = new Participant(mediator);
        Participant participant2 = new Participant(mediator);
        Participant participant3 = new Participant(mediator);
        Participant participant4 = new Participant(mediator);

        participant1.say(1);
        participant2.say(10);
    }
}
