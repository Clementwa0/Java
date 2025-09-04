# forLoop.java - For Loop Control Structure

## Overview

The `forLoop.java` file demonstrates the basic `for` loop structure in Java, which is used when you know exactly how many times you want to execute a block of code.

## Key Concepts Demonstrated

- **For Loop Syntax**: `for (initialization; condition; increment)`
- **Loop Control**: Counter variable management
- **Definite Iteration**: Known number of iterations

## Code Structure

```java
public class forLoop {
   public static void main(String[] args) {
       // used you know exactly how many times you want to loop through a block of code
       for (int i = 0; i < 5; i++){
           System.out.println(i);
       }
   } 
}
```

## For Loop Anatomy

The `for` loop consists of three parts:

| Part | Description | Example | Purpose |
|------|-------------|---------|---------|
| **Initialization** | `int i = 0` | Sets starting value | Declare and initialize counter |
| **Condition** | `i < 5` | `i < 5` | Loop continues while true |
| **Increment** | `i++` | `i++` | Update counter after each iteration |

## Execution Flow

```
Iteration 1: i = 0, condition (0 < 5) = true → print 0 → i becomes 1
Iteration 2: i = 1, condition (1 < 5) = true → print 1 → i becomes 2
Iteration 3: i = 2, condition (2 < 5) = true → print 2 → i becomes 3
Iteration 4: i = 3, condition (3 < 5) = true → print 3 → i becomes 4
Iteration 5: i = 4, condition (4 < 5) = true → print 4 → i becomes 5
Iteration 6: i = 5, condition (5 < 5) = false → exit loop
```

## Compilation and Execution

```bash
# Compile
javac src/forLoop.java

# Run
java -cp . forLoop
```

## Expected Output

```
0
1
2
3
4
```

## Common For Loop Patterns

### Count Up
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

### Count Down
```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
```

### Step by 2
```java
for (int i = 0; i < 10; i += 2) {
    System.out.println(i);
}
```

### Reverse Step
```java
for (int i = 10; i >= 0; i -= 2) {
    System.out.println(i);
}
```

## When to Use For Loops

| Use For Loop When | Use Other Loops When |
|-------------------|---------------------|
| You know the exact number of iterations | Number of iterations is unknown |
| Counting up or down | Waiting for a condition to change |
| Iterating through arrays/collections | User input determines loop duration |
| Mathematical sequences | Complex conditional logic |

## Learning Objectives

After studying this file, you should understand:
- The syntax and structure of `for` loops
- How initialization, condition, and increment work together
- When to use `for` loops vs other loop types
- How to trace through loop execution step by step
