package virtual_pet;

import java.util.HashMap;

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

    public static void addPetToShelter(VirtualPetShelter shelter, VirtualPet pet) {
        shelter.getPets().put(pet.getName().toUpperCase(), pet);
        //move method to shelter class
    }
}
