package virtual_pet;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        System.out.println("Rescue your first pet!");
        Scanner scanner = new Scanner(System.in);
        shelter.rescueNewPet(scanner);


        while (true) {
            System.out.println("What would you like to do?");
            String userCommand = scanner.nextLine();
            switch (userCommand.toLowerCase()) {
                case "feed":
                    shelter.feedAllPets();
                    break;

                case "rescue":
                    shelter.rescueNewPet(scanner);
                    break;
                case "play":

                    if (shelter.getPets().size() == 1) {
                        VirtualPet onlyPet = shelter.getPets().get(shelter.getPets().keySet().toArray()[0].toString().toUpperCase());
                        onlyPet.play();
                        System.out.println("You played with " + onlyPet.getName() + "!");
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

                    break;
                case "clean":
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    System.out.println("Which pet would you like to clean?");
                    userCommand = scanner.nextLine();
                    VirtualPet chosenPetClean = shelter.getPets().get(userCommand.toUpperCase());

                    if (chosenPetClean == null) {
                        System.out.println("There is no pet named " + userCommand);

                        continue;
                    }
                    chosenPetClean.clean();
                    System.out.println(chosenPetClean.getName() + " was cleaned!");
                    break;

                case "quit":
                    System.exit(0);
                    break;
                case "walk":
                    for (VirtualPet pet : shelter.getPets().values()) {
                        if (pet instanceof OrganicDog)
                            ((OrganicDog) pet).walkTheDog();
                    }
                    break;

                case "help":
                    System.out.println("Here is a list of commands you may use: feed, play, rescue, list, walk, clean, or quit.");
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


}
