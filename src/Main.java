public class Main {
    public static void main(String[] args) {
        // Assign values to these four variables
        //variable = reusable container for a value
        /*  primitive --> value stored directly to the memory (stack)
                      --> int double char boolean
        */
        /* Reference --> memory address (stack) the points to the (heap)
                     --> String, array, object
        */

        int age = 30;

        char grade = 'A';

        String name = "Clement";

        boolean isStudent = true;


        if(isStudent){
            System.out.println("You are a student");

        } else {
            System.out.println("you are not student");
        }

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

// Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
        System.out.println(isStudent);

        System.out.println(age +" "+ grade + " " + name);
    }
}