package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pet");
        String name = scanner.nextLine();

        VirtualPet firstPet = new VirtualPet(name);
        System.out.println(firstPet.getName());


    }





}
