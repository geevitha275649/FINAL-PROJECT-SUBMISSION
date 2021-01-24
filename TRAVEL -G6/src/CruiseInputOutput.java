import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class CruiseInputOutput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public CruiseInputOutput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("For any inquiries :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(474, 241, 183, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textField.setBounds(474, 303, 419, 103);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String word = textField.getText();
					FileWriter stream = new FileWriter("C:\\Users\\acer\\Documents\\file.txt");
					BufferedWriter out = new BufferedWriter (stream);
					out.write(word);
					out.close();
				} catch (Exception ex) {}
			}
		});
		
		btnNewButton.setBounds(474, 455, 419, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/iconNext.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(1314, 669, 56, 40);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Home Travel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TravelGuiMain frame = new TravelGuiMain();
				frame.setVisible(true);
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(1175, 669, 129, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/cruisefront3.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img0));
		lblNewLabel_1.setBounds(0, 0, 1370, 749);
		contentPane.add(lblNewLabel_1);
	}		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CruiseInputOutput gui = new CruiseInputOutput();
						gui.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}
