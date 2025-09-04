# nestedLoop.java - Nested Loop Control Structure

## Overview

The `nestedLoop.java` file demonstrates nested `for` loops in Java, where one loop is placed inside another. This example creates a simple multiplication table by printing the product of two counters.

## Key Concepts Demonstrated

- **Nested Loops**: Loop inside another loop
- **Outer and Inner Loops**: Two levels of iteration
- **Multiplication Table**: Mathematical pattern generation
- **Loop Control**: Independent counters for each loop level

## Code Structure

```java
public class nestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println(i * j + " ");
            }
            System.out.println();
        }
    }
}
```

## Nested Loop Anatomy

| Component | Description | Purpose |
|-----------|-------------|---------|
| **Outer Loop** | `for(int i = 1; i <= 3; i++)` | Controls rows |
| **Inner Loop** | `for (int j = 1; j <= 3; j++)` | Controls columns |
| **Product Calculation** | `i * j` | Multiplies current values |
| **Line Break** | `System.out.println()` | Separates rows |

## Execution Flow

```
Outer Iteration 1: i = 1
  Inner Iteration 1: j = 1 → print 1*1 = 1
  Inner Iteration 2: j = 2 → print 1*2 = 2  
  Inner Iteration 3: j = 3 → print 1*3 = 3
  Print empty line

Outer Iteration 2: i = 2
  Inner Iteration 1: j = 1 → print 2*1 = 2
  Inner Iteration 2: j = 2 → print 2*2 = 4
  Inner Iteration 3: j = 3 → print 2*3 = 6
  Print empty line

Outer Iteration 3: i = 3
  Inner Iteration 1: j = 1 → print 3*1 = 3
  Inner Iteration 2: j = 2 → print 3*2 = 6
  Inner Iteration 3: j = 3 → print 3*3 = 9
  Print empty line
```

## Compilation and Execution

```bash
# Compile
javac src/nestedLoop.java

# Run
java -cp . nestedLoop
```

## Expected Output

```
1 
2 
3 

2 
4 
6 

3 
6 
9 
```

## Common Nested Loop Patterns

### Multiplication Table (Formatted)
```java
for(int i = 1; i <= 5; i++){
    for (int j = 1; j <= 5; j++){
        System.out.print(i * j + "\t");
    }
    System.out.println();
}
```

### Pattern Printing (Stars)
```java
for(int i = 1; i <= 4; i++){
    for (int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
}
```

### 2D Array Traversal
```java
int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
for(int i = 0; i < matrix.length; i++){
    for (int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Coordinate System
```java
for(int x = 0; x < 3; x++){
    for (int y = 0; y < 3; y++){
        System.out.println("(" + x + "," + y + ")");
    }
}
```

## Nested Loop Complexity

| Pattern | Outer Iterations | Inner Iterations | Total Operations |
|---------|------------------|------------------|------------------|
| 3x3 Grid | 3 | 3 each | 9 |
| 5x5 Grid | 5 | 5 each | 25 |
| nxn Grid | n | n each | n² |

**Time Complexity**: O(n²) for n×n patterns

## When to Use Nested Loops

| Use Nested Loops When | Use Single Loops When |
|----------------------|----------------------|
| Working with 2D data structures | Processing 1D arrays |
| Creating patterns or grids | Simple counting/iteration |
| Matrix operations | Linear searches |
| Coordinate systems | Single-variable problems |

## Performance Considerations

### Efficient Nested Loops
```java
// Good: Clear bounds
for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
        // Process element
    }
}
```

### Avoid Unnecessary Nesting
```java
// Avoid: Unnecessary nested loop
for(int i = 0; i < n; i++){
    for(int j = 0; j < 1; j++){  // This is just a single iteration
        // Process
    }
}

// Better: Single loop
for(int i = 0; i < n; i++){
    // Process
}
```

## Debugging Nested Loops

### Add Debug Output
```java
for(int i = 1; i <= 3; i++){
    System.out.println("Outer loop: i = " + i);
    for (int j = 1; j <= 3; j++){
        System.out.println("  Inner loop: j = " + j + ", product = " + (i * j));
    }
    System.out.println();
}
```

## Learning Objectives

After studying this file, you should understand:
- How nested loops work and execute
- The relationship between outer and inner loop counters
- When to use nested loops vs single loops
- How to trace through nested loop execution
- Common patterns for 2D data processing
- Performance implications of nested loops
