package virtual_pet;

public class VirtualPet {

    private final String name;
    private int age = 2;
    private String color = "Brown";
    private int hunger = 20;
    private int happiness = 50;
    private String feelings = "Happy";
    private int petCleanliness = 25;
    private String petHygiene = "Clean";

    // Parameterized constructor
    public VirtualPet(String name, int age, String color, int hunger, int happiness, String feelings, int petCleanliness, String petHygiene) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hunger = hunger;
        this.happiness = happiness;
        this.feelings = feelings;
        this.petCleanliness = petCleanliness;
        this.petHygiene = petHygiene;
    }

    public VirtualPet(String name) {
        this.name = name;
    }

    // Default constructor
    public VirtualPet() {
        // Empty
        this.name = "John";
    }

    @Override
    public String toString() {
        return name + ": \n"
                + "    Age: " + age
                + "\n    Color: " + color
                + "\n    Hunger: " + hunger
                + "\n    Happiness: " + happiness
                + "\n    Feeling: " + feelings
                + "\n    Hygiene: " + petHygiene;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public String getFeelings() {
        return feelings;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getHygiene() {
        return petHygiene;
    }

    public int increaseHunger() {
        return hunger += 3;
    }

    public int decreaseHappiness() {
        happiness -= 3;

        if (happiness < 0) {
            happiness = 0;
        }
        return happiness;
    }

    public int feed() {
        hunger -= 20;

        if (hunger < 0) {
            hunger = 0;
        }
        return hunger;
    }

    public int clean() {
        petCleanliness = 100;
        return petCleanliness;
    }

    public int play() {
        return happiness += 20;
    }

    public void tick() {
        increaseHunger();
        decreaseHappiness();
        determineMood();
        decreaseCleanliness();
    }

    private void decreaseCleanliness() {
        petCleanliness -= 3;
        if (petCleanliness < 0) {
            petCleanliness = 0;
        }
    }

    private void determineMood() {
        if (happiness > 50 && hunger > 50) {
            feelings = "Hungry";
        } else if (happiness < 50 && hunger > 50) {
            feelings = "Angry";
        } else if (happiness > 50 && hunger < 50) {
            feelings = "Happy";
        } else {
            feelings = "Lonely";
        }
        if (petCleanliness < 20) {
            petHygiene = "Dirty";
        } else {
            petHygiene = "Clean";
        }
    }
}
