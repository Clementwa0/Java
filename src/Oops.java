//Object-Oriented Programming.

/* 
Advantages of OOPs:
    - Fast & easy to execute → Easier debugging and modularity.
    - Reusability → Code can be reused using inheritance.
    - Data security → Achieved through encapsulation.
    - Clear structure → Code is well organized.
    - DRY principle → Avoids repetition.


Classes and Objects:
    - Class is a blueprint/template of an object.
    - Object is an instance of a class.
    - Object inherit all variables and methods from class.



*/
public class Oops {
    int x = 5;
    int k;
    int b;

//    final keyword
    final int y = 10;
    final int z = 20;

    // constructors -- > special method used to initialize objects

    public Oops(){
        b = 10;
    }

    public static void main (String[] args) {
        Oops myObj = new Oops();
        Oops myObj1 = new Oops();
        myObj.k = 40;
        myObj1.x = 30; //new Oops() creates a new instance(object) of the Oops class.
        System.out.println(myObj.x);
        System.out.println(myObj.b);
        System.out.println(myObj.k);
        System.out.println(myObj1.x);
        System.out.println(myObj1.z);
    }
}