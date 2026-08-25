import java.util.Scanner;

// Base class — represents a generic animal
class Animl {
    void eat() {
        System.out.println("🐾 Animal can eat");
    }
}

// Dogs class inherits from Animl and overrides eat()
class Dogs extends Animl {
    @Override
    void eat() {
        System.out.println("🐶 Dog eats Bone");
    }
}

// Cat class inherits from Animl and overrides eat()
class Cat extends Animl {
    @Override
    void eat() {
        System.out.println("🐱 Cat eats Fish");
    }
}

// Cow class inherits from Animl and overrides eat()
class Cow extends Animl {
    @Override
    void eat() {
        System.out.println("🐄 Cow eats Grass");
    }
}

public class Advantage {

    // Takes an Animl reference (upcasting happens when dog/cat/cow are passed in)
    // Whichever object is actually passed, its own overridden eat() runs (dynamic dispatch)
    static void eat(Animl a) {
        a.eat();
    }

    // Helper method just to avoid repeating the same line of dashes everywhere
    static void printDivider() {
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // used to read user input from console

        // Create one object of each animal type upfront, so we don't create new ones every loop
        Dogs dog = new Dogs();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // ---- Title banner shown once at the start ----
        printDivider();
        System.out.println("        🌾 FARM FEEDING SIMULATOR 🌾");
        printDivider();

        boolean opt = true; // controls whether the main loop keeps running

        while (opt) {
            System.out.println();
            printDivider();
            System.out.println("Press 1 to feed an animal");
            System.out.println("Press any other number to exit");
            printDivider();
            System.out.print("Your choice: ");

            // Check if the next input is actually a number
            // Prevents a crash (InputMismatchException) if user types letters
            if (!sc.hasNextInt()) {
                System.out.println("⚠️  Please enter a valid number.");
                sc.next(); // discard the invalid input so it doesn't get stuck in a loop
                continue;  // skip rest of this loop iteration, go back to the top
            }

            int a = sc.nextInt();  // read the number choice
            sc.nextLine();          // consume the leftover "\n" left behind by nextInt()
                                     // (without this, the next nextLine() would read an empty string)

            if (a == 1) {
                System.out.println();
                System.out.println("Available animals: dog, cat, cow");
                System.out.print("Choose your animal: ");

                // Read the animal name, remove extra spaces, and make it lowercase
                // so "Dog", " DOG ", "dog" are all treated the same
                String animal = sc.nextLine().trim().toLowerCase();

                System.out.println();

                // .equals() is used instead of == because we're comparing String content,
                // not comparing whether they're the same object in memory
                if (animal.equals("dog") || animal.equals("dogs")) {
                    eat(dog);   // Dogs object upcasted to Animl when passed here
                } else if (animal.equals("cat") || animal.equals("cats")) {
                    eat(cat);   // Cat object upcasted to Animl
                } else if (animal.equals("cow") || animal.equals("cows")) {
                    eat(cow);   // Cow object upcasted to Animl
                } else {
                    System.out.println("❌ Incorrect! Please enter a correct animal (dog/cat/cow).");
                }
            } else {
                opt = false; // any number other than 1 ends the loop
            }
        }

        // ---- Closing message shown once the loop ends ----
        printDivider();
        System.out.println("👋 Thanks for visiting the farm! Goodbye.");
        printDivider();

        sc.close(); // release the Scanner's resources since we're done reading input
    }
}