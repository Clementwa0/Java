---
title: Java Basics Examples
description: A collection of small Java programs demonstrating variables, conditionals, loops, methods, strings, input handling, and recursion.
language: Java
---

# Java Basics Examples

## Overview

This repository contains a set of concise Java classes that illustrate core programming concepts:

- **Variables and primitives/reference types** (`Main`)
- **Conditional logic and the ternary operator** (`Conditonal`)
- **Looping constructs**: `for` (`forLoop`), `while` (`WhileLoop`), `do-while` (`doWhile`), and **nested loops** (`nestedLoop`)
- **Methods**: parameters, return values, and simple overloading (`Methods`)
- **String operations**: length, case conversion, indexing, concatenation, and escape sequences (`Strings`)
- **User input** using `java.util.Scanner` (`Input`)
- **Recursion** with a factorial-like example (`Recursion`)

Each class includes a `main` method and can be compiled and run independently. This makes it easy to experiment with one concept at a time.

## Prerequisites

- **Java Development Kit (JDK) 8+** installed
- A terminal/shell to run `javac` and `java`
- Optional: An IDE (IntelliJ IDEA, VS Code, Eclipse) for easier editing and running

You can verify Java is available with:

```bash
java -version
javac -version
```

## Installation and Usage

This project has no build system (no Maven/Gradle). Use `javac` directly.

1. Navigate to the project root:
   ```bash
   cd /home/klemoh/Java
   ```
2. Compile all sources into an `out` directory:
   ```bash
   mkdir -p out && javac -d out src/*.java
   ```
3. Run any example class (pick one at a time):
   ```bash
   java -cp out Main
   java -cp out Conditonal
   java -cp out forLoop
   java -cp out WhileLoop
   java -cp out doWhile
   java -cp out nestedLoop
   java -cp out Methods
   java -cp out Strings
   java -cp out Input
   java -cp out Recursion
   ```

Notes:
- Classes like `forLoop`, `doWhile`, and `nestedLoop` intentionally use lowercase first letters to match the filenames; use the exact class names when running.
- Programs that read input (`Input`, `Conditonal`, `doWhile`) expect terminal input and will wait for your response.

### Quick Reference Table

| Class        | Concept(s) Demonstrated                                      | Entry Point                     |
|--------------|---------------------------------------------------------------|----------------------------------|
| `Main`       | Variables, primitives vs references, simple `if/else`, math   | `public static void main(String[])` |
| `Conditonal` | Scanner input, ternary operator, chained ternaries            | `main`                           |
| `forLoop`    | `for` loop                                                    | `main`                           |
| `WhileLoop`  | `while` loop, countdown                                       | `main`                           |
| `doWhile`    | `do-while` loop with input                                    | `main`                           |
| `nestedLoop` | Nested loops, multiplication table cells                      | `main`                           |
| `Methods`    | Methods, conditional logic inside a method, overloading       | `main`                           |
| `Strings`    | String API: length, case, index, concatenation, escapes       | `main`                           |
| `Input`      | Scanner input, reading `String` and `int`, simple arithmetic  | `main`                           |
| `Recursion`  | Recursive multiplication (factorial-like)                     | `main`                           |

## Code Walkthrough

Below are annotated snippets organized by topic. Each snippet is preceded by an explanation.

### Variables, Types, and Basic I/O (`Main`)

Demonstrates primitive vs reference types, `if/else`, arithmetic, and string length.

```java
public class Main {
    public static void main(String[] args) {
        int age = 30;
        char grade = 'A';
        String name = "Clement";
        boolean isStudent = true;

        if (isStudent) {
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

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
        System.out.println(isStudent);

        System.out.println(age + " " + grade + " " + name);
    }
}
```

Key points:
- **Primitives**: `int`, `char`, `boolean`, `float` store values directly.
- **Reference types**: `String` references objects.
- `String.length()` returns the number of characters.

### Ternary Operator and Input (`Conditonal`)

Reads an integer door code and uses ternary operations to determine output. Also shows a chained ternary for sign checking.

```java
import java.util.Scanner;

public class Conditonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your code:\n");
        int doorCode = scanner.nextInt();

        System.out.println(doorCode == 1337 ? "you may Enter" : "You are not allowed to order");

        int myNum = 10;
        String result = (myNum > 0) ?
            "The value is Positive" :
            (myNum < 0) ?
            "The value is Negative" :
            "The value is 0";
        System.out.println(result);

        scanner.close();
    }
}
```

### Loops

#### For loop (`forLoop`)
Counts from 0 to 4 using a `for` loop.

```java
public class forLoop {
   public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
           System.out.println(i);
       }
   }
}
```

#### While loop (`WhileLoop`)
Counts down from 6 to 1, then prints a celebration message.

```java
public class WhileLoop {
    public static void main(String args[]) {
        int countdown = 6;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new year");
    }
}
```

#### Do-while loop (`doWhile`)
Reads a starting integer and prints numbers up to 10 using a `do-while` loop.

```java
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int i = scanner.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        scanner.close();
    }
}
```

#### Nested loops (`nestedLoop`)
Nested loops compute and print simple multiplication products.

```java
public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i * j + " ");
            }
            System.out.println();
        }
    }
}
```

### Methods and Overloading (`Methods`)

Demonstrates defining methods with parameters, conditional logic inside a method, and an overloaded method returning a value.

```java
public class Methods {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
        if (age < 18) {
            System.out.println("Access Denied");
        }
        if (age > 18) {
            System.out.println("Access Granted");
        }
    }

    static int myMethod(int X, int Y) {
        return Y + X;
    }

    public static void main(String[] args) {
        myMethod("Jenney", 5);
        myMethod("Anja", 31);
        int Z = myMethod(5, 3);
        System.out.print(Z);
    }
}
```

Parameters and return values:

| Method signature                 | Parameters                 | Returns | Notes                         |
|----------------------------------|----------------------------|---------|-------------------------------|
| `void myMethod(String, int)`     | `fname` (name), `age`      | `void`  | Prints and gates by `age`     |
| `int myMethod(int X, int Y)`     | `X`, `Y`                   | `int`   | Returns sum of two integers   |

### String Operations (`Strings`)

Illustrates common string operations and escape sequences.

```java
public class Strings {
    public static void main(String[] args) {
        String txt = "aqswdefrgthyjukilop";
        System.out.println("The length of the String is " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("t"));
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
```

### Reading User Input (`Input`)

Prompts for a name and a number, then prints the square, cube, and fourth power of the number.

```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        System.out.println("Hello I am " + name);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.println(n * n);           // square
        System.out.println(n * n * n);       // cube
        System.out.println(n * n * n * n);   // fourth power
        scanner.close();
    }
}
```

### Recursion (`Recursion`)

Computes the product from `k` down to `1` recursively (i.e., `k!`).

```java
public class Recursion {
    public static int sum(int k) {
        if (k > 1) {
            return k * sum(k - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
```

## Tips and Common Pitfalls

- **Class names are case-sensitive** when running with `java`. Use the exact class name.
- Close `Scanner` instances after use to release system resources.
- For simple projects like this, `javac` is sufficient. For larger projects, consider **Maven** or **Gradle**.

## License

No license specified. Add one if you plan to share or reuse this code.


