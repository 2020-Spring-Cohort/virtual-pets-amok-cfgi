package virtual_pet;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pet");
        String name = scanner.nextLine();
        addPetToShelter(shelter, new VirtualPet(name));


        shelter.getPets().put("John", new VirtualPet());
        shelter.getPets().put("Dewy", new VirtualPet("Dewy"));
        shelter.getPets().put("JoeJoe", new VirtualPet("JoeJoe"));

        while (true) {
            System.out.println("What would you like to do?");
            String userCommand = scanner.nextLine();
            switch (userCommand.toLowerCase()) {
                case "feed":
                    //firstPet.feed();
                    break;
                case "play":
                    //firstPet.play();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                case "list":
                    System.out.println("Here is a list of all the pets at the shelter.");
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    break;
                default:
                    System.out.println("Unknown command, please try again.");
            }
            //firstPet.tick();
            //showPetInfo(firstPet);
        }
    }

    public static void showPetInfo(VirtualPet pet) {
        System.out.println(pet.getName());
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Happiness: " + pet.getHappiness());
    }

    public static void addPetToShelter(VirtualPetShelter shelter, VirtualPet pet) {
        shelter.getPets().put(pet.getName(), pet);
    }


}
