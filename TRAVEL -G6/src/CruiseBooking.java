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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CruiseBooking extends JFrame {

	private JPanel contentPane;
	private JTextField JtextTotalPayment;
	private JTextField JtextPPrice;
	private JTextField JtextContact;
	private JTextField JtextAddress;
	private JTextField JtextIcPassport;
	private JTextField JtextName;
	private JTextField JtextDate;
	private JTextField JtextRef;
	private JTable table;
	private JTextField JtextExtraPax;
	private JTextField JtextPClass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruiseBooking frame = new CruiseBooking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CruiseBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 10, 1360, 728);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel title_1 = new JPanel();
		title_1.setBounds(21, 24, 1317, 85);
		panel.add(title_1);
		title_1.setLayout(null);
		title_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(119, 136, 153)));
		title_1.setBackground(new Color(176, 224, 230));
		
		JLabel titleLabel = new JLabel("Cruise Booking System");
		titleLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		titleLabel.setBounds(370, 11, 626, 63);
		title_1.add(titleLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(112, 128, 144)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(21, 120, 465, 517);
		panel.add(panel_1_1);
		
		JLabel lblRef = new JLabel("Ref No");
		lblRef.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblRef.setBounds(31, 45, 140, 27);
		panel_1_1.add(lblRef);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblDate.setBounds(31, 82, 140, 27);
		panel_1_1.add(lblDate);
		
		JtextTotalPayment = new JTextField();
		JtextTotalPayment.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextTotalPayment.setBounds(365, 458, 84, 26);
		panel_1_1.add(JtextTotalPayment);
		JtextTotalPayment.setColumns(10);
		
		JtextPPrice = new JTextField();
		JtextPPrice.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPPrice.setColumns(10);
		JtextPPrice.setBounds(281, 381, 168, 26);
		panel_1_1.add(JtextPPrice);
		
		JtextContact = new JTextField();
		JtextContact.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextContact.setColumns(10);
		JtextContact.setBounds(195, 266, 254, 26);
		panel_1_1.add(JtextContact);
		
		JtextAddress = new JTextField();
		JtextAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextAddress.setColumns(10);
		JtextAddress.setBounds(195, 229, 254, 26);
		panel_1_1.add(JtextAddress);
		
		JtextIcPassport = new JTextField();
		JtextIcPassport.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextIcPassport.setColumns(10);
		JtextIcPassport.setBounds(195, 192, 254, 26);
		panel_1_1.add(JtextIcPassport);
		
		JtextName = new JTextField();
		JtextName.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextName.setColumns(10);
		JtextName.setBounds(195, 117, 254, 26);
		panel_1_1.add(JtextName);
		
		JtextDate = new JTextField();
		JtextDate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextDate.setColumns(10);
		JtextDate.setBounds(195, 80, 254, 26);
		panel_1_1.add(JtextDate);
		
		JtextRef = new JTextField();
		JtextRef.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextRef.setColumns(10);
		JtextRef.setBounds(195, 45, 254, 26);
		panel_1_1.add(JtextRef);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblName.setBounds(31, 120, 154, 27);
		panel_1_1.add(lblName);
		
		JLabel lblPassport = new JLabel("IC / Passport No");
		lblPassport.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPassport.setBounds(31, 154, 154, 27);
		panel_1_1.add(lblPassport);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblAddress.setBounds(31, 230, 140, 27);
		panel_1_1.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblContactNo.setBounds(31, 267, 140, 27);
		panel_1_1.add(lblContactNo);
		
		JLabel lblCruisePackage = new JLabel("Cruise Package");
		lblCruisePackage.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblCruisePackage.setBounds(31, 305, 140, 27);
		panel_1_1.add(lblCruisePackage);
		
		JLabel lblPClass = new JLabel("Preferable Class");
		lblPClass.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPClass.setBounds(31, 343, 170, 27);
		panel_1_1.add(lblPClass);
		
		JLabel lblPPrice = new JLabel("Package Price (RM)");
		lblPPrice.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPPrice.setBounds(31, 381, 240, 27);
		panel_1_1.add(lblPPrice);
		
		JLabel lblTotalPayment = new JLabel("Total Payment (RM)");
		lblTotalPayment.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblTotalPayment.setBounds(31, 460, 240, 27);
		panel_1_1.add(lblTotalPayment);
		
		JComboBox cmbCruisePackage = new JComboBox();
		cmbCruisePackage.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbCruisePackage.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Cruise Package A", "Cruise Package B", "Cruise Package C"}));
		cmbCruisePackage.setBounds(195, 305, 254, 27);
		panel_1_1.add(cmbCruisePackage);
		
		JComboBox cmbIcPassport = new JComboBox();
		cmbIcPassport.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbIcPassport.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "IC ", "Passport"}));
		cmbIcPassport.setBounds(195, 154, 254, 27);
		panel_1_1.add(cmbIcPassport);
		
		JComboBox cmbPClass = new JComboBox();
		cmbPClass.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbPClass.setModel(new DefaultComboBoxModel(new String[] {"Select", "First Class", "Second Class", "Third Class"}));
		cmbPClass.setBounds(195, 343, 160, 27);
		panel_1_1.add(cmbPClass);
		
		JtextExtraPax = new JTextField();
		JtextExtraPax.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextExtraPax.setColumns(10);
		JtextExtraPax.setBounds(281, 418, 168, 26);
		panel_1_1.add(JtextExtraPax);
		
		JLabel lblExtraPax = new JLabel("Extra pax");
		lblExtraPax.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblExtraPax.setBounds(31, 419, 240, 27);
		panel_1_1.add(lblExtraPax);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pprice = Integer.parseInt(JtextPPrice.getText());
				int pClassPrice = Integer.parseInt(JtextPClass.getText());
				int extraPax = Integer.parseInt(JtextExtraPax.getText());
				int totalPayment =  (extraPax * pClassPrice) + pprice;
				JtextTotalPayment.setText(String.valueOf(totalPayment));
			}
		});
		btnCalculate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		btnCalculate.setBounds(229, 458, 126, 27);
		panel_1_1.add(btnCalculate);
		
		JtextPClass = new JTextField();
		JtextPClass.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPClass.setColumns(10);
		JtextPClass.setBounds(365, 344, 84, 26);
		panel_1_1.add(JtextPClass);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(112, 128, 144)));
		panel_1_2.setBackground(new Color(176, 224, 230));
		panel_1_2.setBounds(21, 648, 1317, 69);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CruiseBook booking;
				CruiseBookingOperation bookingOperation = new CruiseBookingOperation();
				String refNo = JtextRef.getText();
				String date = JtextDate.getText();
				String name = JtextName.getText();
				int icPassport = Integer.parseInt(JtextIcPassport.getText());
				String address = JtextAddress.getText();
				int contactNo = Integer.parseInt(JtextContact.getText());
				String cruisePackage = (String) cmbCruisePackage.getSelectedItem();
				String pClass = (String) cmbPClass.getSelectedItem();
				int pClassPrice = Integer.parseInt(JtextPClass.getText());
				int pprice = Integer.parseInt(JtextPPrice.getText());
				int extraPax = Integer.parseInt(JtextExtraPax.getText());
				int totalPayment =  extraPax * pClassPrice + pprice;
					
				booking = new CruiseBook( refNo,  date,  name,  icPassport,  address,  contactNo,
						 cruisePackage,  pClass,  pClassPrice,  pprice,  extraPax,  totalPayment);	
				try {
					bookingOperation.addRecord(booking);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(697, 11, 167, 47);
		panel_1_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtextRef.setText("");
				JtextDate.setText("");
				JtextName.setText("");
				cmbIcPassport.setSelectedItem("Make a Selection");
				JtextIcPassport.setText("");
				JtextAddress.setText("");
				JtextContact.setText("");
				cmbCruisePackage.setSelectedItem("Make a Selection");
				cmbPClass.setSelectedItem("Select");
				JtextPClass.setText("");
				JtextPPrice.setText("");
				JtextExtraPax.setText("");
				JtextTotalPayment.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(253, 11, 161, 47);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						JtextRef.getText(),
						JtextDate.getText(),
						JtextName.getText(),
						//cmbIcPassport.getSelectedItem(),
						JtextIcPassport.getText(),
						JtextAddress.getText(),
						JtextContact.getText(),
						cmbCruisePackage.getSelectedItem(),
						cmbPClass.getSelectedItem(),
						JtextPClass.getText(),
						JtextPPrice.getText(),
						JtextExtraPax.getText(),
						JtextTotalPayment.getText()
		});
				
			if (table.getSelectedRow() == -1){
				if (table.getRowCount() == 0){
					JOptionPane.showMessageDialog(null, "Data Recorded is Confirmed", "Cruise Booking System",
				JOptionPane.OK_OPTION);
				}
			}
		}	
		});
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDisplay.setBounds(48, 11, 154, 47);
		panel_1_2.add(btnDisplay);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(897, 11, 154, 47);
		panel_1_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane, 
					    "Now you will be redirected to Cruise Inquiry Section. Thank you");
						
						CruiseInputOutput seventhPage = new CruiseInputOutput();
						seventhPage.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(1121, 11, 161, 47);
		panel_1_2.add(btnNewButton_4);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();		
				if (table.getSelectedRow() == -1){
					if (table.getRowCount() == 0){
						JOptionPane.showMessageDialog(null, "No data to delete", "Cruise Booking System", JOptionPane.OK_OPTION);
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Cruise Booking System", JOptionPane.OK_OPTION);
					}
						
				}else {
					model.removeRow(table.getSelectedRow());
				}
					}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(471, 11, 154, 47);
		panel_1_2.add(btnDelete);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(476, 120, 874, 517);
		panel.add(panel_1_1_1);
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(112, 128, 144)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 864, 495);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref No", "Date", "Name", "IC/Pt", "Address", "Contact", "Package", "Class", "C.Price", "P.Price", "E.Pax ", "T.Pay(RM)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(8).setPreferredWidth(55);
		scrollPane.setViewportView(table);
		
		
	}
}

