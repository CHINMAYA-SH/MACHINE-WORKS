import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import com.sun.net.httpserver.Authenticator.Result;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;

import java.sql.*;

public class index {

	private JFrame frame;
	private JPasswordField password;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void indexStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
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
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel lblDesignCopyrights = new JLabel("design copyrights \u00A9 chinmaya");
		lblDesignCopyrights.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDesignCopyrights.setForeground(Color.BLACK);
		lblDesignCopyrights.setBounds(1711, 1018, 183, 23);
		frame.getContentPane().add(lblDesignCopyrights);
		
		Panel header = new Panel();
		header.setForeground(Color.BLACK);
		header.setBackground(Color.BLACK);
		header.setBounds(0, 390, 1920, 300);
		frame.getContentPane().add(header);
		header.setLayout(null);
		
		JLabel mw = new JLabel("MACHINE WORKS");
		mw.setForeground(Color.WHITE);
		mw.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		mw.setBounds(468, 11, 866, 191);
		header.add(mw);
		
		JLabel label = new JLabel("Where all the WORK is done by MACHINE");
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		label.setBounds(537, 197, 718, 48);
		header.add(label);
		
		JButton hiddenbutton = new JButton("");
		hiddenbutton.setBackground(Color.BLACK);
		hiddenbutton.setForeground(Color.BLACK);
		hiddenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				about ab = new about();
				ab.aboutprj();
				frame.dispose();
			}
		});
		hiddenbutton.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\download.png"));
		hiddenbutton.setBounds(216, 48, 225, 224);
		header.add(hiddenbutton);
		
		JTextPane txtpnThisIsA = new JTextPane();
		txtpnThisIsA.setBackground(UIManager.getColor("Button.background"));
		txtpnThisIsA.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtpnThisIsA.setText(" This is a project made just for maintaining databases which is used to run the daily business.");
		txtpnThisIsA.setBounds(405, 714, 1111, 40);
		frame.getContentPane().add(txtpnThisIsA);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(1168, 30, 706, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel unamelbl = new JLabel("USERNAME");
		unamelbl.setForeground(Color.WHITE);
		unamelbl.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		unamelbl.setBounds(56, 121, 171, 30);
		panel.add(unamelbl);
		
		JLabel pswdlbl = new JLabel("PASSWORD");
		pswdlbl.setForeground(Color.WHITE);
		pswdlbl.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		pswdlbl.setBounds(56, 185, 171, 30);
		panel.add(pswdlbl);
		
		password = new JPasswordField();
		password.setBounds(264, 185, 200, 30);
		panel.add(password);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(264, 126, 200, 30);
		panel.add(username);
		
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
					Statement stmt = con.createStatement();
					String sql = "select * from login where username = '"+username.getText()+"' and password = '"+password.getText()+"'";	 
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"login successful" );
						adminproducts prd = new adminproducts();
						prd.adminPrd();
						frame.dispose();
					}
				
					else
					{
						JOptionPane.showMessageDialog(null,"login unsuccessful" );
					}
				}
				catch(Exception E)
				{
					E.printStackTrace();
				
				}
			}
				
			
				
				
			
		});
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		loginBtn.setBackground(Color.BLACK);
		loginBtn.setBounds(558, 254, 116, 44);
		panel.add(loginBtn);
		
		JLabel loginLbl = new JLabel("LOGIN");
		loginLbl.setForeground(Color.WHITE);
		loginLbl.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		loginLbl.setBounds(320, 11, 99, 59);
		panel.add(loginLbl);
	}
}
