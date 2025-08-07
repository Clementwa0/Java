public class Strings {
    public static void main(String[] args){

        String txt = "aqswdefrgthyjukilop";

        //String Length
        System.out.println("The length of the String is " + txt.length());

//      // to uppercase and lowercase
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //indexOf()
        System.out.println(txt.indexOf("t"));
        // concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String txt2 = "It's alright.";
        String txt3 = "We \t are the \b so-called \"Vikings\" from \n the north.";
        System.out.println(txt2);
        System.out.println(txt3);

    }
}
