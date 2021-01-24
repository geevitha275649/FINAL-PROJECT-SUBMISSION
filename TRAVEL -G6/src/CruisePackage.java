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

public class CruisePackage extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruisePackage frame = new CruisePackage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CruisePackage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Go to Booking");
		btnBooking.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Cruise CruiseBook Page. Thank you");
				CruiseBooking sixthPage = new CruiseBooking();
				sixthPage.setVisible(true);
			}
		});
		
		btnBooking.setBounds(1117, 671, 189, 38);
		contentPane.add(btnBooking);

		JLabel lblNewLabel_3 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/coupleIcon.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(186, 155, 143, 125);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/familyIcon.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(193, 313, 136, 136);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/personIcon.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img3));
		lblNewLabel_4.setBounds(193, 482, 143, 125);
		contentPane.add(lblNewLabel_4);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane.setBackground(new Color(176, 224, 230));
		textPane.setBounds(698, 142, 404, 150);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_1.setBackground(new Color(176, 224, 230));
		textPane_1.setBounds(698, 303, 404, 150);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_2.setBackground(new Color(176, 224, 230));
		textPane_2.setBounds(698, 464, 404, 150);
		contentPane.add(textPane_2);

		JButton PackageAButton = new JButton("Cruise Package A");
		PackageAButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		PackageAButton.setBackground(Color.LIGHT_GRAY);
		PackageAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Cruise Package : A - Couple Ticket\r\n"
						+ "\nPrice : RM 3570\r\n"
						+ "\nPeriod : 3 day 2 nights - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Swimming pool and Bar facility are free of charge\r\n"
						);
			}
		});
		PackageAButton.setForeground(Color.BLACK);
		PackageAButton.setBounds(333, 142, 338, 150);
		contentPane.add(PackageAButton);
		
		JButton PackageBButton = new JButton("Cruise Package B");
		PackageBButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		PackageBButton.setBackground(Color.LIGHT_GRAY);
		PackageBButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_1.setText("Cruise Package : B - Family Ticket\r\n"
						+ "\nPrice : RM 4900\r\n"
						+ "\nPeriod : 4 day 3 nights - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Restaurant - Dinner and lunch for the first day and last day will be free of charge\r\n"
						);
			}
		});
		PackageBButton.setForeground(Color.BLACK);
		PackageBButton.setBounds(333, 303, 338, 150);
		contentPane.add(PackageBButton);
		
	
		JButton PackageCButton = new JButton("Cruise Package C");
		PackageCButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		PackageCButton.setBackground(Color.LIGHT_GRAY);
		PackageCButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_2.setText("Cruise Package : C - Single Ticket\r\n"
						+ "\nPrice : RM 2900\r\n"
						+ "\nPeriod : 2 day 1 night - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Can purchase items for RM200 in particular shops for free - T&C Applied.\r\n"
						);
			}
		});
		PackageCButton.setForeground(Color.BLACK);
		PackageCButton.setBounds(333, 464, 338, 150);
		contentPane.add(PackageCButton);
		
		JLabel lblNewLabel = new JLabel("Cruise Packages");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblNewLabel.setBounds(451, 11, 528, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/iconNext.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(1314, 669, 56, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/cruisefront4.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img0));
		lblNewLabel_1.setBounds(0, 0, 1400, 800);
		contentPane.add(lblNewLabel_1);

	}
}
