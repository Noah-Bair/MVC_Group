import java.awt.BorderLayout;
import java.awt.GridLayout;
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
	
	private JTextField pString = new JTextField(10);
	public static JButton pButton = new JButton("Palindrome?");
	private JTextField pOut = new JTextField(10);

	StringView() {
		JTabbedPane TabbedPane = new JTabbedPane();
	    JPanel PanelFirst = new JPanel();
	    JPanel PanelSecond = new JPanel();
	    JPanel PanelThird = new JPanel();
	    
	    //////////////
	    //FIRST TAB//
	    //////////////
	    PanelFirst.setLayout(null);
	    TabbedPane.addTab("Combine", PanelFirst);
	    firstString.setBounds(20,20,150,23);
	    addition.setBounds(200,20,60,23);
	    secondString.setBounds(250,20,150,23);
	    combineButton.setBounds(20,50,150,23);
	    combinedOutputDisplay.setBounds(20,80,150,23);
		PanelFirst.add(firstString);
		PanelFirst.add(addition);
	    PanelFirst.add(secondString);
	    PanelFirst.add(combineButton);
	    PanelFirst.add(combinedOutputDisplay);
	    //////////////
	    //SECOND TAB//
	    //////////////
	    PanelSecond.setLayout(null);
	    TabbedPane.addTab("Reverse", PanelSecond);
	    rString.setBounds(20,20,150,23);
	    reverseButton.setBounds(200,20,150,23);
	    reverseDisplay.setBounds(20,50,150,23);
	    PanelSecond.add(rString);
	    PanelSecond.add(reverseButton);
	    PanelSecond.add(reverseDisplay);
	    //////////////
	    //THIRD TAB///
	    //////////////
	    PanelThird.setLayout(null);
	    pString.setBounds(20,20,150,23);
	    pButton.setBounds(200,20,150,23);
	    pOut.setBounds(20,50,150,23);
	    PanelThird.add(pString);
	    PanelThird.add(pButton);
	    PanelThird.add(pOut);
	    TabbedPane.addTab("Palindrome", PanelThird);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);
		
		this.add(TabbedPane);
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
	
	public String getPString() {
		return pString.getText();
	}
	
	public void palindrome(String pStr) {
		pOut.setText(pStr);
	}
	
	void palindromeListening(ActionListener listenForPal) {
		pButton.addActionListener(listenForPal);
	}
}