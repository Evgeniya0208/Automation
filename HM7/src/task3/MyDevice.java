package task3;

public class MyDevice implements Volume, State {
    double volume;
    boolean isOn;

    public MyDevice () {
        boolean isOn = false;
    }

    @Override
    public void on() {
        this.isOn = true;
        System.out.println("Device is on");
    }

    @Override
    public void off() {
        this.isOn = false;
        System.out.println("Device is off");
    }

    @Override
    public void changeVolume(double value) {
        this.volume = value;
        System.out.println("Volume is changed to " + volume);
    }
}
