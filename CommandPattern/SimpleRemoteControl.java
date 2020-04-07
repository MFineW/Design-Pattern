package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName SimpleRemoteControl
 * @Description TODO
 * @date 2020/3/18 1:26
 **/
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
