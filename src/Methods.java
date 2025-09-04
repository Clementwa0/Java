// block of code that runs only when called

public class Methods{
    static void myMethod(String fname, int age ){
        System.out.println(fname + " is " + age);

        if (age < 18) {
            System.out.println("Access Denied");
        }
        if (age > 18) {
            System.out.println("Access Granted");
        }
    };

    static int myMethod(int X, int Y) {
        return Y + X;
    };


    public static void main(String[] args){
        myMethod("Jenney", 5);
        myMethod("Anja", 31);
        int Z = myMethod(5, 3);

        System.out.print(Z);
    };
};

// parameters  --> act as variables inside a method
//static void myMethod(String fname) --> takes a string called fname
//Arguments --> a parameter passed to a method
//  overloading --> multiple methods can have thr same name with different parameters.

