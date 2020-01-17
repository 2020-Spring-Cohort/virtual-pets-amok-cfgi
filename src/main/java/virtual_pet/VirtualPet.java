package virtual_pet;

public class VirtualPet {

    private final String name;
    private int age = 2;
    private String color = "Brown";
    private int hunger = 10;
    private int happiness = 50;
    private String feelings = "Happy";

    // Parameterized constructor
    public VirtualPet(String name, int age, String color, int hunger, int happiness, String feelings) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hunger = hunger;
        this.happiness = happiness;
        this.feelings = feelings;
    }

    public VirtualPet(String name) {
        this.name = name;
    }

    // Default constructor
    public VirtualPet() {
        // Empty
        this.name = "John";
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
        hunger -= 5;

        if (hunger < 0) {
            hunger = 0;
        }
        return hunger;
    }

    public int play() {
        return happiness += 10;
    }

    public void tick() {
        increaseHunger();
        decreaseHappiness();
    }
}
