package virtual_pet;

public class VirtualPet {

    private final String name;
    private int age;
    private final String color;
    private int weight;
    private String size;
    private int hunger;
    private int happiness;
    private String feelings;

    public VirtualPet(String name, int age, String color, int weight, String size, int hunger, int happiness, String feelings) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.size = size;
        this.hunger = hunger;
        this.happiness = happiness;
        this.feelings = feelings;
    }
}
