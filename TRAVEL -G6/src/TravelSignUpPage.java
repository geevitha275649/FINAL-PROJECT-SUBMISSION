import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TravelSignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelSignUpPage frame = new TravelSignUpPage();
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
	public TravelSignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 800, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeTo = new JLabel("Welcome to\r\n \r\n\r\n");
		lblWelcomeTo.setForeground(new Color(255, 255, 255));
		lblWelcomeTo.setBounds(167, 43, 500, 73);
		lblWelcomeTo.setFont(new Font("STFangsong", Font.BOLD, 90));
		panel.add(lblWelcomeTo);
		
		JLabel lblTitle = new JLabel("Jom Kasi Travel\r\n \r\n\r\n");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(94, 153, 661, 118);
		lblTitle.setFont(new Font("STFangsong", Font.BOLD, 90));
		panel.add(lblTitle);
		
		JLabel lblSystem = new JLabel("System");
		lblSystem.setForeground(Color.WHITE);
		lblSystem.setFont(new Font("STFangsong", Font.BOLD, 90));
		lblSystem.setBounds(270, 300, 312, 118);
		panel.add(lblSystem);
		
		JLabel lbltravelBringsPower = new JLabel("\"Travel brings power & love \r\n");
		lbltravelBringsPower.setForeground(Color.WHITE);
		lbltravelBringsPower.setFont(new Font("STXingkai", Font.PLAIN, 56));
		lbltravelBringsPower.setBounds(127, 437, 712, 118);
		panel.add(lbltravelBringsPower);
		
		JLabel lblBackIntoYour = new JLabel("back into your Life.\"\r\n");
		lblBackIntoYour.setForeground(Color.WHITE);
		lblBackIntoYour.setFont(new Font("STXingkai", Font.PLAIN, 56));
		lblBackIntoYour.setBounds(205, 527, 406, 91);
		panel.add(lblBackIntoYour);
		
		JLabel lblrumi = new JLabel("-Rumi-");
		lblrumi.setForeground(Color.WHITE);
		lblrumi.setFont(new Font("STFangsong", Font.BOLD, 30));
		lblrumi.setBounds(359, 584, 100, 91);
		panel.add(lblrumi);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/p2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(0, 0, 800, 749);
		panel.add(lblNewLabel_1);
		
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TravelGuiMain frame = new TravelGuiMain();
				frame.setVisible(true);
			}
		});
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setBackground(SystemColor.textHighlight);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignUp.setBounds(915, 554, 238, 37);
		contentPane.add(btnSignUp);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(838, 122, 404, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(838, 232, 404, 51);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel.setBounds(838, 68, 212, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailAddress = new JLabel("EMAIL ADDRESS");
		lblEmailAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblEmailAddress.setBounds(838, 184, 212, 37);
		contentPane.add(lblEmailAddress);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPassword.setBounds(838, 294, 212, 37);
		contentPane.add(lblPassword);
		
		JLabel lblRepeatPassword = new JLabel("REPEAT PASSWORD");
		lblRepeatPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblRepeatPassword.setBounds(838, 404, 212, 37);
		contentPane.add(lblRepeatPassword);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setBounds(838, 452, 404, 51);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField_1.setBackground(Color.LIGHT_GRAY);
		passwordField_1.setBounds(838, 342, 404, 51);
		contentPane.add(passwordField_1);
		
		
	}
}
