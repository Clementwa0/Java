// Object-Oriented Programming Example in Java

/*
 * ===============================
 * Advantages of OOP:
 * ===============================
 * 1. Fast & Easy to Execute → Easier debugging and modularity.
 * 2. Reusability → Code can be reused using inheritance.
 * 3. Data Security → Achieved through encapsulation.
 * 4. Clear Structure → Code is well organized and maintainable.
 * 5. DRY Principle → Avoids code repetition.
 *
 * ===============================
 * Classes and Objects:
 * ===============================
 * - Class is a blueprint/template for creating objects.
 * - Object is an instance of a class.
 * - Objects have their own copies of instance variables and can use class methods.
 */

public class Oops {

    // ===== Instance Variables =====
    int x = 5;       // Default value assigned at declaration
    int k;           // Will be assigned later manually
    int b;           // Will be initialized using the constructor

    // ===== Final Variables =====
    // Final variables are constants and cannot be modified after initialization.
    final int y = 10;
    final int z = 20;

    // ===== Constructor =====
    // Constructor is a special method that runs automatically when an object is created.
    public Oops() {
        b = 10; // Initialize variable 'b' whenever a new object is created.
    }

    // ===== Main Method =====
    // Entry point of the program
    public static void main(String[] args) {

        // Create two separate objects of the Oops class
        Oops firstObject = new Oops();
        Oops secondObject = new Oops();

        // Assign values to instance variables
        firstObject.k = 40;       // Set value of k for firstObject
        secondObject.x = 30;      // Change default x value for secondObject only

        // ===== Output Section =====
        // Demonstrate how each object has its own copy of variables
        System.out.println("=== First Object Values ===");
        System.out.println("x (default): " + firstObject.x); // Output: 5
        System.out.println("b (set by constructor): " + firstObject.b); // Output: 10
        System.out.println("k (assigned manually): " + firstObject.k); // Output: 40

        System.out.println("\n=== Second Object Values ===");
        System.out.println("x (modified): " + secondObject.x); // Output: 30
        System.out.println("z (final constant): " + secondObject.z); // Output: 20

        // ===== Final Keyword Demonstration =====
        // Uncommenting the line below will cause a compile-time error,
        // because 'z' is declared as final and cannot be changed.
        // secondObject.z = 50; // ❌ ERROR
    }
}
