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
import java.awt.Image;

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
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class AgentInformation extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField modeltxt;
	private JTextArea box_answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentInformation frame = new AgentInformation();
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
	public AgentInformation() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 1386, 753);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 28, 1322, 114);
		panel_1.add(panel);
		panel.setBackground(SystemColor.info);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Travel Agent Information\r\n\r\n");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		lblNewLabel_4.setBounds(25, 25, 1035, 61);
		panel.add(lblNewLabel_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2_1.setBackground(new Color(176, 224, 230));
		panel_2_1.setBounds(22, 153, 1322, 577);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/japan.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(48, 62, 198, 140);
		panel_2_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/cali.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(310, 62, 198, 140);
		panel_2_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/cina.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(557, 57, 299, 150);
		panel_2_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/brazil.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(841, 62, 198, 140);
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/sk.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(1091, 62, 198, 140);
		panel_2_1.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Japan\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String model;

				model=("You have Choosen: Japan Package");
				modeltxt.setText(model);


				box_answer.setText("JAPAN PROMOTION PACKAGE:"	+ "\n\nAwesome place to visit"
								+ "\n\nWeather temperature is around 6 to 18°C."
								+ "\n\nThe Season is cherry blossom season"
								+ "\n\nA warm coat and a scarf are still a must when venturing outside"
								+ "\n\nBooking date is Available on March to June"
								+"\n\nPrice is RM4500/pax");

				
				
					
				


				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(79, 217, 136, 34);
		panel_2_1.add(btnNewButton);
		
		JButton btnCalifornia = new JButton("California\r\n");
		btnCalifornia.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCalifornia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String model;

				model=("You have Choosen: California Package");
				modeltxt.setText(model);


				box_answer.setText("CALIFORNIA PROMOTION PACKAGE:"	+ "\n\nAwesome place to visit"
								+ "\n\nWeather temperature is around 28 to 31°C."
								+ "\n\nA thin inner clothes and sunblock are needed to avoid sunburn"
								+ "\n\nBooking date is Available on June to September"
								+"\n\nPrice is RM3000/pax");

				
				
				
			}
		});
		btnCalifornia.setBounds(338, 217, 136, 34);
		panel_2_1.add(btnCalifornia);
		
		JButton btnChina = new JButton("China");
		btnChina.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Place is not available due to COVID-19");
			}
		});
		btnChina.setBounds(617, 217, 136, 34);
		panel_2_1.add(btnChina);
		
		JButton btnBrazil = new JButton("Brazil\r\n");
		btnBrazil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String model;

				model=("You have Choosen: Brazil Package");
				modeltxt.setText(model);


				box_answer.setText("BRAZIL PROMOTION PACKAGE:"	+ "\n\nAwesome place to visit"
				
								+ "\n\nThe city's seductive samba beat and incredible panoramic views last year-round"
								+ "\n\nDaytime temperatures can sometimes surpass temperature is around 32 to 37°C."
								+ "\n\nA thin inner clothes and sunblock are needed to avoid sunburn"
								+ "\n\nBooking date is Available on December to March"
								+"\n\nPrice is RM3200/pax");

				
			}
		});
		btnBrazil.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBrazil.setBounds(874, 214, 136, 34);
		panel_2_1.add(btnBrazil);
		
		JButton btnSouthKorea = new JButton("South Korea");
		btnSouthKorea.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSouthKorea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String model;

				model=("You have Choosen: South Korea Package");
				modeltxt.setText(model);


				box_answer.setText("SOUTH KOREA PROMOTION PACKAGE:"	+ "\n\nAwesome place to visit"
				
								+ "\n\nSpring is often seen as the best time of year to visit South Korea"
								+ "\n\nWith average daily temperatures a pleasant 15 - 18°C"
								+ "\n\nDuring this time the flowers are in bloom and green spaces are bathed in the delightful hues\nof the pink cherry blossom"
								+ "\n\nBooking date is Available on April to June"
								+"\n\nPrice is RM4200/pax");

				
			}
		});
		btnSouthKorea.setBounds(1119, 214, 153, 34);
		panel_2_1.add(btnSouthKorea);
		
		JButton btnNewButton_1 = new JButton("Click Here for Booking");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(contentPane, 
					    "Now you will be redirected to booking registration. Thank you");
						
						AgentBookingRegister next = new AgentBookingRegister();
						next.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(894, 515, 395, 34);
		panel_2_1.add(btnNewButton_1);
		
		modeltxt = new JTextField();
		modeltxt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		modeltxt.setEditable(false);
		modeltxt.setColumns(10);
		modeltxt.setBackground(Color.WHITE);
		modeltxt.setBounds(63, 298, 314, 19);
		panel_2_1.add(modeltxt);
		
		 box_answer = new JTextArea();
		 box_answer.setEditable(false);
		box_answer.setBounds(63, 327, 549, 228);
		panel_2_1.add(box_answer);
		
		JButton btnChina_1 = new JButton("Exit");
		btnChina_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame= new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm to exit")== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnChina_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChina_1.setBounds(720, 515, 136, 34);
		panel_2_1.add(btnChina_1);
		
		
	}
}