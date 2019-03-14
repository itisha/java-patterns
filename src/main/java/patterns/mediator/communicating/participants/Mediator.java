package patterns.mediator.communicating.participants;

import java.util.LinkedList;
import java.util.List;

public class Mediator {

    List<Participant> participants = new LinkedList<>();

    public void register(Participant participant) {
        participants.add(participant);
    }

    public void broadcast(Participant participant, int value) {
        participants.forEach(p -> {
            if (p != participant) p.update(value);
        });
    }
}