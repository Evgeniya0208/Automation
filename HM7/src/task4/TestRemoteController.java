package task4;

public class TestRemoteController {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        TV samsung = new TV("Samsung");

        remote.connectDevice(samsung);

        System.out.println("Is TV on? " + samsung.isOn);
        remote.powerOn();
        System.out.println("Is TV on? " + samsung.isOn);

        remote.upVolume();
        remote.upVolume();
        remote.upVolume();
        remote.upVolume();

        System.out.println(samsung.getVolumeLevel());

        remote.downVolume();
        remote.downVolume();

        System.out.println(samsung.getVolumeLevel());

        remote.mute();

        remote.setChannel(10);
        remote.currentChannel();

        remote.disconnectDevice(samsung);

    }
}
