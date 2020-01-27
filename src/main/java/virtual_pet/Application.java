package virtual_pet;

import java.util.Scanner;

import static virtual_pet.VirtualPetShelter.addPetToShelter;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pet");
        String name = scanner.nextLine();
        addPetToShelter(shelter, new VirtualPet(name));

        while (true) {
            System.out.println("What would you like to do?");
            String userCommand = scanner.nextLine();
            switch (userCommand.toLowerCase()) {
                case "feed":
                    shelter.feedAllPets();
                    break;

                case "adopt":
                    System.out.println("Enter the new pets name!");

                    String chosenName = scanner.nextLine();

                    addPetToShelter(shelter, new VirtualPet(chosenName));

                    System.out.println(chosenName + " was added to the shelter!");
                    break;
                case "play":

                    if (shelter.getPets().size() == 1) {
                        VirtualPet onlyPet = shelter.getPets().get(name.toUpperCase());
                        onlyPet.play();
                        System.out.println("You played with " + onlyPet.getName() + "!");
                        showPetInfo(onlyPet);
                        break;
                    }

                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    System.out.println("Which pet would you like to play with?");
                    userCommand = scanner.nextLine();
                    VirtualPet chosenPet = shelter.getPets().get(userCommand.toUpperCase());

                    if (chosenPet == null) {
                        System.out.println("There is no pet named " + userCommand);

                        continue;
                    }

                    chosenPet.play();

                    System.out.println("You played with " + chosenPet.getName() + "!");
                    showPetInfo(chosenPet);

                    break;
                case "quit":
                    System.exit(0);
                    break;
                case "list":
                    System.out.println("Here is a list of all the pets at the shelter.");
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    continue;
                default:
                    System.out.println("Unknown command, please try again.");
            }
            shelter.tickAllPets();
        }
    }

    public static void showPetInfo(VirtualPet pet) {
        System.out.println(pet.getName());
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Happiness: " + pet.getHappiness());
    }


}
