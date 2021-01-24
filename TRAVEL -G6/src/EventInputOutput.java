import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EventInputOutput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	/**
	 * Create the frame.
	 */
	public EventInputOutput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("For any inquiries :");
		Image img = new ImageIcon(this.getClass().getResource("/education.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		Image img1 = new ImageIcon(this.getClass().getResource("/send.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String word = textField.getText();
					FileWriter stream = new FileWriter("C:\\Users\\Public\\Documents\\file.txt");
					BufferedWriter out = new BufferedWriter (stream);
					out.write(word);
					out.close();
				} catch (Exception ex) {}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 19));
		Image img2 = new ImageIcon(this.getClass().getResource("/house.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TravelGuiMain frame = new TravelGuiMain();
				frame.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(35)
									.addComponent(btnNewButton)
									.addGap(47)
									.addComponent(btnNewButton_1)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
	}		
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EventInputOutput gui = new EventInputOutput();
						gui.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}