package task4;

public class TV extends TVDevice {
    private int volumeLevel;
    private int channelNumber;

    public TV(String modelName) {
        super(modelName);
    }

   public int getVolumeLevel() {
       return volumeLevel;
   }

    public int getChannelNumber() {
        return channelNumber;
    }

    @Override
    public void currentChannel() {
        System.out.println("Current channel is: " + channelNumber);
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("TV is on");
    }

    @Override
    public void powerOff() {
        this.isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        this.channelNumber = channel;
    }

    @Override
    public void upVolume() {
        this.volumeLevel += 1;
        System.out.println("Volume increased by 1");
    }

    @Override
    public void downVolume() {
        this.volumeLevel -= 1;
    }

    @Override
    public void mute() {
        Integer muteVolume = null;
        this.volumeLevel = muteVolume;
    }
}

