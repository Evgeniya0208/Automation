package task4;

public class TestRemoteController {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        TV samsung = new TV("Samsung");

        remote.connectDevice(samsung);
        System.out.println(remote.checkIfDeviceConnected());
        remote.disconnectDevice(samsung);
        System.out.println(remote.checkIfDeviceConnected());

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

        //remote.mute(); //set volumeLevel = null  - get exception

        remote.setChannel(10);
        remote.currentChannel();
    }
}
