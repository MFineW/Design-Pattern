package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName ster
 * @Description TODO
 * @date 2020/3/20 1:32
 **/
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }
}
