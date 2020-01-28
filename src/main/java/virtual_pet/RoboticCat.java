package virtual_pet;

public class RoboticCat extends Robotic {

    public RoboticCat(String name) {
        super(name);
        type = "Robotic Cat";
    }

    @Override
    public void changeOil() {
        oilLevel += 20;
    }
}
