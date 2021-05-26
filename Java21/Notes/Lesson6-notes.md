# Quiz  

## Questions  

### Q1: What packages are automatically imported into your Java classes?  

A. None  
B. The classes stored in the folders of your *Classpath*.  
C. The classes in the *java.lang* package **x**  

### Q2: According to the convention for naming packages, what should be the first part of the name of a package you create?  

A. Your name followed by a period.  
B. Your top-level Internet domain followed by a period. **x**  
C. The text *java* followed by a aperiod.  

### Q3: If you create a subclass and override a public method, what access modifiers can you use with that method?  

A. *public* only **x**  
B. public or protected
C. *public, protected*, or default access  

## Certification Practice  

Given:  
```java
package org.cadenhead.bureau;

public class Information {
    public int duration = 12;
    protected float rate = 3.15F;
    float average = 0.5F;
}
```  

and:  
```java
package org.cadenhead.bureau;

public class MoreInformation extends Information {
    public int quantity = 8;
}
```  

and:  
```java
package org.cadenhead.bureau.us;

import org.cadenhead.bureau.*;

public class EvenMoreInformation extends MoreInformation {
    public int quantity = 9;

    EvenMoreInformation() {
        super();
        int i1 = duration;
        float i2 = rate;
        float i3 = average;
    }
}
```

Which instance variables are visible in the *EvenMoreInformation* class?  

A. *quantity, duration, rate* and *average*  
B. *quantity, duration,* and *rate* **x**   
C. *quantity, duration,* and *average*  
D. *quantity, rate* and *average*  