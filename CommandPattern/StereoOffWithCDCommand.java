package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName StereoOffWithCDCommand
 * @Description TODO
 * @date 2020/3/20 22:47
 **/
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
