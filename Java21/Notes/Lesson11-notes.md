# Quiz  

## Questions  

### Q1: What is the default layout manage for a panel in Java?  

A. None  
B. BorderLayout  
C. FlowLayout **x**  

### Q2: Which layout manager uses a compass direction or a reference to the center when adding a component or container?  

A. BorderLazut **x**  
B. MapLayout  
C. FlowLayout  

### Q3: If you want to create an installation wizard that has multiple steps, what layout manager should you use?  

A. GridLayout  
B. CardLayout **x**  
C. BorderLayout  

## Certification Practice 

```java
import java.awt.*;
import javax.swing.*;

public class ThreeButtons extends JFrame {
    public ThreeButtons() {
        super("Program");
        setSize(350, 225);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");
        JButton gamma = new JButton("Gamma");
        // answer goes here
        add(alpha);
        add(beta);
        add(gamma);
        pack();
        setVisible(true);
    }

    public static void main(String[] arguments) {
        ThreeButtons b3 = new ThreeButtons();
    }
}
```

Which statement should replace *// answer goes here* to make the frame display al three buttons side by side?  

A. content.setLayout(null);  

B. content.setLayout(new FlowLayout()); **x**  

C. content.setLayout(new GridLayout(3,1));  

D. content.setLayout(new BorderLayout());  