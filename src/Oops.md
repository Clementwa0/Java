# Oops.java - Object-Oriented Programming Basics

## Overview

The `Oops.java` file introduces fundamental concepts of Object-Oriented Programming (OOP) in Java, demonstrating how to create classes, instantiate objects, and access object properties.

## Key Concepts Demonstrated

- **Classes**: Blueprint or template for creating objects
- **Objects**: Instances of a class with their own data
- **Object Instantiation**: Creating objects using the `new` keyword
- **Instance Variables**: Properties that belong to each object
- **Object Access**: How to access object properties and methods

## Code Structure

```java
//Object-Oriented Programming.

/* 
Advantages of OOPs:
    - Fast & easy to execute → Easier debugging and modularity.
    - Reusability → Code can be reused using inheritance.
    - Data security → Achieved through encapsulation.
    - Clear structure → Code is well organized.
    - DRY principle → Avoids repetition.

Classes and Objects:
    - Class is a blueprint/template of an object.
    - Object is an instance of a class.
    - Object inherit all variables and methods from class.
*/

public class Oops {
    int x = 5;

    public static void main (String[] args) {
        Oops myObj = new Oops(); //new Oops() creates a new instance(object) of the Oops class
        System.out.println(myObj.x);
    }
}
```

## Class Definition

```java
public class Oops {
    int x = 5;  // Instance variable
}
```

**Class Components:**
- **Class Name**: `Oops` (should match filename)
- **Instance Variable**: `int x = 5` (property of the class)
- **Access Modifier**: `public` (accessible from other classes)

## Object Creation and Instantiation

```java
Oops myObj = new Oops();
```

**Object Creation Process:**
1. **Declaration**: `Oops myObj` - declares a variable of type `Oops`
2. **Instantiation**: `new Oops()` - creates a new object in memory
3. **Assignment**: `=` - assigns the object reference to the variable

## Accessing Object Properties

```java
System.out.println(myObj.x);
```

**Property Access:**
- **Syntax**: `objectName.propertyName`
- **Example**: `myObj.x` accesses the `x` property of `myObj`
- **Result**: Prints the value `5`

## Compilation and Execution

```bash
# Compile
javac src/Oops.java

# Run
java -cp . Oops
```

## Expected Output

```
5
```

## OOP Advantages Explained

| Advantage | Description | Example |
|-----------|-------------|---------|
| **Modularity** | Code organized into logical units | Each class has a specific purpose |
| **Reusability** | Code can be reused through inheritance | Extend existing classes |
| **Data Security** | Encapsulation protects data | Private variables with public methods |
| **Clear Structure** | Well-organized, maintainable code | Logical separation of concerns |
| **DRY Principle** | Don't Repeat Yourself | Write once, use many times |

## Class vs Object Comparison

| Aspect | Class | Object |
|--------|-------|--------|
| **Definition** | Blueprint/template | Instance of a class |
| **Memory** | No memory allocated | Memory allocated when created |
| **Usage** | Defines structure | Contains actual data |
| **Example** | `class Car { ... }` | `Car myCar = new Car();` |

## Multiple Object Creation

```java
public class Oops {
    int x = 5;
    
    public static void main(String[] args) {
        // Create multiple objects
        Oops obj1 = new Oops();
        Oops obj2 = new Oops();
        Oops obj3 = new Oops();
        
        // Each object has its own copy of x
        System.out.println("obj1.x = " + obj1.x);  // 5
        System.out.println("obj2.x = " + obj2.x);  // 5
        System.out.println("obj3.x = " + obj3.x);  // 5
        
        // Modify one object's property
        obj2.x = 10;
        System.out.println("After modification:");
        System.out.println("obj1.x = " + obj1.x);  // Still 5
        System.out.println("obj2.x = " + obj2.x);  // Now 10
        System.out.println("obj3.x = " + obj3.x);  // Still 5
    }
}
```

## Instance Variables vs Local Variables

```java
public class Oops {
    int x = 5;  // Instance variable - belongs to each object
    
    public void method() {
        int y = 10;  // Local variable - only exists in this method
        System.out.println("Instance variable x: " + x);
        System.out.println("Local variable y: " + y);
    }
}
```

| Variable Type | Scope | Memory Location | Lifecycle |
|---------------|-------|-----------------|-----------|
| **Instance** | Entire class | Heap (with object) | As long as object exists |
| **Local** | Method only | Stack | Only during method execution |

## Object Reference vs Value

```java
public class Oops {
    int x = 5;
    
    public static void main(String[] args) {
        Oops obj1 = new Oops();
        Oops obj2 = obj1;  // Both variables point to same object
        
        System.out.println("obj1.x = " + obj1.x);  // 5
        System.out.println("obj2.x = " + obj2.x);  // 5
        
        obj1.x = 10;  // Modify through obj1
        
        System.out.println("After modification:");
        System.out.println("obj1.x = " + obj1.x);  // 10
        System.out.println("obj2.x = " + obj2.x);  // 10 (same object!)
    }
}
```

## Common OOP Patterns

### Simple Data Class
```java
public class Person {
    String name;
    int age;
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;
        
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
    }
}
```

### Multiple Properties
```java
public class Car {
    String brand;
    String model;
    int year;
    double price;
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2023;
        myCar.price = 25000.0;
        
        System.out.println("Car: " + myCar.year + " " + myCar.brand + " " + myCar.model);
        System.out.println("Price: $" + myCar.price);
    }
}
```

## Memory Management

### Object Creation in Memory
```
Stack Memory          Heap Memory
┌─────────────┐      ┌─────────────┐
│ myObj       │ ────▶│ Oops object │
│ (reference) │      │ x = 5       │
└─────────────┘      └─────────────┘
```

- **Stack**: Stores reference variable `myObj`
- **Heap**: Stores actual object with its data
- **Reference**: Points from stack to heap location

## Best Practices

### Naming Conventions
```java
// Class names: PascalCase
public class Student { ... }
public class BankAccount { ... }

// Object names: camelCase
Student student1 = new Student();
BankAccount myAccount = new BankAccount();

// Instance variables: camelCase
String firstName;
int studentId;
```

### Access Modifiers
```java
public class Oops {
    private int x = 5;  // Private - only accessible within class
    public int y = 10;  // Public - accessible from anywhere
    protected int z = 15; // Protected - accessible in same package and subclasses
}
```

## Learning Objectives

After studying this file, you should understand:
- What classes and objects are in Java
- How to create objects using the `new` keyword
- How to access object properties and methods
- The difference between classes and objects
- How objects are stored in memory
- Basic OOP principles and advantages
- How to create multiple objects from the same class
- The concept of object references vs values
