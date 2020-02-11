import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class TicTacToeGUI {
	
	private boolean player1Turn = true;
	private boolean winner = false;
	
	int player1Count = 0;
	int player2Count = 0;
	private String count;
	
	JFrame frmTictactoe;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JLabel lblWinner;
	JTextField txtPlayer1Count;
	JTextField txtPlayer2Count;
	private JPanel panelStatus;
	private JLabel lblStatus;
	private JLabel label;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu menu;
	private JMenuItem mntmNew;
	private JSeparator separator;
	private JMenuItem mntmExit;
	
	

	
	// StatusBarUpdate
	private void statusBar() {
	if (player1Turn == true) {
		lblStatus.setText("It's Player 1 turn...");
	} else {
		lblStatus.setText("It's Player 2 turn...");
	}
	}
	
	// checkWinner
		private void checkWinner() {
			//X check
			if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			
			
			if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			
			
			if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
				lblWinner.setText("PLAYER1 WON!");
				player1Count++;
				count = Integer.toString(player1Count);
				txtPlayer1Count.setText(count);
				winner = true;
			}
			
			// O check
			if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			
			
			if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			
			
			if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
				lblWinner.setText("PLAYER2 WON!");
				player2Count++;
				count = Integer.toString(player2Count);
				txtPlayer2Count.setText(count);
				winner = true;
			}
			
			
		}
	
	
	/**
	 * Create the application.
	 */
	public TicTacToeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTictactoe = new JFrame();
		frmTictactoe.setResizable(false);
		frmTictactoe.setTitle("TicTacToe");
		frmTictactoe.setBounds(100, 100, 450, 300);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setPreferredSize(new Dimension(450,450));
		panelButtons.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmTictactoe.getContentPane().add(panelButtons, BorderLayout.CENTER);
		
		panelButtons.setLayout(new GridLayout(3, 3, 0, 0));
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn1.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn1.setText("X");
						btn1.setForeground(Color.WHITE);
						btn1.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn1.setText("O");
						btn1.setForeground(Color.BLACK);
						btn1.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn2.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn2.setText("X");
						btn2.setForeground(Color.WHITE);
						btn2.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn2.setText("O");
						btn2.setForeground(Color.BLACK);
						btn2.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn3.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn3.setText("X");
						btn3.setForeground(Color.WHITE);
						btn3.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn3.setText("O");
						btn3.setForeground(Color.BLACK);
						btn3.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn4.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn4.setText("X");
						btn4.setForeground(Color.WHITE);
						btn4.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn4.setText("O");
						btn4.setForeground(Color.BLACK);
						btn4.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn5.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn5.setText("X");
						btn5.setForeground(Color.WHITE);
						btn5.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn5.setText("O");
						btn5.setForeground(Color.BLACK);
						btn5.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn6.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn6.setText("X");
						btn6.setForeground(Color.WHITE);
						btn6.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn6.setText("O");
						btn6.setForeground(Color.BLACK);
						btn6.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn7.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn7.setText("X");
						btn7.setForeground(Color.WHITE);
						btn7.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn7.setText("O");
						btn7.setForeground(Color.BLACK);
						btn7.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn8.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn8.setText("X");
						btn8.setForeground(Color.WHITE);
						btn8.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn8.setText("O");
						btn8.setForeground(Color.BLACK);
						btn8.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn9.getText().toString().equals("") && winner == false) {
					if (player1Turn == true) {
						btn9.setText("X");
						btn9.setForeground(Color.WHITE);
						btn9.setBackground(Color.BLACK);
						checkWinner();
						statusBar();
						player1Turn = false;
					} else {
						btn9.setText("O");
						btn9.setForeground(Color.BLACK);
						btn9.setBackground(Color.WHITE);
						checkWinner();
						statusBar();
						player1Turn = true;
					}
				}
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Dialog", Font.BOLD, 72));
		panelButtons.add(btn9);
		
		JPanel panelPW = new JPanel();
		frmTictactoe.getContentPane().add(panelPW, BorderLayout.SOUTH);
		panelPW.setLayout(new GridLayout(1, 2, 0, 0));
		panelPW.setPreferredSize(new Dimension(450,100));
		
		JPanel panelPlayers = new JPanel();
		panelPW.add(panelPlayers);
		panelPlayers.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblPlayer1 = new JLabel("Player1");
		lblPlayer1.setForeground(Color.BLUE);
		lblPlayer1.setPreferredSize(new Dimension(125,50));
		lblPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1.setFont(new Font("Dialog", Font.BOLD, 24));
		panelPlayers.add(lblPlayer1);
		
		txtPlayer1Count = new JTextField();
		txtPlayer1Count.setEditable(false);
		txtPlayer1Count.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayer1Count.setText("0");
		txtPlayer1Count.setFont(new Font("Dialog", Font.BOLD, 36));
		txtPlayer1Count.setPreferredSize(new Dimension(25,50));
		panelPlayers.add(txtPlayer1Count);
		txtPlayer1Count.setColumns(10);
		
		JLabel lblPlayer2 = new JLabel("Player2");
		lblPlayer2.setForeground(Color.RED);
		lblPlayer2.setPreferredSize(new Dimension(125,50));
		lblPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer2.setFont(new Font("Dialog", Font.BOLD, 24));
		panelPlayers.add(lblPlayer2);
		
		txtPlayer2Count = new JTextField();
		txtPlayer2Count.setEditable(false);
		txtPlayer2Count.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayer2Count.setText("0");
		txtPlayer2Count.setFont(new Font("Dialog", Font.BOLD, 36));
		txtPlayer2Count.setPreferredSize(new Dimension(25,50));
		panelPlayers.add(txtPlayer2Count);
		txtPlayer2Count.setColumns(10);
		
		
		JPanel panelWinBut = new JPanel();
		panelPW.add(panelWinBut);
		panelWinBut.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblWinner = new JLabel("Who's winning?");
		panelWinBut.add(lblWinner);
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setForeground(new Color(51, 51, 51));
		lblWinner.setFont(new Font("Dialog", Font.BOLD, 22));
		
		JPanel panelButNewQuit = new JPanel();
		panelWinBut.add(panelButNewQuit);
		panelButNewQuit.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText("");
				btn1.setBackground(Color.LIGHT_GRAY);
				
				btn2.setText("");
				btn2.setBackground(Color.LIGHT_GRAY);
				
				btn3.setText("");
				btn3.setBackground(Color.LIGHT_GRAY);
				
				btn4.setText("");
				btn4.setBackground(Color.LIGHT_GRAY);
				
				btn5.setText("");
				btn5.setBackground(Color.LIGHT_GRAY);
				
				btn6.setText("");
				btn6.setBackground(Color.LIGHT_GRAY);
				
				btn7.setText("");
				btn7.setBackground(Color.LIGHT_GRAY);
				
				btn8.setText("");
				btn8.setBackground(Color.LIGHT_GRAY);
				
				btn9.setText("");
				btn9.setBackground(Color.LIGHT_GRAY);
				
				player1Turn = true;
				winner = false;
				lblWinner.setText("Who's winning?");
			}
		});
		btnNew.setFont(new Font("Dialog", Font.BOLD, 26));
		panelButNewQuit.add(btnNew);
		
		JButton btnQuit = new JButton("QUIT");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog( null,"Are you really want to Exit?","TicTacToe",
			            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			            System.exit(0);
			}
		});
		btnQuit.setFont(new Font("Dialog", Font.BOLD, 26));
		panelButNewQuit.add(btnQuit);
		
		panelStatus = new JPanel();
		frmTictactoe.getContentPane().add(panelStatus, BorderLayout.NORTH);
		
		label = new JLabel("");
		panelStatus.add(label);
		
		lblStatus = new JLabel("It's Player 1 turn...");
		lblStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStatus.setLabelFor(panelStatus);
		lblStatus.setPreferredSize(new Dimension(200, 25));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		panelStatus.add(lblStatus);
		
		frmTictactoe.pack();
		frmTictactoe.setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		frmTictactoe.setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText("");
				btn1.setBackground(Color.LIGHT_GRAY);
				
				btn2.setText("");
				btn2.setBackground(Color.LIGHT_GRAY);
				
				btn3.setText("");
				btn3.setBackground(Color.LIGHT_GRAY);
				
				btn4.setText("");
				btn4.setBackground(Color.LIGHT_GRAY);
				
				btn5.setText("");
				btn5.setBackground(Color.LIGHT_GRAY);
				
				btn6.setText("");
				btn6.setBackground(Color.LIGHT_GRAY);
				
				btn7.setText("");
				btn7.setBackground(Color.LIGHT_GRAY);
				
				btn8.setText("");
				btn8.setBackground(Color.LIGHT_GRAY);
				
				btn9.setText("");
				btn9.setBackground(Color.LIGHT_GRAY);
				
				player1Turn = true;
				winner = false;
				lblWinner.setText("Who's winning?");
			}
		});
		mnFile.add(mntmNew);
		
		separator = new JSeparator();
		mnFile.add(separator);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog( null,"Are you really want to Exit?","TicTacToe",
			            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			            System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		menu = new JMenu("?");
		menuBar.add(menu);
	}
	
	public static void main(String[] args) {
		/**
		 * Launch the application.
		 */
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TicTacToeGUI window = new TicTacToeGUI();
						window.frmTictactoe.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
}
