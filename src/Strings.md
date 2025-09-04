# Strings.java - String Operations and Methods

## Overview

The `Strings.java` file demonstrates various string operations and methods available in Java, including length calculation, case conversion, character indexing, concatenation, and escape sequences.

## Key Concepts Demonstrated

- **String Length**: Using `length()` method
- **Case Conversion**: `toUpperCase()` and `toLowerCase()`
- **Character Indexing**: Using `indexOf()` method
- **String Concatenation**: Using `+` operator and `concat()` method
- **Escape Sequences**: Special characters in strings

## Code Structure

```java
public class Strings {
    public static void main(String[] args) {
        String txt = "aqswdefrgthyjukilop";
        
        // String Length
        System.out.println("The length of the String is " + txt.length());
        
        // Case conversion
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        // Character indexing
        System.out.println(txt.indexOf("t"));
        
        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        
        // Escape sequences
        String txt2 = "It's alright.";
        String txt3 = "We \t are the \b so-called \"Vikings\" from \n the north.";
        System.out.println(txt2);
        System.out.println(txt3);
    }
}
```

## String Length

```java
String txt = "aqswdefrgthyjukilop";
System.out.println("The length of the String is " + txt.length());
```

**Output**: `The length of the String is 19`

**Key Points:**
- `length()` returns the number of characters in the string
- Returns `int` value
- Includes all characters (letters, numbers, spaces, symbols)

## Case Conversion

```java
System.out.println(txt.toUpperCase());  // AQSWDEFRGTHYUJUKILOP
System.out.println(txt.toLowerCase());  // aqswdefrgthyjukilop
```

**Methods:**
- `toUpperCase()`: Converts all characters to uppercase
- `toLowerCase()`: Converts all characters to lowercase
- **Note**: These methods return new strings; original string is unchanged

## Character Indexing

```java
System.out.println(txt.indexOf("t"));  // 6
```

**`indexOf()` Method:**
- Returns the index of the first occurrence of a character/substring
- Returns `-1` if character/substring not found
- Index starts from 0

**Example with our string:**
```
String: "aqswdefrgthyjukilop"
Index:   0123456789012345678
         aqswdefrgthyjukilop
                    ↑
                  't' at index 6
```

## String Concatenation

### Method 1: Using `+` Operator
```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);  // John Doe
```

### Method 2: Using `concat()` Method
```java
System.out.println(firstName.concat(lastName));  // JohnDoe
```

**Comparison:**
| Method | Syntax | Result | Use Case |
|--------|--------|--------|----------|
| `+` | `str1 + str2` | `"John Doe"` | General concatenation |
| `concat()` | `str1.concat(str2)` | `"JohnDoe"` | Direct concatenation |

## Escape Sequences

```java
String txt2 = "It's alright.";
String txt3 = "We \t are the \b so-called \"Vikings\" from \n the north.";
System.out.println(txt2);
System.out.println(txt3);
```

**Common Escape Sequences:**

| Sequence | Description | Output |
|----------|-------------|---------|
| `\"` | Double quote | `"` |
| `\'` | Single quote | `'` |
| `\\` | Backslash | `\` |
| `\n` | New line | Line break |
| `\t` | Tab | Tab space |
| `\b` | Backspace | Erases previous character |
| `\r` | Carriage return | Return to beginning of line |

**Output of txt3:**
```
We 	 are the so-called "Vikings" from 
 the north.
```

## Compilation and Execution

```bash
# Compile
javac src/Strings.java

# Run
java -cp . Strings
```

## Expected Output

```
The length of the String is 19
AQSWDEFRGTHYUJUKILOP
aqswdefrgthyjukilop
6
John Doe
JohnDoe
It's alright.
We 	 are the so-called "Vikings" from 
 the north.
```

## Additional String Methods

### Common String Operations
```java
String text = "Hello World";

// Length
int len = text.length();                    // 11

// Character access
char first = text.charAt(0);               // 'H'
char last = text.charAt(text.length()-1);  // 'd'

// Substring
String sub = text.substring(0, 5);         // "Hello"
String from = text.substring(6);           // "World"

// Comparison
boolean equal = text.equals("Hello World"); // true
boolean ignoreCase = text.equalsIgnoreCase("hello world"); // true

// Search
boolean contains = text.contains("World");  // true
int index = text.indexOf("World");          // 6
int lastIndex = text.lastIndexOf("l");      // 9

// Replace
String replaced = text.replace("World", "Java"); // "Hello Java"

// Trim whitespace
String spaced = "  Hello  ";
String trimmed = spaced.trim();             // "Hello"
```

## String Immutability

**Important Concept:**
- Strings in Java are **immutable** (cannot be changed)
- Methods like `toUpperCase()` return **new** strings
- Original string remains unchanged

```java
String original = "hello";
String upper = original.toUpperCase();  // Creates new string "HELLO"
System.out.println(original);           // Still prints "hello"
System.out.println(upper);              // Prints "HELLO"
```

## Performance Considerations

### String Concatenation in Loops
```java
// Inefficient: Creates new string each iteration
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "a";  // Creates 1000 new strings!
}

// Efficient: Use StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("a");
}
String result = sb.toString();
```

## Learning Objectives

After studying this file, you should understand:
- How to use common string methods (`length()`, `toUpperCase()`, `toLowerCase()`)
- How to find character positions with `indexOf()`
- Different ways to concatenate strings
- How escape sequences work in strings
- The concept of string immutability
- When to use different string methods for different purposes
