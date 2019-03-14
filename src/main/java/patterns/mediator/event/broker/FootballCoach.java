package patterns.mediator.event.broker;

import io.reactivex.disposables.Disposable;

public class FootballCoach implements Disposable {

    //decorator
    private Disposable disposable;

    public FootballCoach(EventBroker broker) {
        //just add a new consumer (Observer) and does nothing more
        this.disposable = broker.subscribe(i -> {
            System.out.println("Hey, player, congrats on " + i + " goals scored!");
        });
    }

    @Override
    public void dispose() {
        disposable.dispose();
    }

    @Override
    public boolean isDisposed() {
        return disposable.isDisposed();
    }
}
