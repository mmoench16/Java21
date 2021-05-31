# Quiz  

## Questions  

### Q1: Which of the following kinds of data cannot be stored in a hash map?  

A. *String*  
B. *int*  
C. Both can be stored in a map. **x**  

### Q2: An array list is created, and three strings, "Tinker", "Evers", and "Chance", are added to it. The method *remove("Evers")* is called. Which of the following *ArrayList* methods retrieves the string "Chance"?  

A. *get(1)* **x**
B. *get(2)*  
C. *get("Chance")*    

### Q3: Which of these classes implements the *Map* interface?  

A. *Stack*  
B. *HashMap* **x**  
C. *BitSet*  

## Certification Practice  

```java
public class Recursion {
    public int dex = -1;

    public Recursion() {
        dex = getValue(17);
    }

    public int getValue(int dexValue) {
        if (dexValue > 100) {
            return dexValue;
        } else {
            return getValue(dexValue * 2);
        }
    }

    public static void main(String[] arguments) {
        Recursion r = new Recursion();
        System.out.println(r.dex);
    }
}
```
What will be the output of this application?  

A. -1  

B. 17  

C. 34  

D. 136 **x**