package patterns.observer.rat.attack;

public class Game {

    public Event<Void> ratEnters = new Event<>();
    public Event<Void> ratDies = new Event<>();
    public Event<Rat> notifyRat = new Event<>();

}