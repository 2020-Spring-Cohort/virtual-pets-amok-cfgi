package virtual_pet;

public abstract class Organic extends VirtualPet {

    private boolean needsToPoop;

    protected String type;

    public String getType() {
        return type;
    }

    public boolean isNeedsToPoop() {
        return needsToPoop;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
