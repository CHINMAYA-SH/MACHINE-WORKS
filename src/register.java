import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

import java.awt.Panel;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class register {

	private JFrame frame;
	private JTextField fname;
	private JTextField lname;
	private JTextField mobile;
	private JTextField email;
	private JTextField cmpname;
	private JTextField gstno;
	private JComboBox genderBox;
	
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }

	// Variable to keep the count of records
			public static int Did_count = 0;
			private JTextField gndr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void rgStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 201, 1880, 818);
		frame.getContentPane().add(panel_2);
		
		Panel base = new Panel();
		base.setBackground(Color.DARK_GRAY);
		base.setBounds(0, 10, 1880, 798);
		panel_2.add(base);
		base.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		lblRegister.setBounds(828, 203, 197, 46);
		base.add(lblRegister);
		
		JLabel lblName = new JLabel("FIRST NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblName.setBounds(734, 319, 126, 22);
		base.add(lblName);
		
		JLabel lblPhoneNo = new JLabel("LAST NAME");
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPhoneNo.setBounds(734, 369, 126, 22);
		base.add(lblPhoneNo);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setForeground(Color.WHITE);
		lblMobileNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblMobileNo.setBounds(734, 419, 126, 22);
		base.add(lblMobileNo);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblGender.setBounds(734, 519, 126, 22);
		base.add(lblGender);
		
		JLabel lblEmailId = new JLabel("EMAIL ID");
		lblEmailId.setForeground(Color.WHITE);
		lblEmailId.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblEmailId.setBounds(734, 469, 126, 22);
		base.add(lblEmailId);
		
		JLabel lblGstNumber = new JLabel("COMPANY ");
		lblGstNumber.setForeground(Color.WHITE);
		lblGstNumber.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblGstNumber.setBounds(734, 569, 126, 22);
		base.add(lblGstNumber);
		
		JLabel lblAccountNo = new JLabel("GST NUMBER");
		lblAccountNo.setForeground(Color.WHITE);
		lblAccountNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblAccountNo.setBounds(734, 619, 126, 22);
		base.add(lblAccountNo);
		
		fname = new JTextField();
		fname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fname.setBounds(960, 321, 200, 22);
		base.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lname.setColumns(10);
		lname.setBounds(960, 372, 200, 22);
		base.add(lname);
		
		mobile = new JTextField();
		mobile.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mobile.setColumns(10);
		mobile.setBounds(960, 419, 200, 22);
		base.add(mobile);
		
		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(960, 469, 200, 22);
		base.add(email);
		
		cmpname = new JTextField();
		cmpname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cmpname.setColumns(10);
		cmpname.setBounds(960, 572, 200, 22);
		base.add(cmpname);
		
		gstno = new JTextField();
		gstno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gstno.setColumns(10);
		gstno.setBounds(960, 622, 200, 22);
		base.add(gstno);
		
		JButton btnreg = new JButton("REGISTER");
		btnreg.addActionListener(new ActionListener() {

			

				public void actionPerformed(ActionEvent e) 
			{
				String male1 = "male";
				String female1 = "female";
				String others1 = "others";
				String Fname=fname.getText();
				String Lname=lname.getText();
				String mob= mobile.getText();
				String eid=email.getText();
				String gender =gndr.getText();
				String company=cmpname.getText();
				String gst=gstno.getText();
				Connection con;
				PreparedStatement insert;
				
				if(Fname.isEmpty()||Lname.isEmpty()||mob.isEmpty()||eid.isEmpty()|| gender.isEmpty()||company.isEmpty()||gst.isEmpty()) 
					{
						JOptionPane.showMessageDialog(null,"no field must be left empty","registration error", JOptionPane.ERROR_MESSAGE);
						return;
					}
				if(mob.length()<10)	
					{
							JOptionPane.showMessageDialog(null,"enter 10 digits","mobile number error", JOptionPane.ERROR_MESSAGE);
							return;
					}
				if(gst.length()<15)	
				{
						JOptionPane.showMessageDialog(null,"enter 15 digits","gst number error", JOptionPane.ERROR_MESSAGE);
						return;
				}
				if(! (gender.equals(female1) || gender.equals(male1) || gender.equals(others1) ))
					{
					JOptionPane.showMessageDialog(null,"gender is wrong");
					return;
					}		
			
				if(isValid(eid))
				{
					JOptionPane.showMessageDialog(null, " Registered!!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"enter proper email id");
					return;
				}
		
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
				insert = con.prepareStatement("insert into register (fname,lname,mobile,email,gender,company,gstno) values (?,?,?,?,?,?,?)");
	            insert.setString(1, Fname);
	            insert.setString(2, Lname);
	            insert.setString(3, mob);
	            insert.setString(4, eid);
	            insert.setString(5, gender);
	            insert.setString(6, company);
	            insert.setString(7, gst);
	            int retCnt = insert.executeUpdate();
	            System.out.println(retCnt);
				
	            customer cr = new customer();
	            cr.csStart();
	            frame.dispose();

				
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
				
	});
	
		btnreg.setForeground(Color.WHITE);
		btnreg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnreg.setBackground(Color.BLACK);
		btnreg.setBounds(1169, 712, 116, 44);
		base.add(btnreg);
		
		Panel menuPanel = new Panel();
		menuPanel.setLayout(null);
		menuPanel.setBackground(Color.BLACK);
		menuPanel.setBounds(0, 20, 1880, 67);
		base.add(menuPanel);
		
		JButton button = new JButton("CUSTOMER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 customer cr = new customer();
		         cr.csStart();
		         frame.dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(1257, 11, 613, 44);
		menuPanel.add(button);
		
		JButton btnInvoice = new JButton("INVOICE");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminInvoice inv= new adminInvoice();
				inv. adminInvoiceStart();
				frame.dispose();
			}
		});
		btnInvoice.setForeground(Color.WHITE);
		btnInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnInvoice.setBackground(Color.BLACK);
		btnInvoice.setBounds(633, 11, 613, 44);
		menuPanel.add(btnInvoice);
		
		JButton button_2 = new JButton("PRODUCTS");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminproducts prd = new adminproducts();
				prd.adminPrd();
				frame.dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(10, 11, 613, 44);
		menuPanel.add(button_2);
		
		gndr = new JTextField();
		gndr.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gndr.setColumns(10);
		gndr.setBounds(960, 522, 200, 22);
		base.add(gndr);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 27, 1884, 163);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(209, 7, 649, 151);
		panel.add(panel_1);
		
		
		
		JLabel label = new JLabel("MACHINE WORKS");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		label.setBounds(20, 11, 605, 72);
		panel_1.add(label);
		
		JLabel lblWhereAllThe = new JLabel("Where all the WORK is done by MACHINE");
		lblWhereAllThe.setForeground(Color.ORANGE);
		lblWhereAllThe.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblWhereAllThe.setBounds(38, 92, 581, 48);
		panel_1.add(lblWhereAllThe);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Logged out Successfull !!");
				index ind = new index();
				ind.indexStart();
				frame.dispose();
			}
			
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(1674, 60, 116, 44);
		panel.add(btnLogout);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		label_1.setBounds(60, 7, 151, 151);
		panel.add(label_1);
		
		JButton btnTodo = new JButton("TO-DO");
		btnTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				appointments ap = new appointments();
				ap.appointmentList();
				frame.dispose();
			}
		});
		btnTodo.setForeground(Color.WHITE);
		btnTodo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTodo.setBackground(Color.BLACK);
		btnTodo.setBounds(1475, 60, 125, 44);
		panel.add(btnTodo);
		
		
		
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void register() {
		// TODO Auto-generated method stub
		
	}
}
