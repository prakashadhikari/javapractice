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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReceptionPage extends JFrame {

	private JPanel windContentPane;
	private JButton buttonLogout;
	private ImageIcon icon;
	private JLabel labelAdmin;
	private JButton buttonPatient,buttonStaffData,buttonPatientData, buttonStaff, buttonLogin, buttonExit, buttonBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			ReceptionPage Jframe = new ReceptionPage();
			Jframe.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public ReceptionPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Reception Page");
		setBounds(100, 100, 550, 400);
		windContentPane = new JPanel();
		windContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(windContentPane);
		windContentPane.setLayout(null);
		
		Icon imgIcon = new ImageIcon("image/rec.jpg");
		
		icon = new ImageIcon("image/4.png");
		setIconImage(icon.getImage());
		
		labelAdmin = new JLabel("Reception Area");
		labelAdmin.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		labelAdmin.setBounds(10, 11, 150, 31);
		windContentPane.add(labelAdmin);
		
		labelAdmin = new JLabel(imgIcon);
		labelAdmin.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		labelAdmin.setBounds(250, 10, 250, 280);
		windContentPane.add(labelAdmin);
		
		buttonStaff = new JButton("Add Doctor/nurse");
		buttonStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddStaff second = new AddStaff();
				second.setVisible(true);
			}
		});
		buttonStaff.setBounds(50, 70, 150, 23);
		windContentPane.add(buttonStaff);
		
		buttonStaffData = new JButton("view Doctor/nurses");
		buttonStaffData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewStaffData table = new ViewStaffData();
				table.frameData.setVisible(true);
			}
		});
		buttonStaffData.setBounds(50, 100, 150, 23);
		windContentPane.add(buttonStaffData);
		
		buttonPatient = new JButton("Add patients");
		buttonPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddPatient second = new AddPatient();
				second.setVisible(true);
			}
		});
		buttonPatient.setBounds(50, 163, 150, 23);
		windContentPane.add(buttonPatient);
		
		buttonPatientData = new JButton("view Patients");
		buttonPatientData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewPatientData table = new ViewPatientData();
				table.frameData.setVisible(true);
			}
		});
		buttonPatientData.setBounds(50, 200, 150, 23);
		windContentPane.add(buttonPatientData);
		
		
		buttonLogout = new JButton("Logout");
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(windContentPane,
						"Do you  want to Logout the system", "Rec Page",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				dispose();
				RecLogin test = new RecLogin();
				test.setVisible(true);
				}
			}
		});
		buttonLogout.setBounds(400, 300, 89, 23);
		windContentPane.add(buttonLogout);
		
		buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttonExit.setBounds(30, 300, 89, 23);
		windContentPane.add(buttonExit);
		
		
	}
	
}
