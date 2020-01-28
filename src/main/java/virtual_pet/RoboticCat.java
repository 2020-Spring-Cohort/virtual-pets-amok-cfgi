package virtual_pet;

public class RoboticCat extends Robotic {

    public RoboticCat() {
        type = "Robotic Cat";
    }

    @Override
    public void changeOil() {
        oilLevel += 20;
    }
}
