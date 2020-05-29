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

public class adminproducts {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminproducts window = new adminproducts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void adminPrd() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminproducts window = new adminproducts();
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
	public adminproducts() {
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
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 20, 1880, 67);
		body.add(panel_3);
		panel_3.setLayout(null);
		
		JButton cusbtn = new JButton("CUSTOMER");
		cusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 customer cr = new customer();
		         cr.csStart();
		         frame.dispose();
			}
		});
		cusbtn.setForeground(Color.WHITE);
		cusbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cusbtn.setBackground(Color.BLACK);
		cusbtn.setBounds(1257, 11, 613, 44);
		panel_3.add(cusbtn);
		
		JButton bilbtn = new JButton("INVOICE");
		bilbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminInvoice inv= new adminInvoice();
				inv. adminInvoiceStart();
				frame.dispose();


			}
		});
		bilbtn.setForeground(Color.WHITE);
		bilbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bilbtn.setBackground(Color.BLACK);
		bilbtn.setBounds(633, 11, 613, 44);
		panel_3.add(bilbtn);
		
		JButton prdbtn = new JButton("PRODUCTS");
		prdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminproducts prd = new adminproducts();
				prd.adminPrd();
				frame.dispose();
			}
		});
		prdbtn.setForeground(Color.WHITE);
		prdbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		prdbtn.setBackground(Color.BLACK);
		prdbtn.setBounds(10, 11, 613, 44);
		panel_3.add(prdbtn);
		
		JButton btnSolidwoodbtn = new JButton("PANEL MACHINE");
		btnSolidwoodbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				panelmachine pm = new panelmachine();
				pm.panel_machine();
				frame.dispose();
			}
		});
		btnSolidwoodbtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSolidwoodbtn.setBounds(1260, 441, 300, 85);
		body.add(btnSolidwoodbtn);
		
		JButton button = new JButton("SOLIDWOOD WORKS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				solidwoodworks sww = new solidwoodworks();
				sww.solid_wood();
				frame.dispose();
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button.setBounds(320, 441, 300, 85);
		body.add(button);
		
		JLabel lblTheseAreThe = new JLabel("THESE ARE THE TWO TYPES OF PRODUCTS AVAILABLE");
		lblTheseAreThe.setForeground(Color.WHITE);
		lblTheseAreThe.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblTheseAreThe.setBounds(289, 112, 1419, 72);
		body.add(lblTheseAreThe);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(Color.DARK_GRAY);
		header.setBounds(14, 25, 1880, 163);
		frame.getContentPane().add(header);
		
		JPanel mwtitle = new JPanel();
		mwtitle.setLayout(null);
		mwtitle.setForeground(Color.WHITE);
		mwtitle.setBackground(Color.BLACK);
		mwtitle.setBounds(209, 7, 649, 151);
		header.add(mwtitle);
		
		JLabel label = new JLabel("MACHINE WORKS");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		label.setBounds(20, 11, 605, 72);
		mwtitle.add(label);
		
		JLabel label_1 = new JLabel("Where all the WORKS are done by MACHINE");
		label_1.setForeground(Color.ORANGE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_1.setBounds(30, 94, 581, 48);
		mwtitle.add(label_1);
		
		JButton lgbtn = new JButton("LOGOUT");
		lgbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Logged out Successfull !!");
				index ind = new index();
				ind.indexStart();
				frame.dispose();
			}
		});
		lgbtn.setForeground(Color.WHITE);
		lgbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lgbtn.setBackground(Color.BLACK);
		lgbtn.setBounds(1674, 60, 116, 44);
		header.add(lgbtn);
		
		JButton signupBtn = new JButton("SIGN UP");
		signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				signup sg = new signup();
				sg.signupStart();
				frame.dispose();
			}
		});
		signupBtn.setForeground(Color.WHITE);
		signupBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		signupBtn.setBackground(Color.BLACK);
		signupBtn.setBounds(1488, 60, 116, 44);
		header.add(signupBtn);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		label_2.setBounds(59, 7, 151, 151);
		header.add(label_2);
		
		JButton button_1 = new JButton("TO-DO");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				appointments ap = new appointments();
				ap.appointmentList();
				frame.dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(1303, 60, 125, 44);
		header.add(button_1);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}