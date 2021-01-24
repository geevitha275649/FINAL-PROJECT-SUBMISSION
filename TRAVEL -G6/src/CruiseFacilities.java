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

public class CruiseFacilities extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruiseFacilities frame = new CruiseFacilities();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CruiseFacilities() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1386, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), 
		new Color(160, 160, 160)), "We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER,
	    TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Go to Cruise Packages");
		btnBooking.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Cruise Packages Page. Thank you");
				CruisePackage seventhPage = new CruisePackage();
				seventhPage.setVisible(true);
			}
		});
		btnBooking.setBounds(1117, 671, 189, 38);
		contentPane.add(btnBooking);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image img1 = new ImageIcon(this.getClass().getResource("/c3.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(430, 477, 384, 175);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image img2 = new ImageIcon(this.getClass().getResource("/c2.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(430, 278, 384, 188);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		Image img3 = new ImageIcon(this.getClass().getResource("/c1.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img3));
		lblNewLabel_4.setBounds(430, 92, 384, 175);
		contentPane.add(lblNewLabel_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(821, 477, 404, 175);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setBounds(821, 278, 404, 188);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPane_2.setBackground(Color.WHITE);
		textPane_2.setBounds(821, 92, 404, 175);
		contentPane.add(textPane_2);

		JButton Thirdclass = new JButton("Silver Cruise");
		Thirdclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		Thirdclass.setBackground(Color.LIGHT_GRAY);
		Thirdclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText(" Cruise - Silver Cruise\r\n"
						+ "\nInner Facility : Bar with swimming pool\r\n"
						+ "\nExterior Point : Flower Garden with 5-star Restaurant\r\n"
						+ "\nAmmenities : Condusive and five star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
						);
			}
		});
		Thirdclass.setForeground(Color.BLACK);
		Thirdclass.setBounds(159, 477, 267, 175);
		contentPane.add(Thirdclass);
		
		JButton Secondclass = new JButton("Golden Star Cruise");
		Secondclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		Secondclass.setBackground(Color.LIGHT_GRAY);
		Secondclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_1.setText("Cruise - Golden Star Cruise\r\n"
						+ "\nInner Facility : Room Theatre\r\n"
						+ "\nExterior Point :  Elegant Theme with golden view sunrise and sunset\r\n"
						+ "\nAmmenities : Condusive and four star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				     
						);
			}
		});
		Secondclass.setForeground(Color.BLACK);
		Secondclass.setBounds(159, 278, 267, 188);
		contentPane.add(Secondclass);
		
		JButton firstclass = new JButton("Premium Cruise");
		firstclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstclass.setBackground(Color.LIGHT_GRAY);
		firstclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_2.setText("Cruise - Premium Cruise\r\n"
						+ "\nInner Facility : Shopping Mall\r\n"
						+ "\nExterior Point :  Sky Garden\r\n"
						+ "\nAmmenities : Condusive and five star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				      
						);
			}
		});
		firstclass.setForeground(Color.BLACK);
		firstclass.setBounds(159, 92, 267, 175);
		contentPane.add(firstclass);
		
		JLabel lblNewLabel = new JLabel("Cruise Facilities");
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
