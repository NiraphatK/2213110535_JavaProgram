import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;

	public TestGUI(){
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		
		lblLength = new JLabel("Enter the length:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);
		
		//txtLength = new JTextField(10);		
		
		add(lblLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
		
	}
	
	
	public static void main(String[] args) {
		TestGUI prog = new TestGUI();

	}

}
