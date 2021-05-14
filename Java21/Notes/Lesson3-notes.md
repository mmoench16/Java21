# Quiz

## Questions  

### Q1: What operator do you use to call an object's constructor and create a new object?  

A. +  
B. new **x**  
C. instanceof  

### Q2: What kinds of methods apply to all objects of a class rather than an individual object?  
   
A. Universal Methods  
B. Instance methods  
C. Class methods **x**  

### Q3: If you have a programme with objects named *obj1* and *obj2*, what happens when you use the statement *obj2* = *obj1*?  

A. The instance variables in *obj2* are given the same values as *obj1*.  
B. *obj2* and *obj1* are considered to be the same  object. **x**  
C. Neither A nor B

## Certification Practice

```java
public class AyeAye {
    int i = 40;
    int j;

    public AyeAye() {
        setValue(i++);
    }

    void setValue(int inputValue) {
        int i = 20;
        j = i + 1;
        System.out.println("j = " + j);
    }
}
```

What is the value of *j* at the time it is displayed inside the *setValue()* method?  

A. 42  
B. 40  
C. 21 **x**  
D. 20  
