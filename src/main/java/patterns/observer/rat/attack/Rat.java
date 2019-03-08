package patterns.observer.rat.attack;

import java.io.Closeable;
import java.io.IOException;

public class Rat implements Closeable {
    public int attack = 1;
    private Game game;

    public Rat(Game game) {
        this.game = game;
        game.ratEnters.subscribe((sender, arg) -> {
            if (sender != this) {
                ++attack;
                this.game.notifyRat.invoke(this, (Rat) sender);
            }
        });
        game.notifyRat.subscribe((sender, rat) -> {
            if (rat == this) ++attack;
        });
        game.ratDies.subscribe((sender, arg) -> --attack);
        game.ratEnters.invoke(this, null);
    }

    @Override
    public void close() throws IOException {
        // rat dies ;(
        game.ratDies.invoke(this, null);
    }
}