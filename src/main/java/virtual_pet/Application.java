package virtual_pet;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pet");
        String name = scanner.nextLine();

        VirtualPet firstPet = new VirtualPet(name);
        System.out.println(firstPet.getName());

        while (true) {
            System.out.println("What would you like to do?");
            String userCommand = scanner.nextLine();
            switch (userCommand.toLowerCase()) {
                case "feed":
                    firstPet.feed();
                    break;
                case "play":
                    firstPet.play();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command, please try again.");
            }
            firstPet.tick();
            showPetInfo(firstPet);
        }
    }

    public static void showPetInfo(VirtualPet pet) {
        System.out.println(pet.getName());
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Happiness: " + pet.getHappiness());
    }


}
