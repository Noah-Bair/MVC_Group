import java.awt.event.ActionListener;
import javax.swing.*;



public class StringView extends JFrame {
	private JTextField firstString = new JTextField(10); // Creates 10 block wide text field
	private JLabel addition = new JLabel("+");
	private JTextField secondString = new JTextField(10);
	private JButton combineButton = new JButton("Combine");
	private JTextField combinedOutputDisplay = new JTextField(10);
	
	
	StringView(){
		JPanel mainView = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		mainView.add(firstString);
		mainView.add(addition);
		mainView.add(secondString);
		mainView.add(combineButton);
		mainView.add(combinedOutputDisplay);
		
		this.add(mainView);
	}
	
	
	public String getFirstString() {
		return firstString.getText();
	}
	public String getSecondString(){
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
}
