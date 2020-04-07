package CommandPattern;

import javax.activation.CommandObject;

/**
 * @author MFine
 * @version 1.0
 * @ClassName LightOnCommand
 * @Description TODO
 * @date 2020/3/18 1:25
 **/
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
