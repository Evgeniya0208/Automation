package task4;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;


    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }
    public void disconnectDevice(TVDevice tvDevice) {
        this.tvDevice = null;
    }
    private boolean checkIfDeviceConnected() {
        if(this.tvDevice == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void upVolume() {
        if(checkIfDeviceConnected()) tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        if(checkIfDeviceConnected()) tvDevice.downVolume();
    }

    @Override
    public void mute() {
        if(checkIfDeviceConnected()) tvDevice.mute();
    }

    @Override
    public void powerOn() {
        if(checkIfDeviceConnected()) tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        if(checkIfDeviceConnected()) tvDevice.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        int a = channel;
        if(checkIfDeviceConnected()) tvDevice.setChannel(a);
    }

    @Override
    public void currentChannel() {
        if(checkIfDeviceConnected()) tvDevice.currentChannel();
    }
}
