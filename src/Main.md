# Main.java - Variables and Basic Operations

## Overview

The `Main.java` file demonstrates fundamental Java concepts including variable declarations, primitive vs reference types, conditional statements, and basic arithmetic operations.

## Key Concepts Demonstrated

- **Primitive Data Types**: `int`, `char`, `boolean`, `float`
- **Reference Data Types**: `String`
- **Conditional Logic**: `if-else` statements
- **Arithmetic Operations**: Multiplication and type casting
- **String Operations**: Length calculation and concatenation

## Code Structure

### Variable Declarations and Types

```java
int age = 30;                    // Primitive: stores value directly in memory
char grade = 'A';               // Primitive: single character
String name = "Clement";        // Reference: stores memory address to object
boolean isStudent = true;       // Primitive: true/false value
```

**Memory Storage:**
- **Primitives**: Values stored directly in stack memory
- **References**: Memory address (stack) pointing to object data (heap)

### Conditional Logic

```java
if(isStudent){
    System.out.println("You are a student");
} else {
    System.out.println("you are not student");
}
```

### Arithmetic and String Operations

```java
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

// String length calculation
System.out.println("The length of the txt string is: " + txt.length());

// Output formatting with concatenation
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
```

## Data Types Reference

| Type | Category | Example | Memory Location |
|------|----------|---------|-----------------|
| `int` | Primitive | `30` | Stack |
| `char` | Primitive | `'A'` | Stack |
| `boolean` | Primitive | `true` | Stack |
| `float` | Primitive | `9.99f` | Stack |
| `String` | Reference | `"Clement"` | Heap (via reference) |

## Compilation and Execution

```bash
# Compile
javac src/Main.java

# Run
java -cp . Main
```

## Expected Output

```
You are a student
The length of the txt string is: 26
Number of items: 50
Cost per item: 9.99$
Total cost = 499.5$
true
30 A Clement
```

## Learning Objectives

After studying this file, you should understand:
- How to declare and initialize different data types
- The difference between primitive and reference types
- Basic conditional logic with `if-else`
- String concatenation and method calls
- Arithmetic operations with mixed data types
