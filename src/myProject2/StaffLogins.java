package myProject2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StaffLogins extends JFrame {

	private JFrame frameLogin;
	private JPanel windowContentPane;
	private JTextField textFieldUsername;
	private JPasswordField textFieldPas;
	private ImageIcon icon;
	private JButton buttonBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					StaffLogins frame = new StaffLogins();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public StaffLogins() {
		setTitle("staff Login Page");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		windowContentPane = new JPanel();
		windowContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(windowContentPane);
		windowContentPane.setLayout(null);
		
		 icon = new ImageIcon("image/4.png");
			setIconImage(icon.getImage());
		
		JLabel labelLogin = new JLabel("Login Form");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelLogin.setBounds(176, 40, 115, 29);
		windowContentPane.add(labelLogin);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(107, 108, 70, 14);
		windowContentPane.add(labelUsername);
		
		JLabel labelPass = new JLabel("Password");
		labelPass.setBounds(107, 148, 70, 14);
		windowContentPane.add(labelPass);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(212, 105, 138, 20);
		windowContentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				textFieldPas.setText("");
			}
		});
		buttonReset.setBounds(209, 191, 89, 23);
		windowContentPane.add(buttonReset);
		
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(windowContentPane,
						"Do you  want to exit the system", "Staff Page",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				
			}}
		});
		buttonExit.setBounds(88, 191, 89, 23);
		windowContentPane.add(buttonExit);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("staff.txt");
				try {
						boolean found = false;
						Scanner inputStream = new Scanner(file);
						while(inputStream.hasNext())
						{
							String data = inputStream.next();
							
							String [] values = data.split(",");
							
							
							if(values[0].equals(textFieldUsername.getText()) && values[1].equals(textFieldPas.getText()))
							{
								StaffPage s = new StaffPage();
								s.setVisible(true);
								dispose();
								found = true;
								break;
							}
																						
						}
									
						inputStream.close();
						if(found==false)
						JOptionPane.showMessageDialog(null,"Invalid Login Details");
				} catch (FileNotFoundException $e) {
					System.out.println("File not Found.");
				}
						

			}

			
		});
		buttonLogin.setBounds(314, 191, 89, 23);
		windowContentPane.add(buttonLogin);
		
		textFieldPas = new JPasswordField();
		textFieldPas.setBounds(212, 145, 138, 20);
		windowContentPane.add(textFieldPas);
		
		buttonBack = new JButton("Back");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home fifth = new Home();
				fifth.setVisible(true);
				
			}
		});
		buttonBack.setBounds(101, 311, 89, 23);
		windowContentPane.add(buttonBack);
		
	}
}
