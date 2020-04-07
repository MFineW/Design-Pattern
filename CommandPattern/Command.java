package CommandPattern;

public interface Command {
    void execute();

    default void undo(){};
}
