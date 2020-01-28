package virtual_pet;

public class RoboticDog extends Robotic {

    public RoboticDog(String name) {
        super(name);
        type = "Robotic Dog";
    }

    @Override
    public void changeOil() {
        oilLevel += 30;
    }
}
