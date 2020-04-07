package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName RemoteControlTest
 * @Description TODO
 * @date 2020/3/18 1:28
 **/
public class RemoteControlTest {
    public static void main(String[] args){

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("living room");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }
}
