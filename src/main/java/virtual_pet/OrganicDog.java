package virtual_pet;

public class OrganicDog extends Organic {


    private int exercise;

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public void walkTheDog() {

        exercise += 30;

    }


}
