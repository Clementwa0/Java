// Demonstration of Java Methods
// A method is a block of code that runs only when it is called.

public class Methods {

    /*
     * ===============================
     * Static Method with Parameters
     * ===============================
     * - Takes a String (fname) and an integer (age) as parameters.
     * - Prints a message and performs a simple age check.
     */
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old.");

        // Conditional logic to grant or deny access based on age
        if (age < 18) {
            System.out.println("Access Denied");
        } else if (age >= 18) {
            System.out.println("Access Granted");
        }
    }

    /*
     * ===============================
     * Method Overloading Example
     * ===============================
     * - Same method name 'myMethod', but with different parameters.
     * - Returns the sum of two integers.
     */
    static int myMethod(int X, int Y) {
        return X + Y; // returns the sum of X and Y
    }

    /*
     * ===============================
     * Non-Static Method
     * ===============================
     * - These methods require an object to be created before calling.
     */

    // Simple method without parameters
    public void fullThrottle() {
        System.out.println("The car is speeding!");
    }

    // Method with a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed + " km/h");
    }

    /*
     * ===============================
     * Main Method - Entry Point
     * ===============================
     */
    public static void main(String[] args) {

        // Calling the first static method with different arguments
        myMethod("Jenney", 5);  // Expected: Access Denied
        myMethod("Anja", 31);   // Expected: Access Granted

        // Calling overloaded static method to perform addition
        int sumResult = myMethod(5, 3);

        // Creating an object to call non-static methods
        Methods myCar = new Methods();

        // Calling instance methods
        myCar.fullThrottle();
        myCar.speed(200);

        // Display the sum result
        System.out.println("The sum is: " + sumResult);
    }
}

/*
 * ==============================================
 * Notes:
 * ==============================================
 * 1. Parameters → Act as variables inside a method.
 *    Example: static void myMethod(String fname, int age)
 *
 * 2. Arguments → The actual values passed to a method.
 *    Example: myMethod("Jenney", 5);
 *
 * 3. Method Overloading → Multiple methods can have the same name
 *    but different parameter types or numbers.
 *
 * 4. Static vs Non-Static Methods:
 *    - Static methods can be called without creating an object.
 *    - Non-static methods require creating an object first.
 */
