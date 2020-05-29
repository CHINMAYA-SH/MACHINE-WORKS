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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import javax.swing.ScrollPaneConstants;

public class admincus {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admincus window = new admincus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void adminCus() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admincus window = new admincus();
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
	public admincus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDesignCopyrights = new JLabel("design copyrights \u00A9 chinmaya");
		lblDesignCopyrights.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDesignCopyrights.setForeground(new Color(255, 255, 224));
		lblDesignCopyrights.setBounds(1711, 1018, 183, 23);
		frame.getContentPane().add(lblDesignCopyrights);
		
		JPanel body = new JPanel();
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(10, 210, 1880, 809);
		frame.getContentPane().add(body);
		body.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 20, 1880, 67);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		body.add(panel);
		
		JButton cusbtn = new JButton("CUSTOMER");
		cusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				admincus cus = new admincus();
				cus.adminCus();
				frame.dispose();

			}
		});
		cusbtn.setForeground(Color.WHITE);
		cusbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cusbtn.setBackground(Color.BLACK);
		cusbtn.setBounds(1257, 11, 613, 44);
		panel.add(cusbtn);
		
		JButton prdbtn = new JButton("BILLINGS");
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
		lblCus.setBounds(780, 123, 320, 46);
		lblCus.setForeground(Color.WHITE);
		lblCus.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		body.add(lblCus);
		
		JButton btnLoadrefresh = new JButton("LOAD/REFRESH");
		btnLoadrefresh.setBounds(1674, 754, 184, 44);
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
		scrollPane.setBounds(20, 199, 1840, 544);
		body.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportView(scrollPane_1);
		
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
		button.setBounds(1497, 754, 116, 44);
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
		
		JLabel logolbl = new JLabel("");
		logolbl.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		logolbl.setBounds(59, -30, 225, 224);
		header.add(logolbl);
		
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
		lgbtn.setBounds(1724, 34, 116, 44);
		header.add(lgbtn);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}