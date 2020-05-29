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
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.sql.*;
import javax.swing.JScrollBar;


public class customer {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer window = new customer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void csStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer window = new customer();
					window.frame.setVisible(true);
				} 
				
				catch (Exception e) 
				
				{
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public customer() {
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
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(14, 210, 1880, 809);
		frame.getContentPane().add(body);
		body.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 30, 1880, 67);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		body.add(panel);
		
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
		panel.add(cusbtn);
		
		JButton prdbtn = new JButton("INVOICE");
		prdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminInvoice inv= new adminInvoice();
				inv. adminInvoiceStart();
				frame.dispose();
			}
		});
		prdbtn.setForeground(Color.WHITE);
		prdbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		prdbtn.setBackground(Color.BLACK);
		prdbtn.setBounds(633, 11, 613, 44);
		panel.add(prdbtn);
		
		JButton hmebtn = new JButton("PRODUCTS");
		hmebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				adminproducts prd = new adminproducts();
				prd.adminPrd();
				frame.dispose();
			}
		});
		hmebtn.setForeground(Color.WHITE);
		hmebtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		hmebtn.setBackground(Color.BLACK);
		hmebtn.setBounds(10, 11, 613, 44);
		panel.add(hmebtn);
		
		JLabel lblCus = new JLabel("CUSTOMER LIST");
		lblCus.setBounds(779, 123, 323, 46);
		lblCus.setForeground(Color.WHITE);
		lblCus.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		body.add(lblCus);
		
		JButton btnLoadrefresh = new JButton("LOAD/REFRESH");
		btnLoadrefresh.setBounds(1668, 754, 190, 44);
		btnLoadrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Connection con;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
					
					String query="select * from register";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			
			}
		});
		btnLoadrefresh.setForeground(Color.WHITE);
		btnLoadrefresh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLoadrefresh.setBackground(Color.BLACK);
		body.add(btnLoadrefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 199, 1820, 544);
		body.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1833, 230, 17, 513);
		body.add(scrollBar);
		
		JButton button = new JButton("REGISTER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				register rg = new register();
				rg.rgStart();
				frame.dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(1492, 754, 116, 44);
		body.add(button);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(Color.DARK_GRAY);
		header.setBounds(14, 23, 1880, 163);
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
		
		JLabel lblWhereAllThe = new JLabel("Where all the WORK is done by MACHINE");
		lblWhereAllThe.setForeground(Color.ORANGE);
		lblWhereAllThe.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblWhereAllThe.setBounds(38, 94, 561, 48);
		mwtitle.add(lblWhereAllThe);
		
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
		
		JButton button_1 = new JButton("SIGN UP");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				signup sg = new signup();
				sg.signupStart();
				frame.dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(1488, 60, 116, 44);
		header.add(button_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		label_1.setBounds(56, 7, 151, 151);
		header.add(label_1);
		
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
		btnTodo.setBounds(1294, 60, 125, 44);
		header.add(btnTodo);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}