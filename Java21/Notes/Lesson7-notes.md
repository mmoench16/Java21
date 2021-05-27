# Quiz  

## Questions  

### Q1: What keyword is used to jump out of a *try* block and into a *finally* block?  

A. *catch*  
B. *return* **x**  
C. *while*  

### Q2: What class should be the superclass of any exceptions you create in Java?  

A. *Throwable*  
B. *Error*  
C. *Exception* **x**  

### Q3: If a class implements the *Runnable* interface, what methods must the class contain?  

A. *start(), stop()* and *run()*  
B. *actionPerformed()*  
C. *run()*  

## Certification Practice  

The *AverageValue* application is supposed to take up to 10 floating-point numbers as command-line arguments and display their average?  

```java
public class AverageValue {
    public static void main(String[] arguments) {
        float[] temps = new float[10];
        float sum = 0;
        int count = 0;
        int i;
        for (i = 0; i < arguments.length & i < 10; i++) {
            try {
                temps[i] = Float.parseFloat(arguments[i]);
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input: " + arguments[i]);
            }
            sum += temps[i];
        }
        System.out.println("Average: " + (sum / i));
    }
}
```

Which statement contains an error?

A. for (i = 0; i < arguments.length & i < 10; i++) {  

B. sum += temps[i]; 

C. System.out.println("Average: " + (sum / i)); **x**   

D. None of them; the program is correct.  