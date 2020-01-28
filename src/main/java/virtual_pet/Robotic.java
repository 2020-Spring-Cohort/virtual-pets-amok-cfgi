package virtual_pet;

public abstract class Robotic extends VirtualPet {

    protected int oilLevel = 100;

    protected boolean needsOil = false;

    protected boolean poweredOn = true;

    protected int batteryLevel = 100;

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

    private void decreaseOilLevel() {
        if (isPoweredOn()) {
            oilLevel -= 3;
            if (oilLevel < 0) oilLevel = 0;
        }
        needsOil = oilLevel < 10;
    }

    private void decreaseBatteryLevel() {
        batteryLevel -= 6;
        if (batteryLevel < 0) batteryLevel = 0;
        poweredOn = batteryLevel != 0;
    }

    @Override
    public void tick() {
        decreaseOilLevel();
        decreaseBatteryLevel();
    }

    public abstract void changeOil();
}
