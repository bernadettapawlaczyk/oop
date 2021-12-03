import java.util.List;

public class RemoteControl {

    private final int HEIGHT = 16;
    private final int WIDTH = 5;
    private final int THICKNESS = 4;

    private static final List<String> BUTTONS = List.of("1", "2", "3", "4", "5", "6", "7",
            "8", "9", "Power", "VolumeUp", "VolumeDomn",
            "NextChannel", "PreviousChannel");

    private int currentVolume;
    private int currentChannel;

    public void volumeUp(){
        currentVolume++;
    }

    public void volumeDown(){
        currentVolume--;
    }

    public void nextChannel(){
        currentChannel++;
    }

    public void  prevousChannel(){
        currentChannel--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}
