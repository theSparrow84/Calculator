package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatorGUI implements ActionListener, KeyListener {
	public final JTextField mainTextField = new JTextField(15);
	public final JTextField textFieldLastOp = new JTextField(15);
	public final ArrayList<JButton> buttons = new ArrayList<>();
	public final JPanel panel = new JPanel(new BorderLayout(2, 2));

	public final void initUI() {

		JPanel textPanel = new JPanel(new GridLayout(0, 1, 3, 3));
		panel.setBackground(Color.BLACK);
		panel.add(textPanel, BorderLayout.PAGE_START);
		Font mainFont = mainTextField.getFont();
		mainFont = mainFont.deriveFont(mainFont.getSize() * 1.8f);
		mainTextField.setFont(mainFont);
		mainTextField.setForeground(Color.BLACK);
		mainTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		mainTextField.setFocusable(false);
		mainTextField.setText("");
		textPanel.add(mainTextField);

		Font LastOpFont = textFieldLastOp.getFont();
		LastOpFont = LastOpFont.deriveFont(LastOpFont.getSize() * 1.8f);
		textFieldLastOp.setFont(LastOpFont);
		textFieldLastOp.setForeground(Color.WHITE);
		textFieldLastOp.setBackground(Color.BLACK);
		textFieldLastOp.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldLastOp.setFocusable(false);
		textPanel.add(textFieldLastOp);

		JPanel buttons = new JPanel(new GridLayout(4, 4, 2, 2));
		panel.add(buttons, BorderLayout.CENTER);
		String[] keyValues = { 
				"7", "8", "9", "/", 
				"4", "5", "6", "*", 
				"1", "2", "3", "-", 
				"0", ".", "C", "+" };

		for (String keyValue : keyValues) {
			addButton(buttons, keyValue);
		}

		JButton button = new JButton("=");
		configureButton(button);
		panel.add(button, BorderLayout.LINE_END);

		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

	public JComponent getUI() {
		return panel;
	}

	public void addButton(Container container, String textString) {
		JButton button = new JButton(textString);
		configureButton(button);
		container.add(button);
	}

	// configure and personalize
	public void configureButton(JButton button) {
		if ((button.getText().charAt(0) >= '0' && button.getText().charAt(0) <= '9')
				|| button.getText().charAt(0) == '.') {
			Font font = button.getFont();
			button.setFont(font.deriveFont(font.getSize() * 2f));
			button.setPreferredSize(new Dimension(64, 64));
			button.setBackground(Color.WHITE);
			button.setForeground(Color.BLACK);
			button.addActionListener(this);
			button.addKeyListener(this);
			buttons.add(button);
		} else if (button.getText() == "=") {
			Font font = button.getFont();
			button.setFont(font.deriveFont(font.getSize() * 2f));
			button.setBackground(Color.RED);
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Arial", Font.BOLD, 33));
			button.addActionListener(this);
			button.addKeyListener(this);
			buttons.add(button);
		} else if (button.getText() == "C") {
			Font font = button.getFont();
			button.setFont(font.deriveFont(font.getSize() * 2f));
			button.setBackground(Color.YELLOW);
			button.setForeground(Color.BLACK);
			button.setFont(new Font("Arial", Font.BOLD, 33));
			button.addActionListener(this);
			button.addKeyListener(this);
			buttons.add(button);
		} else if (button.getText() != "=") {
			Font font = button.getFont();
			button.setFont(font.deriveFont(font.getSize() * 2f));
			button.setPreferredSize(new Dimension(64, 64));
			button.setBackground(Color.BLACK);
			button.setForeground(Color.WHITE);
			button.addActionListener(this);
			button.addKeyListener(this);
			buttons.add(button);
		} else
			return;
	}

	private JButton getButton(String text) {
		for (JButton button : buttons) {
			String string = button.getText();
			if (text.endsWith(string) || (string.equals("=") && (text.equals("Equals") || text.equals("Enter")))) {
				return button;
			}
		}
		return null;
	}

	public void keyPressed(KeyEvent keyEvent) {}

	public void keyReleased(KeyEvent keyEvent) {
		String string = KeyEvent.getKeyText(keyEvent.getKeyCode());
		JButton button = getButton(string);
		if (button != null) {
			button.requestFocusInWindow();
			button.doClick();
		}
	}

	public void keyTyped(KeyEvent keyEvent) {}

	public JTextField getMainTextField() { return mainTextField; }

	public JTextField getTextFieldLastOp() { return textFieldLastOp; }

	public ArrayList<JButton> getButtons() { return buttons; }

	@Override
	public void actionPerformed(ActionEvent arg0) {}

}
