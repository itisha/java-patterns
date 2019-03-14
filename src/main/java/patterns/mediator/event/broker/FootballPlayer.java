package patterns.mediator.event.broker;

public class FootballPlayer {

    public String name;
    private int goalsScored = 0;
    private EventBroker broker;

    public FootballPlayer(EventBroker broker, String name) {
        this.broker = broker;
        this.name = name;
    }

    public void score() {
        //only reports to EventBroker
        broker.publish(++goalsScored);
    }
}
