/*
  prakash Adhikari
 UN ID: 17421483
 Resit of SDD
 
 */
package myProject2;
import java.awt.Container;
import java.awt.EventQueue;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StaffDataInStaff	 {

	
		boolean login = true;
		private JButton buttonBack;
		public JFrame frameData = new JFrame("REception Panel");
		private ImageIcon icon;
		
		public static void main(String[] args) throws IOException {
			 ViewStaffData data= new  ViewStaffData();
			data.frameData.setVisible(true);
			
		}

		
		public StaffDataInStaff () {
			guiModel();
		}

		private void guiModel() {
			frameData = new JFrame();
			frameData.setBounds(0, 10, 1050, 500);
			frameData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameData.getContentPane().setLayout(null);
			frameData.setTitle("staff Table");

			icon = new ImageIcon("image/4.png");
			frameData.setIconImage(icon.getImage());
			
			JTable table = new JTable();
			JScrollPane pane = new JScrollPane(table);
			pane.setBounds(3,10,1000,300);
			frameData.add(pane);
			
			Object[]columns = {"username","password","medical staff","name","gender","Reg number","reg-date","prescribed","Quali-date"};
			DefaultTableModel tableModel = new DefaultTableModel();
			tableModel.setColumnIdentifiers(columns);
			table.setModel(tableModel);
			ArrayList dataDisplay = new ArrayList();
			 
			try{
				File file = new File("staff.txt");
				Scanner input = new Scanner(file); 
				
				while(input.hasNextLine()){
					dataDisplay.add(input.nextLine());
				}
				for(int i=0;i<dataDisplay.size();i++){
					
					String a = (String)dataDisplay.get(i);
					String[]b= a.split(",");
		
					
					tableModel.addRow(b);
				}
				input.close();
									
				
			}
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			 JButton buttonBack = new JButton("Back");
				buttonBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frameData.dispose();
						StaffPage window = new StaffPage();
						window.setVisible(true);
						}}); 
				buttonBack.setBounds(490, 390, 89, 23);
				frameData.getContentPane().add(buttonBack);
			
		}


		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
}




