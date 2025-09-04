public class Recursion {
    public static int sum(int k) {
        if (k > 1) {
            return k + sum(k - 1);
        } else {
            return 1;
        }
    }
    static int factorial(int t){
        if (t > 1){
            return t * factorial(t - 1);
        }else{
            return 1;
        }
    };
    static int add(int s, int e){
        if ( e > s ) {
            return e + add(s, e-1);
        }else{
            return e;
        }
    };

    static int factR(int f){
        if ( f > 1 ){
            return f * factR(f-1);
        }else{
            return 1;
        }
    };

    public static void main(String[] args) {
        int result = sum(10);
        int fact = factorial(6);
        int A = add(4,10);
        System.out.println("The factorial of 6 is " + fact);
        System.out.println(result);
        System.out.println(A);
        System.out.println(factR(5));
    }
}