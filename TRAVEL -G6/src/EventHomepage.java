import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class EventHomepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventHomepage window = new EventHomepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EventHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(100, 100, 1510, 1121);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton =  new JButton("Press here!!!");
		Image img = new ImageIcon(this.getClass().getResource("/button.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventGui EventGui = new EventGui();
				EventGui.setVisible(true);
				EventGui.toFront();

			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/welcoming.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/travel.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/redcarpet.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(482)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(432))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(638, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(544))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(558, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
					.addGap(503))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
							.addGap(46))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(135))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}