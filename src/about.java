import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class about {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about window = new about();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void aboutprj() 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about window = new about();
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
	public about() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel lblDesignCopyrights = new JLabel("design copyrights \u00A9 chinmaya");
		lblDesignCopyrights.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDesignCopyrights.setForeground(new Color(255, 255, 224));
		lblDesignCopyrights.setBounds(1711, 1018, 183, 23);
		frame.getContentPane().add(lblDesignCopyrights);
		
		JPanel body = new JPanel();
		body.setLayout(null);
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(14, 210, 1880, 809);
		frame.getContentPane().add(body);
		
		JLabel lblProjectMembers = new JLabel("PROJECT MEMBERS : ");
		lblProjectMembers.setForeground(Color.WHITE);
		lblProjectMembers.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblProjectMembers.setBounds(78, 228, 307, 63);
		body.add(lblProjectMembers);
		
		JLabel lblChinmayaShewis = new JLabel("CHINMAYA SH ");
		lblChinmayaShewis.setForeground(Color.WHITE);
		lblChinmayaShewis.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblChinmayaShewis.setBounds(503, 309, 225, 63);
		body.add(lblChinmayaShewis);
		
		JLabel lblAboutTheProject = new JLabel("ABOUT");
		lblAboutTheProject.setForeground(Color.WHITE);
		lblAboutTheProject.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblAboutTheProject.setBounds(865, 30, 150, 63);
		body.add(lblAboutTheProject);
		
		JLabel lblMavinderSinghNamdhari = new JLabel("MAVINDER SINGH NAMDHARI");
		lblMavinderSinghNamdhari.setForeground(Color.WHITE);
		lblMavinderSinghNamdhari.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblMavinderSinghNamdhari.setBounds(820, 309, 448, 63);
		body.add(lblMavinderSinghNamdhari);
		
		JLabel lblFrontEnd = new JLabel("FRONT END : ");
		lblFrontEnd.setForeground(Color.WHITE);
		lblFrontEnd.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblFrontEnd.setBounds(78, 587, 295, 63);
		body.add(lblFrontEnd);
		
		JLabel lblJavaeclipseIde = new JLabel("JAVA (ECLIPSE IDE)");
		lblJavaeclipseIde.setForeground(Color.WHITE);
		lblJavaeclipseIde.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblJavaeclipseIde.setBounds(453, 587, 295, 63);
		body.add(lblJavaeclipseIde);
		
		JLabel lblBackEnd = new JLabel("BACK END : ");
		lblBackEnd.setForeground(Color.WHITE);
		lblBackEnd.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblBackEnd.setBounds(78, 651, 295, 63);
		body.add(lblBackEnd);
		
		JLabel lblSqlmysqlWorkbench = new JLabel("SQL (MYSQL WORKBENCH)");
		lblSqlmysqlWorkbench.setForeground(Color.WHITE);
		lblSqlmysqlWorkbench.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblSqlmysqlWorkbench.setBounds(453, 651, 401, 63);
		body.add(lblSqlmysqlWorkbench);
		
		JLabel chinmaya = new JLabel("");
		chinmaya.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\chinmaya.jpeg"));
		chinmaya.setBounds(527, 148, 149, 167);
		body.add(chinmaya);
		
		JLabel lblSource = new JLabel("ASSIST:");
		lblSource.setForeground(Color.WHITE);
		lblSource.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblSource.setBounds(78, 717, 207, 63);
		body.add(lblSource);
		
		JLabel lblYoutubeGeeksFor = new JLabel("YOUTUBE, GEEKSFORGEEKS, STACK OVERFLOW ");
		lblYoutubeGeeksFor.setForeground(Color.WHITE);
		lblYoutubeGeeksFor.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblYoutubeGeeksFor.setBounds(453, 717, 750, 63);
		body.add(lblYoutubeGeeksFor);
		
		JLabel lblewis = new JLabel("(1EW15IS019)");
		lblewis.setForeground(Color.WHITE);
		lblewis.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblewis.setBounds(513, 359, 195, 43);
		body.add(lblewis);
		
		JLabel lblewis_1 = new JLabel("(1EW16IS046)");
		lblewis_1.setForeground(Color.WHITE);
		lblewis_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblewis_1.setBounds(935, 359, 195, 43);
		body.add(lblewis_1);
		
		JLabel mavinder = new JLabel("");
		mavinder.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\singh.jpg"));
		mavinder.setBounds(963, 148, 149, 167);
		body.add(mavinder);
		
		JLabel lblClass = new JLabel("CLASS  : ");
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblClass.setBounds(78, 434, 295, 63);
		body.add(lblClass);
		
		JLabel lblVSem = new JLabel("V SEM");
		lblVSem.setForeground(Color.WHITE);
		lblVSem.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblVSem.setBounds(453, 434, 295, 63);
		body.add(lblVSem);
		
		JLabel lblProjectGuide = new JLabel("PROJECT GUIDE :");
		lblProjectGuide.setForeground(Color.WHITE);
		lblProjectGuide.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblProjectGuide.setBounds(78, 496, 295, 63);
		body.add(lblProjectGuide);
		
		JLabel lblHemanthKumarSir = new JLabel("HEMANTH KUMAR K");
		lblHemanthKumarSir.setForeground(Color.WHITE);
		lblHemanthKumarSir.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblHemanthKumarSir.setBounds(453, 496, 352, 63);
		body.add(lblHemanthKumarSir);
		
		JLabel lblAsstProfDept = new JLabel("Asst. Prof, Dept of ISE");
		lblAsstProfDept.setForeground(Color.WHITE);
		lblAsstProfDept.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAsstProfDept.setBounds(513, 533, 195, 43);
		body.add(lblAsstProfDept);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				index ind = new index();
				ind.indexStart();
				frame.dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(1724, 743, 116, 44);
		body.add(btnBack);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(Color.DARK_GRAY);
		header.setBounds(14, 23, 1880, 163);
		frame.getContentPane().add(header);
		
		JPanel mwtitle = new JPanel();
		mwtitle.setLayout(null);
		mwtitle.setForeground(Color.WHITE);
		mwtitle.setBackground(Color.BLACK);
		mwtitle.setBounds(726, 7, 649, 151);
		header.add(mwtitle);
		
		JLabel label = new JLabel("MACHINE WORKS");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		label.setBounds(20, 11, 605, 72);
		mwtitle.add(label);
		
		JLabel lblWhereAllThe = new JLabel("Where all the WORK is done by MACHINE");
		lblWhereAllThe.setForeground(Color.ORANGE);
		lblWhereAllThe.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblWhereAllThe.setBounds(38, 94, 581, 48);
		mwtitle.add(lblWhereAllThe);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		label_1.setBounds(574, 7, 151, 151);
		header.add(label_1);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}