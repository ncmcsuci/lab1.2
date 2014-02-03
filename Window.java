// Nicholas Messing
// Lab 1.2
// Comp 350
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class Window extends JFrame
{
  public static final int WIDTH = 400;
  public static final int HEIGHT = 250;
  
  public Window(Color color)
  {
    // set up window properties
    super("Nicholas Messing");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // set window color
    getContentPane().setBackground(color);
    
    // add text to window
    JLabel aLabel = new JLabel("Please close the window... it's cold!", JLabel.CENTER);
    add(aLabel);
    
    // add button in the bottom center
    JButton endButton = new JButton("Close window");
    endButton.addActionListener(new EndingListener());
    JPanel buttonCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonCenter.add(endButton);
    add(buttonCenter, BorderLayout.SOUTH);
  }
  
  public Window()
  {
    // default color
    this(Color.WHITE);
  }
}