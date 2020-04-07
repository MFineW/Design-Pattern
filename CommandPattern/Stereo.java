package CommandPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Stereo
 * @Description TODO
 * @date 2020/3/20 1:28
 **/
public class Stereo {

    private String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " stereo is on");
    }

    public void off() {
        System.out.println(room + " stereo is off");
    }

    public void setCd() {
        System.out.println(room + " stereo cd is set");
    }

    public void Dvd() {
        System.out.println(room + " stereo dvd is set");
    }


    public void setRadio() {
        System.out.println(room + " radio is set");
    }

    public void setVolume() {
        System.out.println(room + " volume is set");
    }
}
