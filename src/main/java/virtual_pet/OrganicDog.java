package virtual_pet;

public class OrganicDog extends Organic {


    private int exercise;

    public OrganicDog(String name) {
        super(name);
        type = "Dog";
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    Exercise: " + getExercise();
    }

    public void walkTheDog() {

        exercise += 30;

        System.out.println("You walked " + getName());

    }


}
