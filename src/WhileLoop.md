# WhileLoop.java - While Loop Control Structure

## Overview

The `WhileLoop.java` file demonstrates the `while` loop structure in Java, which continues executing as long as a specified condition is true. This example shows a countdown from 6 to 1.

## Key Concepts Demonstrated

- **While Loop Syntax**: `while (condition) { ... }`
- **Loop Control**: Condition-based iteration
- **Indefinite Iteration**: Loop continues until condition becomes false
- **Countdown Pattern**: Decrementing counter

## Code Structure

```java
public class WhileLoop {
    public static void main(String args[]){
        int countdown = 6;

        while (countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new year");
    }
}
```

## While Loop Anatomy

| Component | Description | Example |
|-----------|-------------|---------|
| **Condition** | `countdown > 0` | Boolean expression checked before each iteration |
| **Loop Body** | `{ System.out.println(countdown); countdown--; }` | Code executed while condition is true |
| **Update** | `countdown--` | Modifies the condition variable |

## Execution Flow

```
Initial: countdown = 6
Iteration 1: condition (6 > 0) = true → print 6 → countdown = 5
Iteration 2: condition (5 > 0) = true → print 5 → countdown = 4
Iteration 3: condition (4 > 0) = true → print 4 → countdown = 3
Iteration 4: condition (3 > 0) = true → print 3 → countdown = 2
Iteration 5: condition (2 > 0) = true → print 2 → countdown = 1
Iteration 6: condition (1 > 0) = true → print 1 → countdown = 0
Iteration 7: condition (0 > 0) = false → exit loop
Final: print "Happy new year"
```

## Compilation and Execution

```bash
# Compile
javac src/WhileLoop.java

# Run
java -cp . WhileLoop
```

## Expected Output

```
6
5
4
3
2
1
Happy new year
```

## Common While Loop Patterns

### Count Up
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Count Down
```java
int count = 10;
while (count > 0) {
    System.out.println(count);
    count--;
}
```

### User Input Validation
```java
Scanner scanner = new Scanner(System.in);
int number;
while (number < 1 || number > 10) {
    System.out.println("Enter a number between 1 and 10:");
    number = scanner.nextInt();
}
```

### File Reading
```java
while (scanner.hasNextLine()) {
    String line = scanner.nextLine();
    System.out.println(line);
}
```

## While vs For Loop Comparison

| Aspect | While Loop | For Loop |
|--------|------------|----------|
| **Syntax** | `while (condition) { ... }` | `for (init; condition; update) { ... }` |
| **Use Case** | Unknown iterations | Known iterations |
| **Variable Scope** | Declared outside loop | Can be declared in initialization |
| **Readability** | Good for complex conditions | Good for counting/iterating |

## Important Notes

### Avoiding Infinite Loops
- **Always ensure the condition will eventually become false**
- **Update the condition variable inside the loop**
- **Be careful with complex conditions**

### Example of Infinite Loop (DON'T DO THIS)
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    // Missing: i++;  ← This causes infinite loop!
}
```

## Learning Objectives

After studying this file, you should understand:
- The syntax and behavior of `while` loops
- How to trace through loop execution
- When to use `while` loops vs `for` loops
- How to avoid infinite loops
- Common patterns for countdown and counting scenarios
