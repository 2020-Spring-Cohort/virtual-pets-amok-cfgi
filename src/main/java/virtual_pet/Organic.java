package virtual_pet;

public abstract class Organic extends VirtualPet {

    private int exercise;
    private boolean asleep;
    private String foodType;
    private boolean needsToPoop;


    public int getExercise() {
        return exercise;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public String getFoodType() {
        return foodType;
    }

    public boolean isNeedsToPoop() {
        return needsToPoop;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

//    public void clean(){
//        if(exercise > 50){
//            System.out.println("Cage is clean");
//        } else {
//            System.out.println("Cage  is dirty.");
//        }
//
//    }

}
