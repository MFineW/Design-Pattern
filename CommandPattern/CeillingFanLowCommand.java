package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName CeillingFanLowCommand
 * @Description TODO
 * @date 2020/3/22 23:39
 **/
public class CeillingFanLowCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeillingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
