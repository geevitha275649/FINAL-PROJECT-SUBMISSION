import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class AgentBookingRegister extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textFirstname;
	private JTextField textlastname;
	private JTextField textsalary;
	private JTextField textadds;
	private JTable table1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentBookingRegister frame = new AgentBookingRegister();
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
	public AgentBookingRegister() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 10, 1386, 753);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 28, 1322, 114);
		panel_1.add(panel);
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Travel Agent Booking System\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_4.setBounds(25, 25, 1035, 61);
		panel.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(27, 152, 467, 450);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Reference no");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(31, 26, 155, 30);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(31, 67, 131, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lastname");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(31, 107, 131, 30);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(31, 147, 131, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date Package");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(31, 188, 155, 30);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choosen package");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(20, 228, 176, 30);
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(196, 26, 199, 30);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textFirstname = new JTextField();
		textFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFirstname.setColumns(10);
		textFirstname.setBounds(196, 67, 199, 30);
		panel_2.add(textFirstname);
		
		textlastname = new JTextField();
		textlastname.setFont(new Font("Tahoma", Font.BOLD, 20));
		textlastname.setColumns(10);
		textlastname.setBounds(196, 107, 199, 30);
		panel_2.add(textlastname);
		
		textsalary = new JTextField();
		textsalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textsalary.setColumns(10);
		textsalary.setBounds(196, 147, 199, 30);
		panel_2.add(textsalary);
		
		textadds = new JTextField();
		textadds.setFont(new Font("Tahoma", Font.BOLD, 20));
		textadds.setColumns(10);
		textadds.setBounds(196, 188, 199, 30);
		panel_2.add(textadds);
		
		JComboBox model1 = new JComboBox();
		
		AgentPackageList lp = new AgentPackageList();
		String[] pack = lp.pkg;
		
			
	
		model1.setFont(new Font("Tahoma", Font.BOLD, 18));
		model1.setModel(new DefaultComboBoxModel(pack));
		model1.setBounds(206, 226, 245, 37);
		panel_2.add(model1);
		
		JButton btnBack = new JButton("Back to Travel Info\r\n\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(contentPane, 
					    "Now you will be redirected to Back to Travel Information. Thank you");
						
						AgentInformation next = new AgentInformation();
						next.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(31, 399, 301, 41);
		panel_2.add(btnBack);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBounds(27, 612, 1334, 120);
		panel_1.add(panel_3);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 DefaultTableModel model = (DefaultTableModel) table1.getModel();
				 model.addRow(new Object[]{		
						 
						 textField.getText(),
						 textFirstname.getText(),
						 textlastname.getText(),
						 textsalary.getText(),
						 textadds.getText(),
							
						 model1.getSelectedItem(),
		    	   });
				 
			     
			        
			       if (table1.getSelectedRow() == -1){
			           if (table1.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Customer Information Update confirmed","Registered Successfully",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(32, 41, 201, 41);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textFirstname.setText("");
				textlastname.setText("");
				textsalary.setText("");
				textadds.setText("");
				model1.setSelectedItem("PackageAvailable");
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(274, 41, 201, 41);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table1.getModel();
		        if(table1.getSelectedRow()==-1){
		            if(table1.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Booking System",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Booking System",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table1.getSelectedRow());
		        }     
				
			
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(785, 41, 201, 41);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame= new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm to exit")== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(1043, 41, 201, 41);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Save Data");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Data is saved");
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String filePath = "C:\\Users\\osber\\OneDrive\\Desktop\\workspace\\travelagentbookingdata.txt";
			        File file = new File(filePath);
			        try {
			            FileWriter fw = new FileWriter(file);
			            BufferedWriter bw = new BufferedWriter(fw);
			            
			            for(int i = 0; i < table1.getRowCount(); i++){//rows
			                for(int j = 0; j < table1.getColumnCount(); j++){//columns
			                    bw.write(table1.getValueAt(i, j).toString()+" ");
			                }
			                bw.newLine();
			                
			            }
			            
			            bw.close();
			            fw.close();
			            
			        } catch (IOException ex) {
			            Logger.getLogger(AgentBookingRegister.class.getName()).log(Level.SEVERE, null, ex);
			        }
			        
			    }
			
		});  
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(500, 41, 201, 41);
		panel_3.add(btnNewButton_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2_1.setBackground(new Color(176, 224, 230));
		panel_2_1.setBounds(499, 153, 845, 449);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 30, 785, 398);
		panel_2_1.add(scrollPane);
		
		table1 = new JTable();
		table1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference no", "Firstname", "Lastname", "Address", "Date Package", "Choosen Package"
			}
		));
		scrollPane.setViewportView(table1);
	}
}