import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
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
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class TourMain extends JFrame {

private JFrame frame;
private JPanel contentPane;
private JTextField showF;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TourMain frame = new TourMain();
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
public TourMain() {
	setTitle("WELCOME TO TOUR GUIDE ");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 790, 516);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(176, 224, 230));
	contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Serving you with our service!", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Service that available!", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	panel.setBounds(22, 171, 300, 171);
	contentPane.add(panel);
	panel.setLayout(null);
	
	JList list = new JList();
	list.setBounds(10, 20, 280, 141);
	panel.add(list);
	list.setBackground(Color.LIGHT_GRAY);

	
	JButton btnChoose = new JButton("Click Here! Available Services");
	btnChoose.setForeground(new Color(70, 130, 180));
	btnChoose.setBackground(Color.WHITE);
	btnChoose.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnChoose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DefaultListModel DLM = new DefaultListModel();
			DLM.addElement("City Tour");
			DLM.addElement("Culture Tour");
			DLM.addElement("Adventure Tour");
			DLM.addElement("Forest Tour");
			list.setModel(DLM);
		}
	});
	btnChoose.setBounds(47, 125, 254, 36);
	contentPane.add(btnChoose);
	
	JButton btnBooking = new JButton("!! BOOK NOW !! ");
	btnBooking.setForeground(new Color(255, 0, 0));
	btnBooking.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnBooking.setBackground(SystemColor.text);
	btnBooking.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TourRegister nw = new TourRegister();
			nw.NewScreen();
			//JOptionPane.showMessageDialog(contentPane,	
		    //"Booking is currently unavailable due to Covid19. We apoligize for the inconvenience. Thank you");
		}
	});
	btnBooking.setBounds(47, 360, 254, 49);
	contentPane.add(btnBooking);
	
	JTextPane textPane = new JTextPane();
	textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
	textPane.setBackground(Color.LIGHT_GRAY);
	textPane.setBounds(332, 237, 437, 231);
	contentPane.add(textPane);

	
	JButton CityTourButton = new JButton("CITY TOUR");
	CityTourButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	CityTourButton.setBackground(new Color(32, 178, 170));
	CityTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : City Tour\r\n"
					 	+ "\n | Welcome to City Tour |\r\n "
		                + "\n Tour Guide Name: Ms. Farah\r\n"
		                + "\n Age: 25\r\n"
		                + "\n Suggestion of Places: \r\n"
		                + "\n 1. Visit Museum\r\n"
		                + "\n 2. city sighseeing\r\n"
		                + "\n 3. visit main landmarks\r\n"
		                + "\n Suggestion of Transportation: Bus");
		}
	});
	CityTourButton.setForeground(Color.BLACK);
	CityTourButton.setBounds(573, 118, 178, 49);
	contentPane.add(CityTourButton);
	
	JButton CultureTourButton = new JButton("CULTURE TOUR");
	CultureTourButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	CultureTourButton.setBackground(new Color(32, 178, 170));
	CultureTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Culture Tour"
	                + "\n | Welcome to Culture Tour |\r\n"
	                + "\n Tour Guide Name: Ms. Gaya\r\n"
	                + "\n Age: 29\r\n"
	                + "\n Suggestion of Places: \r\n"
	                + "\n 1. Craft Museum \r\n"
	                + "\n 2. Traditional Culinary Institution \r\n"
	                + "\n 3. Culture Expo \r\n"
	                + "\n Suggestion of Transportation: Bus");
		}
	});
	CultureTourButton.setForeground(Color.BLACK);
	CultureTourButton.setBounds(356, 118, 178, 49);
	contentPane.add(CultureTourButton);
	
	JButton AdventureTourButton = new JButton("ADVENTURE TOUR");
	AdventureTourButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	AdventureTourButton.setBackground(new Color(32, 178, 170));
	AdventureTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Adventure Tour\r\n"
						+ "\n | Welcome to Adventure Tour | \r\n"
		                + "\n Tour Guide Name: Mr.Raja \r\n"
		                + "\n Age: 33 \r\n"
		                + "\n Suggestion of Places: \r\n"
		                + "\n 1) Adam's Peak (Sri Lanka)\r\n"
		                + "\n Suggestion of Transportation: Bus");
		}
	});
	AdventureTourButton.setForeground(Color.BLACK);
	AdventureTourButton.setBounds(356, 185, 178, 49);
	contentPane.add(AdventureTourButton);
	
	JButton ForestTourButton = new JButton("FOREST TOUR");
	ForestTourButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	ForestTourButton.setBackground(new Color(32, 178, 170));
	ForestTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Forest Tour\r\n"
					+ "\n | Welcome to Forest Tour | \r\n"
	                + "\n Tour Guide Name: Mr.Ali\r\n"
	                + "\n Age: 27\r\n"
	                + "\n Suggestion of Places: \r\n"
	                + "\n 1. Mossy Forest Gunung Brinchang \r\n"
	                + "\n 2. Gunung Tahan Exploration\r\n"
	                + "\n Suggestion of Transportation: \r\n"
	                + "1) Bus");
		}
	});
	ForestTourButton.setForeground(Color.BLACK);
	ForestTourButton.setBounds(573, 185, 178, 49);
	contentPane.add(ForestTourButton);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(null, "Welcome,Hi", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panel_1.setBounds(85, 20, 686, 76);
	contentPane.add(panel_1);
	panel_1.setLayout(null);
	
	JLabel lblNewLabel = new JLabel(" TOUR GUIDE SERVICE INFORMATION");
	lblNewLabel.setBounds(0, 0, 686, 76);
	panel_1.add(lblNewLabel);
	lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 34));
	
	JButton btnNewButton = new JButton("EXIT");
	btnNewButton.setBackground(new Color(204, 0, 0));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame = new JFrame(); 
			if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","THANK YOU & COME AGAIN!",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
	btnNewButton.setForeground(new Color(0, 0, 0));
	btnNewButton.setBounds(22, 447, 85, 21);
	contentPane.add(btnNewButton);
		
	
}
}