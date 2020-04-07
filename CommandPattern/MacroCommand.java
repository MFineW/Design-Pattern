package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName MacroCommand
 * @Description TODO
 * @date 2020/3/23 0:06
 **/
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < this.commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
