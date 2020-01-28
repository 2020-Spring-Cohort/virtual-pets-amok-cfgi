package virtual_pet;

public class RoboticDog extends Robotic {

    public RoboticDog() {
        type = "Robotic Dog";
    }

    @Override
    public void changeOil() {
        oilLevel += 30;
    }
}
