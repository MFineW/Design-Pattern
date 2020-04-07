package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName RemoteLoader
 * @Description TODO
 * @date 2020/3/20 22:38
 **/
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeillingFanLowCommand ceillingFanLowCommand = new CeillingFanLowCommand(ceilingFan);
        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);


//
//        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
//
//
//        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
//        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
//        remoteControl.setCommand(2, stereoOnWithCD, stereoOffWithCD);
//
//        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println("---------------------");
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
    }
}
