package task3;

public class TestMyDevice {
    public static void main(String[] args) {
        MyDevice device = new MyDevice();
        System.out.println(device.isOn);
        device.on();
        System.out.println(device.isOn);
        device.off();
        System.out.println(device.isOn);
        device.changeVolume(10);
    }
}
