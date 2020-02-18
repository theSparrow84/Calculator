package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Calculator extends CalculatorGUI implements ActionListener, KeyListener {

	String stringNum1, stringOps, stringNum2;

	boolean num1Active = true;
	boolean noNumber = true;
	boolean iWantToRestart = true;

	Calculator() {
		stringNum1 = stringOps = stringNum2 = "";
		initUI();
	}

	public void actionPerformed(ActionEvent actionEvent) {
		String commandString = actionEvent.getActionCommand();
		switch (commandString) {
		// if is the point ////////////////////
		case ".":
			addPoint(commandString);
			updateScreen();
			break;
		// if is a number ////////////////////
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			// check if it have to restart or use last number
			addNum(commandString);
			updateScreen();
			break;
		// if u clear ////////////////////
		case "C":
			// clear all
			clear();
			updateScreen();
			break;
		// if is the equal ////////////////////
		case "=":
			if (!stringNum2.equals("")) {
				updateScreen(calculate());
				updateSecondaryScreen();
				stringNum1 = mainTextField.getText();
				stringNum2 = stringOps = "";
				num1Active = true;
				iWantToRestart = true;
				break;
			} else { break; }
			// if is an operand ////////////////////
		case "+":
		case "-":
			iWantToRestart = false;
			// if num1 is NOT empty
			if (!stringNum1.equals("")) {
				if (noNumber) {
					noNumber(commandString);
				} else {
					// and if num2 is NOT empty
					if (noNumber) {
						noNumber(commandString);
					} else {
						if (!stringNum2.equals("")) {
							updateScreen(calculate());
							updateSecondaryScreen();
							stringNum1 = mainTextField.getText();
							stringNum2 = "";
							stringOps = commandString;
							num1Active = false;
						}
						// and if num2 is empty
						else {
							// if an operand is present it will delete from the screen and replace
							if (!stringOps.equals("")) {
								backspace(mainTextField.getText());
								stringOps = commandString;
							}
							// if an operand is NOT present
							else {
								stringOps = commandString;
								num1Active = false;
							}
						}
					}
				}
			}
			// if num1 is empty
			else
				stringNum1 = commandString;
			// after variables are updated, updateScreen
			updateScreen();
			break;
		case "*":
		case "/":
			iWantToRestart = false;
			// if num1 is NOT empty
			if (!stringNum1.equals("")) {
				// and if num2 is NOT empty
				if (!stringNum2.equals("")) {
					updateScreen(calculate());
					updateSecondaryScreen();
					stringNum1 = mainTextField.getText();
					stringNum2 = "";
					stringOps = commandString;
				}
				// and if num2 is empty
				else {
					// and if an operand is present it will delete from the screen
					if (!stringOps.equals("")) {
						backspace(mainTextField.getText());
						stringOps = commandString;
						num1Active = false;
					} else {
						stringOps = commandString;
						num1Active = false;
					}
				}
			}
			// if num1 is empty
			else
				return;

			// after variables are updated, updateScreen
			updateScreen();
			break;

		default:
			break;

		}

	}

	// METHODS

	// check if there is NO number in the active number
	public void noNumber(String command) {

		backspace(mainTextField.getText());

		if (num1Active) {
			stringNum1 = "";
			stringNum1 = command;
		} else {
			stringNum2 = "";
			stringNum2 = command;
		}

		updateScreen();
		return;

	}

	// update screen calculator
	public void updateSecondaryScreen() {
		textFieldLastOp.setText(stringNum1 + stringOps + stringNum2 + " = " + mainTextField.getText());
	}

	// update screen calculator
	public void updateScreen() {
		mainTextField.setText(stringNum1 + stringOps + stringNum2);
	}

	// update screen calculator with a specific number
	public void updateScreen(double number) {
		mainTextField.setText(Double.toString(number));
	}

	// add a point to the active number
	public void addPoint(String command) {
		if (num1Active) {
			// check is a point is present in the first number
			if (!stringNum1.contains(".")) {
				// put a 0 if there is no number before the point
				if (stringNum1.equals("")) {
					stringNum1 = "0";
				}

				stringNum1 = stringNum1 + command;
			}
		} else {
			// check is a point is present in the second number
			if (!stringNum2.contains(".")) {
				// put a 0 if there is no number before the point
				if (stringNum2.equals("")) {
					stringNum2 = "0";
				}

				stringNum2 = stringNum2 + command;
			}
		}		
		iWantToRestart = false; // to check
	}

	// add the number, or +, or -, to the active number
	public void addNum(String command) {
		if (iWantToRestart) {
			num1Active = true;
			stringNum1 = "";
		}
		if (num1Active) {
			stringNum1 = stringNum1 + command;
		} else {
			stringNum2 = stringNum2 + command;
		}
		iWantToRestart = false;

		noNumber = false;
	}

	// Check if an operand is already present
	public boolean checkOperandPresence(String string) {
		boolean operandPresence = false;
		// if is already present an operand
		if (string.endsWith("+") || mainTextField.getText().endsWith("-") || mainTextField.getText().endsWith("/")
				|| mainTextField.getText().endsWith("*")) {
			operandPresence = true;
		}
		return operandPresence;
	}

	// Calculate
	public double calculate() {
		double result;

		if (stringOps.equals("+")) {
			result = (Double.parseDouble(stringNum1) + Double.parseDouble(stringNum2));
		} else if (stringOps.equals("-")) {
			result = (Double.parseDouble(stringNum1) - Double.parseDouble(stringNum2));
		} else if (stringOps.equals("/")) {
			result = (Double.parseDouble(stringNum1) / Double.parseDouble(stringNum2));
		} else if (stringOps.equals("*")) {
			result = (Double.parseDouble(stringNum1) * Double.parseDouble(stringNum2));
		} else {
			result = 0;
		}

		return result;
	}

	// Clear all (except lastOpsText)
	public void clear() {
		stringNum1 = stringOps = stringNum2 = "";
		num1Active = true;
	}

	// Delete last char (backspace)
	public String backspace(String string) {
		String backspacedString = null;
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.deleteCharAt(string.length() - 1);
		backspacedString = stringBuilder.toString();
		return string;
	}

	// MAIN
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Calculator calculatorClasses = new Calculator();
			JFrame frame = new JFrame("Calculator");
			// set look and feel
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setContentPane(calculatorClasses.getUI());
			frame.setMinimumSize(frame.getSize());
			frame.setLocationByPlatform(true);
			frame.pack();
			frame.setVisible(true);
		});
	}

}
