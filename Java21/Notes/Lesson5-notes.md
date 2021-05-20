# Quiz  

## Questions  

### Q1: If a local variable has the same name as an instance variable, how can you refer to the instance variable in the scope of the local variable?  

A. You can't; you should rename one of the variables.  
B. Use the keyword *this* before the instance variable name. **x**  
C. Use the keyword *super* before the name.  

### Q2: Where are instance variables declared in a class?  

A. Anywhere in the class.  
B. Outside all methods in the class. **x**  
C. After the class declaration and above the first method. (**x**)

### Q3: How can you send a program an argument that includes a space or spaces?  

A. Surround the argument with double quotes. **x**  
B. Separate the arguments with commas.  
C. Separate the arguments with periods.  

## Certification Practice  

Given:  

```java
public class BigValue {
    float result;

    public BigValue(int a, int b) {
        result = calculateResult(a, b);
    }

    float calculateResult(int a, int b) {
        return (a * 10) + (b * 2);
    }

    public static void main(String[] arguments) {
        BiggerValue bgr = new BiggerValue(2, 3, 4);
        System.out.println("The result is " + bgr.result);
    }
}

class BiggerValue extends BigValue {

    BiggerValue(int a, int b, int c) {
        super(a, b);
        result = calculateResult(a, b, c);
    }

    // answer goes here
        return (c * 3) * result;
    }
}
```

What statement should replace *// answer goes here* so that the *result* variable equals 312.0?  

A. *float calculateResult(int c) {*  
B. *float calculateResult(int a, int b) {*  
C. *float calculateResult(int a, int b, int c) {*  **x**
D. *float claculateResult() {*  