package virtual_pet;

import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

    private HashMap<String, VirtualPet> pets = new HashMap<>();

    public HashMap<String, VirtualPet> getPets() {
        return pets;
    }

    public void feedAllPets() {

        for (VirtualPet pet : getPets().values()) {
            pet.feed();
        }

    }

    public void tickAllPets() {
        for (VirtualPet pet : getPets().values()) {
            pet.tick();
        }

    }

    public void rescueNewPet(Scanner scanner) {
        System.out.println("Enter the new pet's name:");

        String chosenName = scanner.nextLine();

        System.out.println("Is this a dog, or a cat?");

        String petSpecies = scanner.nextLine();

        System.out.println("Is this pet robotic, or organic?");

        String petRoboticOrganic = scanner.nextLine();

        if (petRoboticOrganic.equalsIgnoreCase("robotic") && petSpecies.equalsIgnoreCase("cat")) {
            addPetToShelter(new RoboticCat(chosenName));
        } else if (petRoboticOrganic.equalsIgnoreCase("organic") && petSpecies.equalsIgnoreCase("cat")) {
            addPetToShelter(new OrganicCat(chosenName));
        } else if (petRoboticOrganic.equalsIgnoreCase("robotic") && petSpecies.equalsIgnoreCase("dog")) {
            addPetToShelter(new RoboticDog(chosenName));
        } else if (petRoboticOrganic.equalsIgnoreCase("organic") && petSpecies.equalsIgnoreCase("dog")) {
            addPetToShelter(new OrganicDog(chosenName));
        } else {
            System.out.println("I'm sorry, that is not a valid pet.");
        }


        System.out.println(chosenName + " was added to the shelter!");
    }

    public void addPetToShelter(VirtualPet pet) {
        getPets().put(pet.getName().toUpperCase(), pet);
    }
}
