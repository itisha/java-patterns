package patterns.command;

/**
 * Created by t on 1/22/2019.
 */
public interface Command {

    void call();

    void undo();
}
