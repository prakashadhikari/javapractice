/*
  prakash Adhikari
 UN ID: 17421483
 Resit of SDD
 
 */
package myProject2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import myProject2.RecLogin;

import javax.swing.JToolBar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

public class Home extends JFrame {
	
	private ImageIcon icon;
	private ImageIcon icon2;
	private JPanel javaContentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Home frame = new Home();
					frame.setVisible(true);
			
	}
	/**
	 * Create the frame.
	 */
	public Home() {
		
		setTitle("Northampton Medical Clinic");
		setResizable(false);
		setBounds(100, 100, 550, 400);
		javaContentPane = new JPanel();
		javaContentPane.setBorder(new EmptyBorder(4, 4, 4, 4));
		setContentPane(javaContentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Icon imgIcon = new ImageIcon("image/2.jpg");
	   

		
	    icon = new ImageIcon("image/4.png");
		setIconImage(icon.getImage());
		
		
		JButton recpLoginButton = new JButton("Reception Login");
		recpLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RecLogin window = new RecLogin();
				window.setVisible(true);
		
				
				
			}
		});
		recpLoginButton.setBounds(400, 100, 130, 37);
		javaContentPane.add(recpLoginButton);
		
		JButton staffLoginButton = new JButton("Staff Login");
		staffLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				StaffLogins window = new StaffLogins();
				window.setVisible(true);
		
			}
		});
		staffLoginButton.setBounds(400, 150, 130, 37);
		javaContentPane.add(staffLoginButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

						
					
					if (JOptionPane.showConfirmDialog(javaContentPane,
							"Do you  want to exit the system", "Home Page",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						 	System.exit(0);
						
					}
	
				}});
			
	
		exitButton.setBounds(420, 200, 89, 37);
		javaContentPane.add(exitButton);
		
		JPanel panelImg = new JPanel();
		panelImg.setBounds(22, 40, 350, 330);
		javaContentPane.add(panelImg);
		panelImg.setLayout(null);
		
		JLabel imglvl = new JLabel(imgIcon);
		imglvl.setBounds(10, 11, 450, 300);
		panelImg.add(imglvl);
		
		
		JLabel lvlTitle = new JLabel("Northampton Medical Clinic");
		lvlTitle.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lvlTitle.setBounds(35, 11, 237, 33);
		javaContentPane.add(lvlTitle);
	}
}
