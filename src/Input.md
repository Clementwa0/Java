# Input.java - User Input with Scanner

## Overview

The `Input.java` file demonstrates how to read user input in Java using the `Scanner` class. It shows reading both string and integer input, then performs mathematical calculations on the numeric input.

## Key Concepts Demonstrated

- **Scanner Import**: Using `java.util.Scanner` for input
- **String Input**: Reading text input with `nextLine()`
- **Integer Input**: Reading numeric input with `nextInt()`
- **Mathematical Operations**: Calculating powers of a number
- **Resource Management**: Properly closing Scanner

## Code Structure

```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for and read the user's name
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        
        System.out.println("Hello I am " + name);
        
        // Ask for and read the integer input
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        
        // Compute and print powers of n
        System.out.println(n * n);           // square
        System.out.println(n * n * n);       // cube
        System.out.println(n * n * n * n);   // fourth power
        
        scanner.close();
    }
}
```

## Scanner Setup and Import

```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
```

**Key Points:**
- **Import Statement**: `import java.util.Scanner;` at the top
- **Scanner Creation**: `Scanner scanner = new Scanner(System.in);`
- **System.in**: Standard input stream (keyboard input)

## Reading String Input

```java
System.out.println("Enter your Name:");
String name = scanner.nextLine();
System.out.println("Hello I am " + name);
```

**`nextLine()` Method:**
- Reads entire line including spaces
- Returns `String` value
- Consumes the newline character
- Best for reading names, sentences, or phrases

## Reading Integer Input

```java
System.out.println("Enter a number:");
int n = scanner.nextInt();
```

**`nextInt()` Method:**
- Reads next integer from input
- Skips whitespace before the number
- Returns `int` value
- Throws `InputMismatchException` if input is not a valid integer

## Mathematical Calculations

```java
// Compute and print powers of n
System.out.println(n * n);           // square
System.out.println(n * n * n);       // cube
System.out.println(n * n * n * n);   // fourth power
```

**Power Calculations:**
- **Square**: `n * n` or `n²`
- **Cube**: `n * n * n` or `n³`
- **Fourth Power**: `n * n * n * n` or `n⁴`

## Resource Management

```java
scanner.close();
```

**Important:**
- Always close Scanner when done
- Prevents resource leaks
- Good programming practice

## Compilation and Execution

```bash
# Compile
javac src/Input.java

# Run
java -cp . Input
```

## Sample Execution

```
Enter your Name:
Alice Johnson
Hello I am Alice Johnson
Enter a number:
3
9
27
81
```

## Common Scanner Methods

| Method | Return Type | Description | Example |
|--------|-------------|-------------|---------|
| `nextLine()` | `String` | Reads entire line | `"Hello World"` |
| `next()` | `String` | Reads next word | `"Hello"` |
| `nextInt()` | `int` | Reads next integer | `42` |
| `nextDouble()` | `double` | Reads next double | `3.14` |
| `nextBoolean()` | `boolean` | Reads next boolean | `true` |
| `nextChar()` | `char` | Reads next character | `'A'` |

## Input Validation Example

```java
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.println("Enter a positive number:");
            try {
                number = scanner.nextInt();
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
```

## Try-With-Resources (Recommended)

```java
import java.util.Scanner;

public class InputWithTryWithResources {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        } // Scanner automatically closed
    }
}
```

**Advantages:**
- Automatic resource management
- No need to manually call `close()`
- Exception-safe
- Cleaner code

## Common Input Patterns

### Reading Multiple Values
```java
System.out.println("Enter your first name:");
String firstName = scanner.nextLine();

System.out.println("Enter your last name:");
String lastName = scanner.nextLine();

System.out.println("Enter your age:");
int age = scanner.nextInt();

System.out.println("Hello " + firstName + " " + lastName + ", age " + age);
```

### Reading Mixed Input Types
```java
System.out.println("Enter a word:");
String word = scanner.next();

System.out.println("Enter a number:");
int number = scanner.nextInt();

System.out.println("Enter a decimal:");
double decimal = scanner.nextDouble();

System.out.println("Word: " + word + ", Number: " + number + ", Decimal: " + decimal);
```

## Error Handling

### InputMismatchException
```java
try {
    int number = scanner.nextInt();
    System.out.println("You entered: " + number);
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a number.");
    scanner.nextLine(); // Clear the buffer
}
```

## Learning Objectives

After studying this file, you should understand:
- How to import and use the Scanner class
- Different methods for reading different data types
- How to handle user input properly
- The importance of resource management
- How to perform calculations on user input
- Best practices for input validation and error handling
