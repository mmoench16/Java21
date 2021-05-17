# Quiz  

## Questions  

### Q1: What kind of loop is used to execute the statements in the loop at least once before the conditional expression is evaluated?  

A. *do-while* **x**  
B. *for*  
C. *while*  

### Q2: Which of the following cannot be used as the test in a *case* statement?  

A. Characters  
B. Strings  
C. Objects **x**  

### Q3: Which instance variable of an array is used to find out how big the array is?  

A. *size*  
B. *length* **x**  
C. *MAX_VALUE*  

## Certification Practice  

```java
public class Cases {
    public static void main(String[] arguments) {
        float x = 9;
        float y = 5;
        int z = (int)(x / y);
        switch (z) {
            case 1:
                x = x + 2;
            case 2:
                x = x + 3;
            default:
                x = x + 1;
        }
        System.out.println("Value of x: " + x);
    }
}
```

A. 9.0  
B. 11.0 
C. 15.0  
D. The program will not compile

Answer (c) is correct. Because the switch statement does not contain any break statements and z equals 1, all three case statements are executed, making x equal 15.0.