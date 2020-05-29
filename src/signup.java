import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;


import java.sql.*;
import java.util.regex.*;
public class signup {

	private JFrame frame;
	private JPasswordField password;
	private JTextField username;
	private JPasswordField confirmpassword;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void signupStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
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
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\download.png"));
		logo.setBounds(210, 39, 225, 224);
		header.add(logo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(1157, 11, 737, 347);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel unamelbl = new JLabel("USERNAME");
		unamelbl.setForeground(Color.WHITE);
		unamelbl.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		unamelbl.setBounds(56, 120, 171, 30);
		panel.add(unamelbl);
		
		JLabel pswdlbl = new JLabel("PASSWORD");
		pswdlbl.setForeground(Color.WHITE);
		pswdlbl.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		pswdlbl.setBounds(56, 180, 171, 30);
		panel.add(pswdlbl);
		
		JButton signupBtn = new JButton("SIGNUP");
		signupBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				try
				{					
					Connection con;
					PreparedStatement insert;
					PreparedStatement comp;
					String Username=username.getText();
					String Password=password.getText();
					String Confirm =confirmpassword.getText();
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
					
					if(Username.isEmpty()&&Password.isEmpty()&&Confirm.isEmpty())
					{
						JOptionPane.showMessageDialog(null,"Empty fields" );
					}
					
					else if(!Password.equals(Confirm))
					{
						JOptionPane.showMessageDialog(null,"password do not match" );
						return;
					}
					else
					{	
						JOptionPane.showMessageDialog(null,"YOU WILL BE REDIRECTED TO LOGIN PAGE AFTER SIGNING UP" );			
						insert = con.prepareStatement("insert into login (username,password) values (?,?);");
						insert.setString(1, Username);
						insert.setString(2, Password);
						insert.executeUpdate();
						insert = con.prepareStatement("insert into signup (username,password) values (?,?);");
						insert.setString(1, Username);
						insert.setString(2, Password);
						insert.executeUpdate();		
						JOptionPane.showMessageDialog(null,"user added successfully" );
						index ind = new index();
						ind.indexStart();
						frame.dispose();				
					}
				}
			catch(Exception E)
			{
				E.printStackTrace();
			
			} 
		}
			
		});
		signupBtn.setForeground(Color.WHITE);
		signupBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		signupBtn.setBackground(Color.BLACK);
		signupBtn.setBounds(596, 284, 116, 44);
		panel.add(signupBtn);
		
		JLabel signupLbl = new JLabel("SIGNUP");
		signupLbl.setForeground(Color.WHITE);
		signupLbl.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		signupLbl.setBounds(320, 11, 99, 59);
		panel.add(signupLbl);
		
		password = new JPasswordField();
		password.setBounds(367, 180, 200, 30);
		panel.add(password);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(367, 120, 200, 30);
		panel.add(username);
		
		confirmpassword = new JPasswordField();
		confirmpassword.setBounds(367, 240, 200, 30);
		panel.add(confirmpassword);
		
		JLabel lblConfirmpassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmpassword.setForeground(Color.WHITE);
		lblConfirmpassword.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblConfirmpassword.setBounds(56, 240, 283, 30);
		panel.add(lblConfirmpassword);
		
		JButton backBtn = new JButton("BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,"you will be redirected at product page");
				adminproducts prd = new adminproducts();
				prd.adminPrd();
				frame.dispose();
			}
		});
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		backBtn.setBackground(Color.BLACK);
		backBtn.setBounds(457, 284, 116, 44);
		panel.add(backBtn);
	}
}
