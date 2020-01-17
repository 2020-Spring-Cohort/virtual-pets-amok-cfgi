package virtual_pet;

public class VirtualPet {

    private final String name;
    private int age;
    private final String color;
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

    // Default constructor
    public VirtualPet() {

        this.name = "John";

        this.color = "Brown";

        this.hunger = 10;

    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }
}
