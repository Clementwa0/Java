# Recursion.java - Recursive Programming

## Overview

The `Recursion.java` file demonstrates recursive programming in Java by implementing a factorial-like calculation. It shows how a method can call itself with a modified parameter until it reaches a base case.

## Key Concepts Demonstrated

- **Recursion**: Method calling itself
- **Base Case**: Condition that stops recursion
- **Recursive Case**: Condition that continues recursion
- **Stack Frames**: How recursive calls are managed in memory
- **Mathematical Recursion**: Implementing mathematical functions recursively

## Code Structure

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

## Recursive Method Analysis

### Method Signature
```java
public static int sum(int k)
```
- **Return Type**: `int` - returns an integer value
- **Parameter**: `int k` - the input value for calculation
- **Static**: Can be called without creating an object

### Base Case
```java
if (k > 1) {
    // Recursive case
} else {
    return 1;  // Base case
}
```

**Base Case Explanation:**
- When `k <= 1`, the method returns `1`
- This stops the recursion and prevents infinite loops
- Essential for every recursive function

### Recursive Case
```java
return k * sum(k - 1);
```

**Recursive Case Explanation:**
- When `k > 1`, multiply `k` by the result of `sum(k - 1)`
- Calls itself with `k - 1` (reducing the problem size)
- Each call gets closer to the base case

## Execution Trace (sum(4))

```
sum(4)
├── k = 4, condition (4 > 1) = true
├── return 4 * sum(3)
│   ├── k = 3, condition (3 > 1) = true
│   ├── return 3 * sum(2)
│   │   ├── k = 2, condition (2 > 1) = true
│   │   ├── return 2 * sum(1)
│   │   │   ├── k = 1, condition (1 > 1) = false
│   │   │   └── return 1 (base case)
│   │   └── return 2 * 1 = 2
│   └── return 3 * 2 = 6
└── return 4 * 6 = 24
```

**Final Result**: `24`

## Mathematical Function

This method calculates: `k × (k-1) × (k-2) × ... × 2 × 1`

For `sum(4)`: `4 × 3 × 2 × 1 = 24`

**Note**: This is actually calculating `k!` (k factorial), despite the method name being `sum`.

## Compilation and Execution

```bash
# Compile
javac src/Recursion.java

# Run
java -cp . Recursion
```

## Expected Output

```
3628800
```

**Explanation**: `sum(10) = 10! = 10 × 9 × 8 × 7 × 6 × 5 × 4 × 3 × 2 × 1 = 3,628,800`

## Recursion vs Iteration

### Recursive Approach (Current)
```java
public static int factorial(int n) {
    if (n <= 1) {
        return 1;
    }
    return n * factorial(n - 1);
}
```

### Iterative Approach
```java
public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}
```

### Comparison

| Aspect | Recursion | Iteration |
|--------|-----------|-----------|
| **Code Length** | Shorter, more elegant | Longer, more explicit |
| **Memory Usage** | Higher (stack frames) | Lower (single variables) |
| **Performance** | Slower (function calls) | Faster (direct computation) |
| **Readability** | More mathematical | More straightforward |
| **Stack Overflow** | Risk with large inputs | No risk |

## Common Recursive Patterns

### Fibonacci Sequence
```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

### Sum of Numbers
```java
public static int sum(int n) {
    if (n <= 0) {
        return 0;
    }
    return n + sum(n - 1);
}
```

### Power Calculation
```java
public static int power(int base, int exponent) {
    if (exponent == 0) {
        return 1;
    }
    return base * power(base, exponent - 1);
}
```

### String Reversal
```java
public static String reverse(String str) {
    if (str.length() <= 1) {
        return str;
    }
    return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
}
```

## Recursion Requirements

### 1. Base Case
- Must have a condition that stops recursion
- Prevents infinite loops
- Usually involves the smallest/simplest input

### 2. Recursive Case
- Must call itself with modified parameters
- Must move toward the base case
- Must solve a smaller version of the problem

### 3. Progress
- Each recursive call should make progress toward the base case
- Parameters should change in a way that eventually reaches the base case

## Stack Overflow Risk

```java
// This could cause StackOverflowError with large inputs
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

// Safe version with input validation
public static int factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative input");
    if (n > 20) throw new IllegalArgumentException("Input too large");
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

## Debugging Recursion

### Add Debug Output
```java
public static int sum(int k) {
    System.out.println("Calling sum(" + k + ")");
    if (k > 1) {
        int result = k * sum(k - 1);
        System.out.println("sum(" + k + ") = " + result);
        return result;
    } else {
        System.out.println("Base case: sum(1) = 1");
        return 1;
    }
}
```

## Learning Objectives

After studying this file, you should understand:
- How recursive methods work and call themselves
- The importance of base cases in recursion
- How to trace through recursive execution
- The relationship between recursion and mathematical functions
- When to use recursion vs iteration
- How to identify and prevent stack overflow issues
- Common recursive patterns and their applications
