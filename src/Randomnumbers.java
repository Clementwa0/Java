import java.util.Random;


public class Randomnumbers {
    public static void main(String[] args){
        Random random = new Random();

        int number1;
        number1 = random.nextInt(1, 102);

        double number2;
        number2 = random.nextDouble();


        System.out.println(number1);
        System.out.println(number2);

    }
}
