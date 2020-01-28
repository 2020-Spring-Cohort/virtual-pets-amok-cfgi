package virtual_pet;

public abstract class Robotic extends VirtualPet {

    protected int oilLevel;

    protected boolean needsOil;

    protected boolean poweredOn;

    protected int batteryLevel;

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

    // Robots do not get hungry or sad
//    @Override
//    public String toString() {
//        return
//    }

    public void changeBattery() {
        batteryLevel = 100;
    }

    public abstract void changeOil();
}
