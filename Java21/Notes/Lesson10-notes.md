# Quiz  

## Questions  

### Q1: Which user interface component is common in software installation programs?  

A. Slider  
B. Progress bars **x**  
C. Dialogs

### Q2: Which Java package includes a class for clickable buttons?  

A. java.awt (Abstract Window Toolkit)  
B. javax.swing (Swing)  
C. Both **x**  

### Q3: Which user interface component can be picked up and moved around?  

A. JSlider  
B. JToolBar **x**  
C. Both  

## Certification Practice  

```java
import java.awt.*;
import javax.swing.*;

public class AskFrame extends JFrame {
    public AskFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider value = new JSlider(0, 255, 100);
        add(value);
        setSize(450, 150);
        setVisible(true);
        super();
    }

    public static void main(String[] arguments) {
        AskFrame af = new AskFrame();
    }
}
```

### What will happen when you attempt to compile and run this source code?  

A. It compiles without error and runs correctly.  
B. It compiles with error but does not display anything in the frame.  
C. It does not compile because of the *super()* statement. **x**  
D. It does not compile because of the *add()* statement.  