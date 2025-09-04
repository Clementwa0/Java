# Conditonal.java - Conditional Logic and Ternary Operator

## Overview

The `Conditonal.java` file demonstrates advanced conditional logic using the ternary operator (`? :`) and chained ternary operations. It also shows how to read user input using `Scanner`.

## Key Concepts Demonstrated

- **Ternary Operator**: `condition ? valueIfTrue : valueIfFalse`
- **Chained Ternary Operations**: Multiple nested ternary operators
- **User Input**: Reading integers with `Scanner`
- **Conditional Logic**: Door access control and number sign checking

## Code Structure

### Scanner Import and Setup

```java
import java.util.Scanner;

public class Conditonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your code:\n");
        int doorCode = scanner.nextInt();
```

### Simple Ternary Operator

```java
// Door access control using ternary operator
System.out.println(doorCode == 1337 ? "you may Enter" : "You are not allowed to order");
```

**Explanation**: If `doorCode` equals 1337, print "you may Enter", otherwise print "You are not allowed to order".

### Chained Ternary Operations

```java
int myNum = 10;

String result = (myNum > 0) ? 
    "The value is Positive" : 
    (myNum < 0) ? 
    "The value is Negative" :
    "The value is 0";
System.out.println(result);
```

**Flow Logic**:
1. First check: `myNum > 0` → If true, return "Positive"
2. Second check: `myNum < 0` → If true, return "Negative"  
3. Default: If neither condition is true, return "0"

### Resource Cleanup

```java
scanner.close();
```

## Ternary Operator Syntax

| Syntax | Description | Example |
|--------|-------------|---------|
| `condition ? valueIfTrue : valueIfFalse` | Basic ternary | `x > 0 ? "positive" : "negative"` |
| `condition1 ? value1 : (condition2 ? value2 : value3)` | Chained ternary | `x > 0 ? "pos" : (x < 0 ? "neg" : "zero")` |

## Compilation and Execution

```bash
# Compile
javac src/Conditonal.java

# Run
java -cp . Conditonal
```

## Sample Execution

```
Please enter your code:
1337
you may Enter
The value is Positive
```

## Advantages of Ternary Operator

- **Concise**: Reduces code from 4-6 lines to 1 line
- **Readable**: Clear conditional logic in a single expression
- **Efficient**: Can be used in assignments and method calls

## When to Use Ternary vs If-Else

| Use Ternary When | Use If-Else When |
|------------------|------------------|
| Simple true/false assignments | Complex logic with multiple statements |
| Single expression per branch | Need to execute multiple operations |
| Chaining simple conditions | Code readability is more important than brevity |

## Learning Objectives

After studying this file, you should understand:
- How to use the ternary operator for simple conditional assignments
- How to chain multiple ternary operations
- When to use ternary vs traditional if-else statements
- Proper resource management with Scanner
