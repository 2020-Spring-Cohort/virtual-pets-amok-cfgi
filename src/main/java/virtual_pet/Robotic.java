package virtual_pet;

public abstract class Robotic extends VirtualPet {

    private int oilLevel;

    private boolean needsOil;

    public int getOilLevel() {
        return oilLevel;
    }

    public boolean isNeedsOil() {
        return needsOil;
    }
}
