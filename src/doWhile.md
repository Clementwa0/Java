# doWhile.java - Do-While Loop Control Structure

## Overview

The `doWhile.java` file demonstrates the `do-while` loop structure in Java, which executes the loop body at least once before checking the condition. This example reads user input and prints numbers from the input value up to 10.

## Key Concepts Demonstrated

- **Do-While Loop Syntax**: `do { ... } while (condition);`
- **Guaranteed Execution**: Loop body runs at least once
- **User Input**: Reading integers with `Scanner`
- **Conditional Iteration**: Continues based on user input

## Code Structure

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

## Do-While Loop Anatomy

| Component | Description | Example |
|-----------|-------------|---------|
| **Do Block** | `do { ... }` | Code executed at least once |
| **Loop Body** | `{ System.out.println(i); i++; }` | Statements inside the loop |
| **While Condition** | `while (i <= 10)` | Condition checked after each iteration |

## Execution Flow

**Example with input = 7:**
```
Initial: i = 7 (from user input)
Iteration 1: Execute body → print 7 → i = 8 → check (8 <= 10) = true
Iteration 2: Execute body → print 8 → i = 9 → check (9 <= 10) = true  
Iteration 3: Execute body → print 9 → i = 10 → check (10 <= 10) = true
Iteration 4: Execute body → print 10 → i = 11 → check (11 <= 10) = false
Exit loop
```

**Example with input = 15:**
```
Initial: i = 15 (from user input)
Iteration 1: Execute body → print 15 → i = 16 → check (16 <= 10) = false
Exit loop (only one iteration)
```

## Compilation and Execution

```bash
# Compile
javac src/doWhile.java

# Run
java -cp . doWhile
```

## Sample Executions

### Input: 5
```
Enter an integer
5
5
6
7
8
9
10
```

### Input: 12
```
Enter an integer
12
12
```

## Do-While vs While vs For Comparison

| Loop Type | Syntax | Execution | Use Case |
|-----------|--------|-----------|----------|
| **Do-While** | `do { ... } while (condition);` | At least once, then condition | Menu systems, user validation |
| **While** | `while (condition) { ... }` | Zero or more times | Unknown iterations |
| **For** | `for (init; condition; update) { ... }` | Zero or more times | Known iterations |

## Common Do-While Patterns

### Menu System
```java
int choice;
do {
    System.out.println("1. Add");
    System.out.println("2. Delete");
    System.out.println("3. Exit");
    choice = scanner.nextInt();
    // Process choice
} while (choice != 3);
```

### Input Validation
```java
int number;
do {
    System.out.println("Enter a positive number:");
    number = scanner.nextInt();
} while (number <= 0);
```

### Game Loop
```java
boolean playAgain;
do {
    // Play game
    System.out.println("Play again? (true/false)");
    playAgain = scanner.nextBoolean();
} while (playAgain);
```

## When to Use Do-While

| Use Do-While When | Use Other Loops When |
|-------------------|---------------------|
| You need at least one execution | Zero executions might be needed |
| Menu-driven programs | Counting/iterating with known bounds |
| Input validation | File processing (might be empty) |
| User interaction loops | Array/collection iteration |

## Important Notes

### Semicolon Required
- **Always include semicolon after while condition**: `} while (condition);`

### Resource Management
- **Always close Scanner**: `scanner.close();`
- **Consider using try-with-resources for automatic cleanup**

### Example with Try-With-Resources
```java
try (Scanner scanner = new Scanner(System.in)) {
    // do-while loop here
} // Scanner automatically closed
```

## Learning Objectives

After studying this file, you should understand:
- The syntax and behavior of `do-while` loops
- How do-while differs from while and for loops
- When to use do-while loops
- How to handle user input in loops
- Proper resource management with Scanner
