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
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class AddPatient extends JFrame {

	private JPanel winContentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldBirth;
	private JTextField textFieldAddress;
	private JTextField textFieldEmail;
	private JTextField textFieldPh;
	private JTextField textFieldMedical;
	private JTextField textFieldAppoint;
	private JTextField textFieldTreat;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatient frame = new AddPatient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Adding patient Page");
		setBounds(100, 100, 515, 420);
		winContentPane = new JPanel();
		winContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(winContentPane);
		winContentPane.setLayout(null);
		

		//giving the icon to the jframe.
		icon = new ImageIcon("image/4.png");
		setIconImage(icon.getImage());
		 
		
		JLabel lblPatient = new JLabel("Add Patient");
		lblPatient.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPatient.setBounds(21, 11, 147, 22);
		winContentPane.add(lblPatient);
		
		JLabel lblId = new JLabel("Identification No.:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(43, 44, 111, 14);
		winContentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblName.setBounds(43, 69, 94, 14);
		winContentPane.add(lblName);
		
		JLabel lblBirth = new JLabel("Date of Birth:");
		lblBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirth.setBounds(43, 93, 102, 14);
		winContentPane.add(lblBirth);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(43, 118, 111, 14);
		winContentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(43, 143, 102, 14);
		winContentPane.add(lblEmail);
		
		JLabel lblPh = new JLabel("Phone Number:");
		lblPh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPh.setBounds(43, 168, 111, 14);
		winContentPane.add(lblPh);
		
		JLabel lblMedical = new JLabel("Medical Staff:");
		lblMedical.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMedical.setBounds(43, 193, 94, 14);
		winContentPane.add(lblMedical);
		
		JLabel lblAppoint = new JLabel("Appoint_date:");
		lblAppoint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAppoint.setBounds(43, 218, 94, 22);
		winContentPane.add(lblAppoint);
		
		JLabel lblTreat = new JLabel("Treatments:");
		lblTreat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTreat.setBounds(43, 247, 102, 14);
		winContentPane.add(lblTreat);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(164, 43, 163, 20);
		winContentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(164, 68, 163, 20);
		winContentPane.add(textFieldName);
		
		textFieldBirth = new JTextField();
		textFieldBirth.setColumns(10);
		textFieldBirth.setBounds(164, 92, 163, 20);
		winContentPane.add(textFieldBirth);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(164, 117, 163, 20);
		winContentPane.add(textFieldAddress);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(164, 142, 163, 20);
		winContentPane.add(textFieldEmail);
		
		textFieldPh = new JTextField();
		textFieldPh.setColumns(10);
		textFieldPh.setBounds(164, 167, 163, 20);
		winContentPane.add(textFieldPh);
		
		textFieldMedical = new JTextField();
		textFieldMedical.setColumns(10);
		textFieldMedical.setBounds(164, 192, 163, 20);
		winContentPane.add(textFieldMedical);
		
		textFieldAppoint = new JTextField();
		textFieldAppoint.setColumns(10);
		textFieldAppoint.setBounds(164, 221, 163, 20);
		winContentPane.add(textFieldAppoint);
		
		textFieldTreat = new JTextField();
		textFieldTreat.setColumns(10);
		textFieldTreat.setBounds(164, 246, 163, 20);
		winContentPane.add(textFieldTreat);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pressing the back button leads to previous page.
				dispose();//disposing previous page
				ReceptionPage third = new ReceptionPage();
				third.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(48, 298, 89, 23);
		winContentPane.add(btnBack);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//after pressing the reset the field is set to null.
				textFieldId.setText("");
				textFieldName.setText("");
				textFieldBirth.setText("");
				textFieldAddress.setText("");
				textFieldEmail.setText("");
				textFieldPh.setText("");
				textFieldMedical.setText("");
				textFieldAppoint.setText("");
				textFieldTreat.setText("");
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(175, 298, 89, 23);
		winContentPane.add(btnReset);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("Patient.txt",true);//creating the new file to write on it.
					PrintWriter outputFile= new PrintWriter(fw);
					outputFile.println(textFieldId.getText()+","+textFieldName.getText()+","+textFieldBirth.getText()+","+textFieldAddress.getText()+","+textFieldEmail.getText()+","+textFieldPh.getText()+","+textFieldMedical.getText()+","+textFieldAppoint.getText()+","+textFieldTreat.getText());
					//show the message that staff is added.
					JOptionPane.showMessageDialog(null, "Patient Added");
					//after adding all the fields is set null.
					textFieldId.setText("");
					textFieldName.setText("");
					textFieldBirth.setText("");
					textFieldAddress.setText("");
					textFieldEmail.setText("");
					textFieldPh.setText("");
					textFieldMedical.setText("");
					textFieldAppoint.setText("");
					textFieldTreat.setText("");
					
					outputFile.close();
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
			
			}
			
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(296, 298, 89, 23);
		winContentPane.add(btnAdd);
	}
}
