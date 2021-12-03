public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("black");

        remoteControl.nextChannel();
        remoteControl.nextChannel();
        remoteControl.nextChannel();

        remoteControl.volumeUp();
        remoteControl.volumeUp();

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getColor());

        remoteControl.setCurrentChannel(10);
        remoteControl.setCurrentVolume(50);
        remoteControl.setColor("white");

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getColor());
    }
}
