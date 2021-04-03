package task4;

abstract class TVDevice implements Volume, Device {
    String modelName;
    boolean isOn;

    public TVDevice(String modelName) {
        this.modelName = modelName;
        this.isOn = false;
    }
}
