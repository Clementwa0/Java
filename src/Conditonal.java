import java.util.Scanner;

public class Conditonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your code:\n");
        int doorCode = scanner.nextInt();

        System.out.println(doorCode == 1337 ? "you may Enter" : "You are not allowed to order");

        int myNum = 10;

        String result = (myNum > 0 ) ? 
        "The value is Positive" : 
        (myNum < 0) ? 
        "The value is Negative" :
         "The value is 0";
        System.out.println(result);

        
        scanner.close();

    }
}
