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
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

public class EventRegistration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField JtextFreeGift;
	private JTextField JtextTotal;
	private JTextField JtextPrice;
	private JTextField JtextAddress;
	private JTextField JtextPhoneNo;
	private JTextField JtextName;
	private JTextField JtextDate;
	private JTextField JtextRef;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventRegistration frame = new EventRegistration();
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
	public EventRegistration() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1558, 1019);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, "name_401326015008200");
		panel.setLayout(null);
		
		JPanel title_1 = new JPanel();
		title_1.setBounds(21, 24, 1139, 85);
		panel.add(title_1);
		title_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) null));
		title_1.setBackground(Color.PINK);
		title_1.setLayout(new BorderLayout(0, 0));
		
		JLabel titleLabel = new JLabel("\t\t\t\tCustomer Registration System");
		titleLabel.setBackground(new Color(240, 240, 240));
		titleLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 50));
		title_1.add(titleLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		title_1.add(lblNewLabel, BorderLayout.EAST);
		lblNewLabel.setForeground(Color.PINK);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(9, 9, 9, 9, (Color) Color.WHITE));
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(31, 120, 519, 517);
		panel.add(panel_1_1);
		
		JLabel lblRef = new JLabel("Ref No");
		lblRef.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblRef.setBounds(31, 45, 140, 27);
		panel_1_1.add(lblRef);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblDate.setBounds(31, 82, 140, 27);
		panel_1_1.add(lblDate);

		JtextName = new JTextField();
		JtextName.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextName.setColumns(10);
		JtextName.setBounds(195, 423, 285, 26);
		panel_1_1.add(JtextName);
		
		JtextAddress = new JTextField();
		JtextAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextAddress.setColumns(10);
		JtextAddress.setBounds(195, 365, 285, 26);
		panel_1_1.add(JtextAddress);
		
		JtextPhoneNo = new JTextField();
		JtextPhoneNo.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPhoneNo.setColumns(10);
		JtextPhoneNo.setBounds(195, 213, 285, 26);
		panel_1_1.add(JtextPhoneNo);
		
		JtextPrice = new JTextField();
		JtextPrice.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPrice.setColumns(10);
		JtextPrice.setBounds(195, 176, 285, 26);
		panel_1_1.add(JtextPrice);
		
		JtextTotal = new JTextField();
		JtextTotal.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextTotal.setColumns(10);
		JtextTotal.setBounds(195, 138, 285, 26);
		panel_1_1.add(JtextTotal);
		
		JtextFreeGift = new JTextField();
		JtextFreeGift.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextFreeGift.setColumns(10);
		JtextFreeGift.setBounds(195, 80, 285, 26);
		panel_1_1.add(JtextFreeGift);
		
		JtextRef = new JTextField();
		JtextRef.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextRef.setColumns(10);
		JtextRef.setBounds(195, 45, 285, 26);
		panel_1_1.add(JtextRef);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblName.setBounds(31, 135, 154, 27);
		panel_1_1.add(lblName);
		
		JLabel lblPassport = new JLabel("Gender");
		lblPassport.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPassport.setBounds(31, 268, 154, 27);
		panel_1_1.add(lblPassport);
		
		JLabel lblCarModel = new JLabel("Address");
		lblCarModel.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblCarModel.setBounds(31, 176, 140, 27);
		panel_1_1.add(lblCarModel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone No");
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(31, 221, 140, 27);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblMonthlyInstallments = new JLabel("Type Of Event");
		lblMonthlyInstallments.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblMonthlyInstallments.setBounds(31, 327, 140, 27);
		panel_1_1.add(lblMonthlyInstallments);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price (RM)");
		lblNewLabel_1_3.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_3.setBounds(31, 364, 140, 27);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblPrice = new JLabel("Total");
		lblPrice.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPrice.setBounds(31, 423, 140, 27);
		panel_1_1.add(lblPrice);
		
		JLabel lblNewLabel_1_4 = new JLabel("Free Gift");
		lblNewLabel_1_4.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_4.setBounds(31, 462, 79, 27);
		panel_1_1.add(lblNewLabel_1_4);
		
		JComboBox cmbTypeOfEvent = new JComboBox();
		cmbTypeOfEvent.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbTypeOfEvent.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Wedding", "Birthday Party", "Conferences", "Award and Competitions"}));
		cmbTypeOfEvent.setBounds(195, 327, 285, 27);
		panel_1_1.add(cmbTypeOfEvent);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male", "Female"}));
		cmbGender.setBounds(195, 268, 285, 27);
		panel_1_1.add(cmbGender);
		
		textField = new JTextField();
		textField.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		textField.setBounds(195, 463, 285, 24);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.WHITE));
		panel_1_2.setBackground(Color.PINK);
		panel_1_2.setBounds(21, 648, 1317, 69);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("Add Record");
		Image img = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed1(ActionEvent e) {				
			
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						JtextRef.getText(),
						JtextDate.getText(),
						JtextName.getText(),
						JtextAddress.getText(),
						JtextPhoneNo.getText(),
						cmbGender.getSelectedItem(),
						cmbTypeOfEvent.getSelectedItem(),
						JtextPrice.getText(),
						JtextTotal.getText(),
						JtextFreeGift.getText(),
						
		});
				
			if (table.getSelectedRow() == -1){
				if (table.getRowCount() == 0){
					JOptionPane.showMessageDialog(null, "Registration Update is Confirmed", "Customer Registration Form",
				JOptionPane.OK_OPTION);
				}
			}
		}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		btnNewButton.setBounds(10, 11, 202, 47);
		panel_1_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		Image img1 = new ImageIcon(this.getClass().getResource("/reset.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img1));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JtextRef.setText("");
					JtextDate.setText("");
					JtextName.setText("");
					JtextAddress.setText("");
					JtextPhoneNo.setText("");
					cmbGender.setSelectedItem("Make a Selection");
					cmbTypeOfEvent.setSelectedItem("Make a Selection");
					JtextPrice.setText("");
					JtextTotal.setText("");
					JtextFreeGift.setText("");
					
			}
		
		});		
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		btnNewButton_1.setBounds(222, 11, 202, 47);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		Image img2 = new ImageIcon(this.getClass().getResource("/bin.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img2));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		DefaultTableModel model = (DefaultTableModel) table.getModel();		
		if (table.getSelectedRow() == -1){
			if (table.getRowCount() == 0){
				JOptionPane.showMessageDialog(null, "No data to delete", "Customer Registration System", JOptionPane.OK_OPTION);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Select a row to delete", "Customer Registration System", JOptionPane.OK_OPTION);
			}
				
		}else {
			model.removeRow(table.getSelectedRow());
		}
			}
		});
		btnNewButton_2.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		btnNewButton_2.setBounds(434, 11, 202, 47);
		panel_1_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		Image img3 = new ImageIcon(this.getClass().getResource("/print.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img3));
		btnNewButton_3.setBackground(Color.WHITE);
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
		btnNewButton_3.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		btnNewButton_3.setBounds(646, 11, 202, 47);
		panel_1_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		Image img4 = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(img4));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you wants to exit", "Customer Registration System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		btnNewButton_4.setBounds(868, 11, 202, 47);
		panel_1_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Next");
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		Image img5 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img5));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventInputOutput InputOutput = new EventInputOutput();
				InputOutput.setVisible(true);
				InputOutput.toFront();
			}
		});
		btnNewButton_6.setBounds(1080, 10, 207, 49);
		panel_1_2.add(btnNewButton_6);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(550, 120, 778, 517);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.WHITE));
		panel_1_1_1.setBackground(Color.PINK);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 758, 495);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref No", "Date", "Name", "Address", "Phone No", "Gender", "Type Of Event", "Price (RM)", "Total", "Free Gift"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(8).setPreferredWidth(55);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_5 = new JButton("");
		Image img6 = new ImageIcon(this.getClass().getResource("/form.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(img6));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5.setBounds(1158, 24, 161, 85);
		panel.add(btnNewButton_5);

	}
}