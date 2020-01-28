package virtual_pet;

public abstract class Robotic extends VirtualPet {

    protected int oilLevel;

    protected boolean needsOil;

    protected boolean poweredOn;

    protected int batteryLevel;

    protected String type;

    public String getType() {
        return type;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public boolean isNeedsOil() {
        return needsOil;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public Robotic(String name) {
        super(name);
    }

    // Robots do not get hungry or sad, feelings not included
    @Override
    public String toString() {
        return getName() + ": " +
                "\n    Type: " + getType() +
                "\n    Oil level: " + getOilLevel() +
                "\n    Battery level: " + getBatteryLevel() +
                "\n    Powered on: " + (isPoweredOn() ? "yes" : "no") +
                "\n    Needs oil: " + (isNeedsOil() ? "yes" : "no");

    }

    public void changeBattery() {
        batteryLevel = 100;
    }

    public abstract void changeOil();
}
