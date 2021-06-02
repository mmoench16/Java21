# Quiz  

## Questions  

### Q1: Which of the following user interface components is not a container?  

A. JScrollPane  
B. JTextArea **x**  
C. JPanel  

### Q2: Which component can be placed into a Scroll pane?  

A. JTextArea  
B. JTextField  
C. Any component **x**  

### Q3: If you *setSize()* on an application's main frame, where will it appear on your desktop?  

A. In the center of the desktop  
B. In the same spot where the last application appeared  
C. In the upper-left corner of the desktop **x**  

## Certification Practice  

```java
import javax.swing.*;

public class Display extends JFrame {
    public Display() {
        super("Display");
        // answer goes here
        JLabel hello = new JLabel("Hello");
        JPanel pane = new JPanel();
        add(hello);
        pack();
        setVisible(true);
    }

    public static void main(String[] arguments) {
        Display ds = new Display();
    }
}
```

What statement needs to replace *// answer goes here* to make the application function properly?  

A. setSize(300, 200);  
B. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); **x**  
C. Display ds = new Display();
D. No statement is needed  
