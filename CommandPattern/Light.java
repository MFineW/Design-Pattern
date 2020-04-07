package CommandPattern;

import java.util.SortedMap;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Light
 * @Description TODO
 * @date 2020/3/18 1:25
 **/
public class Light {

    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " light is on");
    }

    public void off() {
        System.out.println(room + " light is off");
    }

}
