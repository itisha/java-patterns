package patterns.mediator.event.broker;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.LinkedList;
import java.util.List;

public class EventBroker extends Observable<Integer> {

    private List<Observer<? super Integer>> observers = new LinkedList<>();

    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        this.observers.add(observer);
    }

    public void publish(int n) {
        for (Observer<? super Integer> o : observers)
            o.onNext(n);
    }


}
