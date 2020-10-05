import java.awt.event.ActionListener;
import javax.swing.*;

public class StringView extends JFrame {

	private JTextField firstString = new JTextField(10);
	private JLabel addition = new JLabel("+");
	private JTextField secondString = new JTextField(10);
	public static JButton combineButton = new JButton("Combine");
	private JTextField combinedOutputDisplay = new JTextField(10);

	private JTextField rString = new JTextField(10);
	public static JButton reverseButton = new JButton("Reverse");
	private JTextField reverseDisplay = new JTextField(10);

	StringView() {
		JPanel mainView = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);

		mainView.add(firstString);
		mainView.add(addition);
		mainView.add(secondString);
		mainView.add(combineButton);
		mainView.add(combinedOutputDisplay);

		mainView.add(rString);
		mainView.add(reverseButton);
		mainView.add(reverseDisplay);

		this.add(mainView);
	}

	public String getFirstString() {
		return firstString.getText();
	}

	public String getSecondString() {
		return secondString.getText();
	}

	public String getCombination() {
		return combinedOutputDisplay.getText();
	}

	public void combine(String combinedOutput) {
		combinedOutputDisplay.setText(combinedOutput);
	}

	void combineListening(ActionListener listenForCombine) {
		combineButton.addActionListener(listenForCombine);
	}

	public String getrString() {
		return rString.getText();
	}

	public void reverse(String reverseOutput) {
		reverseDisplay.setText(reverseOutput);
	}

	void reverseListening(ActionListener listenForReverse) {
		reverseButton.addActionListener(listenForReverse);
	}
}