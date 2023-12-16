import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VirtualPet myPet = new VirtualPet("Dog", "Spartan", 50, 50, 50);

        while (true) {
            displayStatus(myPet);
            System.out.println("Choose an option:");
            System.out.println("1. Feed the pet");
            System.out.println("2. Give water to the pet");
            System.out.println("3. Play with the pet");
            System.out.println("4. Do nothing");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    myPet.feed(5);
                    break;
                case 2:
                    myPet.water(10);
                    break;
                case 3:
                    myPet.play(10);
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            myPet.tick();
        }
    }

    private static void displayStatus(VirtualPet pet) {
        System.out.println("Pet Status:");
        System.out.println("Name: " + pet.getName());
        System.out.println("Type: " + pet.getType());
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Boredom: " + pet.getBoredom());
        System.out.println();
    }
}