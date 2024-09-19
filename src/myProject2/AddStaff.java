/*
  prakash Adhikari
 UN ID: 17421483
 Resit of SDD
 
 */
package myProject2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class AddStaff extends JFrame {

	private JPanel winContentPane;
	private JTextField textFieldUser, textFieldPas, textFieldStaff, textFieldName, textFieldGender, textFieldReg, textFieldRegDate, textFieldPres, textFieldQuali;
	private ImageIcon icon;
	private JLabel labelUser, labelPas, labelStaff, labelName, labelGender, labelReg, labelRegDate,labelPres, labelAdd, labelQuali;
	private JButton buttonBack, buttonReset, buttonExit, buttonSubmit;
	
	//main method.
	public static void main(String[] args) {
		
					AddStaff frame = new AddStaff();
					frame.setVisible(true);
				
	}

	//creating the gui inside constructor.
	public AddStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //adding default buttons on frame.
		setBounds(100, 100, 560, 410);					//giving the Dimension of frame.
		setTitle("Adding staff Page");
		winContentPane = new JPanel();                  //creating the panel.
		winContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//boarder to the panel.
		setContentPane(winContentPane);						
		winContentPane.setLayout(null);
		
		//giving the icon to the jframe.
		icon = new ImageIcon("image/4.png");
		setIconImage(icon.getImage());
		 
		// creating label for title
		labelAdd = new JLabel("Add Staff");					//creating New Label.
		labelAdd.setFont(new Font("Tahoma", Font.BOLD, 16)); //adding font style.
		labelAdd.setBounds(191, 11, 99, 28);                 //dimension of the label.
		winContentPane.add(labelAdd);						//adding the label to the frame.
		
		// creating label for username
		 labelUser = new JLabel("username");
		 labelUser.setBounds(121, 40, 60, 14);
		 winContentPane.add(labelUser);
			
		 // creating textField for username.
		 textFieldUser = new JTextField();
		 textFieldUser.setBounds(211, 40, 139, 20);
		 winContentPane.add(textFieldUser);
		 textFieldUser.setColumns(20);
			
		 // creating label for password.
		labelPas = new JLabel("Password");
		labelPas.setBounds(121, 70, 60, 14);
		winContentPane.add(labelPas);
		
		// creating textField for password.
		textFieldPas = new JTextField();
		textFieldPas.setBounds(211, 67, 139, 20);
		winContentPane.add(textFieldPas);
		textFieldPas.setColumns(20);
		
		// creating label for medical staff.
		labelStaff = new JLabel("Medical Staff");
		labelStaff.setBounds(121, 105, 75, 14);
		winContentPane.add(labelStaff);
		
		// creating combobox to choose the medical staff ie. doctor or nurse.
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(211, 102, 139, 20);
		//items of the comboBox.
		comboBox1.addItem("Doctor");
		comboBox1.addItem("Nurse");
		winContentPane.add(comboBox1);//adding comboBox to frame.
		
		//label for name.
		labelName = new JLabel("Name");
		labelName.setBounds(121, 138, 69, 14);
		winContentPane.add(labelName);
		
		//textfield for name.
		textFieldName = new JTextField();
		textFieldName.setBounds(211, 135, 139, 20);
		winContentPane.add(textFieldName);
		textFieldName.setColumns(20);
		
		//label for gender.
		labelGender = new JLabel("gender");
		labelGender.setBounds(121, 175, 80, 14);
		winContentPane.add(labelGender);
		
		//combobox to select the gender.
		JComboBox genderComboBox1 = new JComboBox();
		genderComboBox1.setBounds(211, 172, 139, 20);
		//items of the comboBox.
		genderComboBox1.addItem("Male");
		genderComboBox1.addItem("Female");
		genderComboBox1.addItem("others");
		winContentPane.add(genderComboBox1);
		
		//creating label for reg-no. 
		labelReg = new JLabel("Reg-no");
		labelReg.setBounds(121, 209, 69, 14);
		winContentPane.add(labelReg);
		
		//creating  textfield for registratio no.
		textFieldReg = new JTextField();
		textFieldReg.setBounds(211, 206, 139, 20);
		winContentPane.add(textFieldReg);
		textFieldReg.setColumns(20);
		
		//creating label for Reg-date.
		labelRegDate = new JLabel("Reg_date");
		labelRegDate.setBounds(121, 244, 60, 14);
		winContentPane.add(labelRegDate);
		
		//creating txtfield for reg date.
		textFieldRegDate = new JTextField();
		textFieldRegDate.setBounds(211, 241, 139, 20);
		winContentPane.add(textFieldRegDate);
		textFieldRegDate.setColumns(20);
		
		//creating label for prescribed.
		labelPres = new JLabel("prescribed");
		labelPres.setBounds(121, 281, 69, 14);
		winContentPane.add(labelPres);
		
		//creating txtfield for prescribed.
		textFieldPres = new JTextField();
		textFieldPres.setBounds(211, 278, 139, 20);
		winContentPane.add(textFieldPres);
		textFieldPres.setColumns(20);
		
		//creating label for quali-date.
		labelQuali = new JLabel("Quali_date");
		labelQuali.setBounds(121, 310, 69, 14);
		winContentPane.add(labelQuali);
		
		//creating txtfield for quali-ddate.
		textFieldQuali = new JTextField();
		textFieldQuali.setBounds(211, 310, 139, 20);
		winContentPane.add(textFieldQuali);
		textFieldQuali.setColumns(20);
		
		//creating the back button.
		buttonBack = new JButton("Back");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pressing the back button leads to previous page.
				ReceptionPage third = new ReceptionPage();
				third.setVisible(true);
				
			}
		});
		buttonBack.setBounds(101, 340, 89, 23);
		winContentPane.add(buttonBack);
		
		//creating the new button to reset.
		buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//after pressing the reset the field is set to null.
				textFieldUser.setText("");
				textFieldPas.setText("");
				comboBox1.setSelectedItem("");
				textFieldName.setText("");
				genderComboBox1.setSelectedItem("");
				textFieldReg.setText("");
				textFieldRegDate.setText("");
				textFieldPres.setText("");
				textFieldQuali.setText("");
			}
		});
		buttonReset.setBounds(221, 340, 89, 23);
		winContentPane.add(buttonReset);
		
		//add button to add the staff.
	    buttonSubmit = new JButton("Add");
		buttonSubmit.addActionListener(new ActionListener() {//actionlistener to the button.
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("staff.txt",true);//creating the new file to write on it.
					PrintWriter outputFile= new PrintWriter(fw);
					outputFile.println(textFieldUser.getText()+","+textFieldPas.getText()+","+comboBox1.getSelectedItem()+","+textFieldName.getText()+","+genderComboBox1.getSelectedItem()+","+textFieldReg.getText()+","+textFieldRegDate.getText()+","+textFieldPres.getText()+","+textFieldQuali.getText());
					//show the message that staff is added.
					JOptionPane.showMessageDialog(null, "Staff Added");
					//after adding all the fields is set null.
					textFieldUser.setText("");
					textFieldPas.setText("");
					comboBox1.setSelectedItem("");
					textFieldName.setText("");
					genderComboBox1.setSelectedItem("");
					textFieldReg.setText("");
					textFieldRegDate.setText("");
					textFieldPres.setText("");
					textFieldQuali.setText("");
					
					outputFile.close();
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
			
			}
		});
		buttonSubmit.setBounds(339, 340, 89, 23);
		winContentPane.add(buttonSubmit);
		
		

			
	}

}

