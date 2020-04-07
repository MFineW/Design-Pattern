package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName LightOffCommand
 * @Description TODO
 * @date 2020/3/20 1:09
 **/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
