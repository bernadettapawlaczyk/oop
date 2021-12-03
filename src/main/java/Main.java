public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.nextChannel();
        remoteControl.nextChannel();
        remoteControl.nextChannel();

        remoteControl.volumeUp();
        remoteControl.volumeUp();

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());
    }
}
