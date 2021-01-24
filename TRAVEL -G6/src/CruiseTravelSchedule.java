import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JFormattedTextField;

public class CruiseTravelSchedule extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruiseTravelSchedule frame = new CruiseTravelSchedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CruiseTravelSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
		"We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Go to Cruise Facilities");
		btnBooking.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Cruise Facilities Page. Thank you");
				CruiseFacilities fifthPage = new CruiseFacilities();
				fifthPage.setVisible(true);
			}
		});
		btnBooking.setBounds(1117, 671, 189, 38);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(907, 256, 313, 255);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setBounds(539, 256, 313, 255);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_2.setBackground(Color.WHITE);
		textPane_2.setBounds(169, 256, 313, 255);
		contentPane.add(textPane_2);

		JButton Thirdclass = new JButton("Third Class");
		Thirdclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		Thirdclass.setBackground(Color.LIGHT_GRAY);
		Thirdclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Third Class - Silver Cruise (+200RM)\r\n"
						+ "\nAvailable : Jan-Mar & July-Sept\r\n"
						+ "\nBoarding Point : Jamaica\r\n"
						+ "\nDestination Point : Papua New Gunea Sea\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Thirdclass.setForeground(Color.BLACK);
		Thirdclass.setBounds(907, 158, 313, 38);
		contentPane.add(Thirdclass);
		
		JButton Secondclass = new JButton("Second Class");
		Secondclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		Secondclass.setBackground(Color.LIGHT_GRAY);
		Secondclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_1.setText("Second Class - Golden Star Cruise (+400RM)\r\n"
						+ "\nAvailable : Mac-May & Oct-Dec\r\n"
						+ "\nBoarding Point :  Sydney\r\n"
						+ "\nDestination Point : Netherland / Cambodia / Atlantic\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Secondclass.setForeground(Color.BLACK);
		Secondclass.setBounds(539, 158, 313, 38);
		contentPane.add(Secondclass);
		
		JButton firstclass = new JButton("First Class");
		firstclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstclass.setBackground(Color.LIGHT_GRAY);
		firstclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_2.setText("First Class - Premium Cruise (+600RM)\r\n"
						+ "\nAvailable : All time Available\r\n"
						+ "\nBoarding Point :  Washington\r\n"
						+ "\nDestination Point : Netherland / Cambodia / Atlantic\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		firstclass.setForeground(Color.BLACK);
		firstclass.setBounds(169, 158, 313, 38);
		contentPane.add(firstclass);
		
		JLabel lblNewLabel = new JLabel("Cruise Class Travel Schedule");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblNewLabel.setBounds(233, 11, 935, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/iconNext.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(1314, 669, 56, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/cruisefront4.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img0));
		lblNewLabel_1.setBounds(0, 0, 1370, 749);
		contentPane.add(lblNewLabel_1);
	}
}
