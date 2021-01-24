import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class WriterTravelInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WriterTravelInterface frame = new WriterTravelInterface();
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
	public WriterTravelInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Detail Of All Continent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WriterTravelGUI firstPage = new WriterTravelGUI();
				firstPage.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 173, 224, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Traveller Registration Form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WriterRegistrationSystem secondPage = new WriterRegistrationSystem();
				secondPage.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(277, 173, 224, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inquiries");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WriterInputOutput thirdPage = new WriterInputOutput();
				thirdPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(147, 231, 212, 47);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO MY PAGE\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel_1.setBounds(30, 0, 471, 47);
		contentPane.add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/bg2.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(0, 58, 517, 343);
		contentPane.add(lblNewLabel);
		
		
		
	}
}