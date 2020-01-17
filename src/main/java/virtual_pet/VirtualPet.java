package virtual_pet;

public class VirtualPet {

    private final String name;
    private int age;
    private String color;
    private int hunger;
    private int happiness;
    private String feelings;

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

        this.name = "John";

        this.color = "Brown";

        this.hunger = 10;

        this.feelings = "Happy";

        this.happiness = 50;

        this.age = 2;
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
        return hunger += 5;
    }

    public int decreaseHappiness() {
        return happiness -= 5;
    }
}
