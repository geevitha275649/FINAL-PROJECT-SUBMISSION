import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CruiseGui extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruiseGui frame = new CruiseGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CruiseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CruiseBook");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CruiseBooking thirdPage = new CruiseBooking();
				thirdPage.setVisible(true);
			}
		});
		btnNewButton.setBounds(447, 419, 192, 113);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Travel Schedule");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CruiseTravelSchedule fourthPage = new CruiseTravelSchedule();
				fourthPage.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(322, 225, 192, 113);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cruise Package");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CruisePackage fifthPage = new CruisePackage();
				fifthPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(870, 225, 192, 113);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Cruise Facilities");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CruiseFacilities sixthPage = new CruiseFacilities();
				sixthPage.setVisible(true);
			}
		});
		btnNewButton_2_1.setBounds(598, 225, 192, 113);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Inquiries");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CruiseInputOutput seventhPage = new CruiseInputOutput();
				seventhPage.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(746, 419, 192, 113);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Let the Cruise Consultant Help You !");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblNewLabel.setBounds(131, 11, 1120, 86);
		contentPane.add(lblNewLabel);

		JLabel lblCruiseFront = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/cruisefront2.jpg")).getImage();
		lblCruiseFront.setIcon(new ImageIcon(img0));
		lblCruiseFront.setBounds(0, 0, 1370, 749);
		contentPane.add(lblCruiseFront);
	}
}
