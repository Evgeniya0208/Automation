package task4;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;


    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }
    public void disconnectDevice(TVDevice tvDevice) {
        this.tvDevice = null;
    }
    public boolean checkIfDeviceConnected() {
        if(this.tvDevice == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void upVolume() {
        tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        tvDevice.downVolume();
    }

    @Override
    public void mute() {
        tvDevice.mute();
    }

    @Override
    public void powerOn() {
        tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        tvDevice.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        int a = channel;
        tvDevice.setChannel(a);
    }

    @Override
    public void currentChannel() {
        tvDevice.currentChannel();
    }
}
