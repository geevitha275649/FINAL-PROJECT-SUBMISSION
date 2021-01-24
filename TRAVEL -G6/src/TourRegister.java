import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.print.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import javax.swing.ImageIcon;


public class TourRegister extends JFrame {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	
		
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TourRegister frame = new TourRegister();
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
	public TourRegister() {
		setBounds(new Rectangle(0, 0, 658, 466));
		setTitle("CUSTOMER BOOKING SYSTEM(TOUR GUIDE)");
		getContentPane().setBackground(new Color(176, 224, 230));
		getContentPane().setLayout(null);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame(); 
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","Print System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(new Color(204, 0, 0));
		btnNewButton_4.setBounds(535, 10, 85, 21);
		getContentPane().add(btnNewButton_4);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(233, 97, 399, 303);
		getContentPane().add(layeredPane);
		
		table = new JTable();
		table.setBounds(0, 0, 399, 303);
		layeredPane.add(table);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"REF. NO", "NAME", "AGE", "TELEPHONE NO.", "NO. OF PAX", "SERVICES"},
			},
			new String[] {
				"REF. NO", "NAME", "AGE", "TELEPHONE NO.", "NO. OF PAX", "SERVICES"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(81);
		table.getColumnModel().getColumn(2).setPreferredWidth(46);
		table.getColumnModel().getColumn(3).setPreferredWidth(88);
		table.getColumnModel().getColumn(4).setPreferredWidth(77);
		table.getColumnModel().getColumn(5).setPreferredWidth(85);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(0, 0, 399, 303);
		layeredPane.add(scrollPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane_1.setBounds(10, 86, 213, 314);
		getContentPane().add(layeredPane_1);
		
		JLabel lblTypeOfService = new JLabel("TYPE OF SERVICE:");
		lblTypeOfService.setBounds(10, 189, 132, 22);
		layeredPane_1.add(lblTypeOfService);
		lblTypeOfService.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 158, 162, 21);
		layeredPane_1.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PLEASE SELECT", "Min 2pax", "3", "4", "5", "Max 10pax"}));
		
		JLabel lblNoOfPax = new JLabel("NO. OF PAX:");
		lblNoOfPax.setBounds(10, 126, 81, 22);
		layeredPane_1.add(lblNoOfPax);
		lblNoOfPax.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setBounds(10, 94, 56, 22);
		layeredPane_1.add(lblAge);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 97, 96, 19);
		layeredPane_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setBounds(10, 58, 56, 22);
		layeredPane_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 62, 96, 19);
		layeredPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRef = new JLabel("REF. NO");
		lblRef.setBounds(10, 26, 56, 22);
		layeredPane_1.add(lblRef);
		lblRef.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(76, 30, 96, 19);
		layeredPane_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PLEASE SELECT", "CITY TOUR", "CULTURE TOUR", "FOREST TOUR", "ADVENTURE TOUR"}));
		comboBox_1.setBounds(10, 221, 162, 21);
		layeredPane_1.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("TELEPHONE NO.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 257, 106, 13);
		layeredPane_1.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 280, 162, 19);
		layeredPane_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane_2.setBounds(234, 38, 398, 42);
		getContentPane().add(layeredPane_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try
		           {
		               table.print();
		           }
		           catch(java.awt.print.PrinterException e1){
		               System.err.format("No Printer found", e1.getMessage());
		           }
			}
		});
		btnNewButton_3.setBounds(303, 10, 85, 21);
		layeredPane_2.add(btnNewButton_3);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()== -1){
		            if(table.getRowCount()== 0){
		                
		                JOptionPane.showMessageDialog(null, "No data to delete",
		                        "CUSTOMER BOOKING SYSTEM",JOptionPane.OK_OPTION);
		            }else{
		                JOptionPane.showMessageDialog(null, "Select a row to delete",
		                        "CUSTOMER BOOKING SYSTEM", JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }
			}
		});
		btnNewButton_2.setBounds(208, 10, 85, 21);
		layeredPane_2.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedItem("PLEASE SELECT");
				comboBox_1.setSelectedItem("PLEASE SELECT");
			}
		});
		btnNewButton_1.setBounds(113, 10, 85, 21);
		layeredPane_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel model;
			        model = (DefaultTableModel) table.getModel();
			        model.addRow(new Object[]{
			            
			        	textField.getText(),
			            textField_1.getText(),
			            textField_2.getText(),
			            textField_3.getText(),
			            comboBox.getSelectedItem(),
			            comboBox_1.getSelectedItem()
			            
			        });
			        
			        if(table.getSelectedRow()==1){
			            if(table.getRowCount()==0){  
			                JOptionPane.showMessageDialog(null, "Update confirmed", "Booking System", JOptionPane.OK_OPTION);
			            }
			        }
			}
		});
		btnNewButton.setBounds(18, 10, 85, 21);
		layeredPane_2.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("EXPORT");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePatch = "C:\\Users\\Danielfirdaus\\OneDrive\\Desktop\\UUM\\Programming 2\\Text.txt";
				File file = new File(filePatch);
				
				try {
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					
					for(int i=0; i<table.getRowCount(); i++) {
						for(int j = 0; j<table.getColumnCount(); j++) {
							bw.write(table.getValueAt(i, j).toString()+ " ");
						}
						bw.newLine();
					}
					bw.close();
					fw.close();
				}
				catch(IOException ex) {
					java.util.logging.Logger.getLogger(TourRegister.class.getName()).log(Level.SEVERE,null,ex);
				}
			}
		});
		btnNewButton_5.setBounds(434, 10, 91, 21);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("IMPORT");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model;
		        model = (DefaultTableModel) table.getModel();
				String filePatch = "C:\\Users\\Danielfirdaus\\OneDrive\\Desktop\\UUM\\Programming 2\\Text.txt";
				File file = new File(filePatch);
				
				
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					Object[] lines = br.lines().toArray();
					
					for(int i = 0; i<lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row);
					}
				}
				catch(FileNotFoundException ex) {
					java.util.logging.Logger.getLogger(TourRegister.class.getName()).log(Level.SEVERE,null,ex);
				}
				
				
			}
		});
		btnNewButton_6.setBounds(339, 10, 85, 21);
		getContentPane().add(btnNewButton_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 213, 67);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel(" TOUR GUIDE");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(0, 0, 213, 67);
		panel.add(lblNewLabel_2);
	}
}