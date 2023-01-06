package hust.soict.dsai.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;

	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2));
		add(new Label("Le Xuan Thinh - 20176880 - Enter an Integer: "));

		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());

		add(new Label("Le Xuan Thinh - 20176880 - The Accumulated sum is : "));
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);

		setTitle("AWT Accumulator");
		setSize(600, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AWTAccumulator();
	}

	private class TFInputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}

	}
}
