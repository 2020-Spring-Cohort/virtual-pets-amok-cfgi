package virtual_pet;

import java.util.HashMap;

public class VirtualPetShelter {

    private HashMap<String, VirtualPet> pets = new HashMap<>();

    public HashMap<String, VirtualPet> getPets() {
        return pets;
    }
}
