import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    int i = scanner.nextInt();
        do {
            System.out.println(i);
            i++;
        }while( i <= 10);

        scanner.close();
    }
}
