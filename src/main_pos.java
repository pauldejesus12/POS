import java.awt.*;
import javax.swing.*;

public class main_pos {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Point of Sale System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel textLabel = new JLabel("I'm a label in the window", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null); 
		frame.pack();
		frame.setVisible(true);
	}
}