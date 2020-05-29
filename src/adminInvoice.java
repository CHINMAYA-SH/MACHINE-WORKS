import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.sql.*;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
public class adminInvoice {

	private JFrame frame;
	private JTable invoice;
	private JTextField quantity;
	private JTextField machineName;
	private JTextField machineType;
	private JTextField customerName;
	private JTextField price;
	private JTextField gst;
	private JTextField date;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminInvoice window = new adminInvoice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void adminInvoiceStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminInvoice window = new adminInvoice();
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
	 
	 public static boolean validateJavaDate(String strDate)
	   {
		/* Check if date is 'null' */
		if (strDate.trim().equals(""))
		{
		    return true;
		}
		/* Date is not 'null' */
		else
		{
		    /*
		     * Set preferred date format,
		     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
		    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
		    sdfrmt.setLenient(false);
		    /* Create Date object
		     * parse the string into date 
	             */
		    try
		    {
		        Date javaDate = sdfrmt.parse(strDate); 
		        System.out.println(strDate+" is valid date format");
		    }
		    /* Date format is invalid */
		    catch (ParseException e)
		    {
		        System.out.println(strDate+" is Invalid Date format");
		        return false;
		    }
		    /* Return true if date format is valid */
		    return true;
		}
	   }
	  
	
	
	public adminInvoice() {
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
		
		JPanel slnoTxt = new JPanel();
		slnoTxt.setLayout(null);
		slnoTxt.setBackground(Color.DARK_GRAY);
		slnoTxt.setBounds(14, 200, 1880, 809);
		frame.getContentPane().add(slnoTxt);
		
		
		JLabel lblTypesOfMachine = new JLabel("MACHINE NAME");
		lblTypesOfMachine.setHorizontalAlignment(SwingConstants.LEFT);
		lblTypesOfMachine.setVerticalAlignment(SwingConstants.TOP);
		lblTypesOfMachine.setForeground(Color.WHITE);
		lblTypesOfMachine.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblTypesOfMachine.setBounds(69, 350, 178, 30);
		slnoTxt.add(lblTypesOfMachine);
		
		
		JLabel lblProducts = new JLabel("PRODUCTS");
		lblProducts.setForeground(Color.WHITE);
		lblProducts.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblProducts.setBounds(69, 117, 178, 48);
		slnoTxt.add(lblProducts);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setVerticalAlignment(SwingConstants.TOP);
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblQuantity.setBounds(69, 400, 178, 30);
		slnoTxt.add(lblQuantity);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 30, 1880, 67);
		slnoTxt.add(panel);
		
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
		panel.add(bilbtn);
		
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
		panel.add(prdbtn);
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME");
		lblCustomerName.setVerticalAlignment(SwingConstants.TOP);
		lblCustomerName.setHorizontalAlignment(SwingConstants.LEFT);
		lblCustomerName.setForeground(Color.WHITE);
		lblCustomerName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblCustomerName.setBounds(69, 250, 178, 30);
		slnoTxt.add(lblCustomerName);
		
		JLabel lblMachineType = new JLabel("MACHINE TYPE");
		lblMachineType.setVerticalAlignment(SwingConstants.TOP);
		lblMachineType.setHorizontalAlignment(SwingConstants.LEFT);
		lblMachineType.setForeground(Color.WHITE);
		lblMachineType.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblMachineType.setBounds(69, 300, 178, 30);
		slnoTxt.add(lblMachineType);
		
		
		JButton btnStore = new JButton("STORE");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dateEntry=date.getText();
				String cusname= customerName.getText();	
				String machType=machineType.getText();
				String machName=machineName.getText();
				String quan=quantity.getText();
				String cost=price.getText();
				String gstno=gst.getText();
				Connection con;
				PreparedStatement insert;
				
				if(dateEntry.isEmpty()||cusname.isEmpty()||machName.isEmpty()||machType.isEmpty()||quan.isEmpty()||cost.isEmpty()||gstno.isEmpty()) 
				{
					JOptionPane.showMessageDialog(null,"no field must be left empty","registration error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(!validateJavaDate(dateEntry))
				{
					JOptionPane.showMessageDialog(null, "Date format must be MM/DD/YYYY");
					return;
				}
					
	
				else
				{
					JOptionPane.showMessageDialog(null, " Registered!!");
				}
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
					insert = con.prepareStatement("insert into invoice (date,cusname,machType,machName,quan,cost,gstno) values (?,?,?,?,?,?,?)");
		            insert.setString(1, dateEntry);
		            insert.setString(2, cusname);
		            insert.setString(3, machType);
		            insert.setString(4, machName);
		            insert.setString(5, quan);
		            insert.setString(6, cost);
		            insert.setString(7, gstno);
		            int retCnt = insert.executeUpdate();
		            System.out.println(retCnt);        
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
				
			}
		});
		btnStore.setForeground(Color.WHITE);
		btnStore.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnStore.setBackground(Color.BLACK);
		btnStore.setBounds(580, 578, 116, 44);
		slnoTxt.add(btnStore);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(1000, 230, 613, 267);
		slnoTxt.add(scrollPane);
		
		invoice = new JTable();
		scrollPane.setViewportView(invoice);
		
		JLabel lblInvoice = new JLabel("SALES");
		lblInvoice.setForeground(Color.WHITE);
		lblInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInvoice.setBounds(1010, 117, 314, 48);
		slnoTxt.add(lblInvoice);
		
		quantity = new JTextField();
		quantity.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		quantity.setColumns(10);
		quantity.setBounds(279, 400, 289, 30);
		slnoTxt.add(quantity);
		
		machineName = new JTextField();
		machineName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		machineName.setColumns(10);
		machineName.setBounds(279, 300, 289, 30);
		slnoTxt.add(machineName);
		
		machineType = new JTextField();
		machineType.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		machineType.setColumns(10);
		machineType.setBounds(279, 350, 289, 30);
		slnoTxt.add(machineType);
		
		customerName = new JTextField();
		customerName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		customerName.setColumns(10);
		customerName.setBounds(279, 250, 289, 30);
		slnoTxt.add(customerName);
		
		JLabel priceLbl = new JLabel("PRICE");
		priceLbl.setVerticalAlignment(SwingConstants.TOP);
		priceLbl.setHorizontalAlignment(SwingConstants.LEFT);
		priceLbl.setForeground(Color.WHITE);
		priceLbl.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		priceLbl.setBounds(69, 450, 178, 30);
		slnoTxt.add(priceLbl);
		
		price = new JTextField();
		price.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		price.setColumns(10);
		price.setBounds(279, 450, 289, 30);
		slnoTxt.add(price);
		
		JLabel lblGstNo = new JLabel("GST NO");
		lblGstNo.setVerticalAlignment(SwingConstants.TOP);
		lblGstNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblGstNo.setForeground(Color.WHITE);
		lblGstNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblGstNo.setBounds(69, 500, 178, 30);
		slnoTxt.add(lblGstNo);
		
		gst = new JTextField();
		gst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gst.setColumns(10);
		gst.setBounds(279, 500, 289, 30);
		slnoTxt.add(gst);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setVerticalAlignment(SwingConstants.TOP);
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDate.setBounds(69, 200, 178, 30);
		slnoTxt.add(lblDate);
		
		date = new JTextField();
		date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		date.setColumns(10);
		date.setBounds(279, 200, 289, 30);
		slnoTxt.add(date);
		
		JButton button = new JButton("GENERATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Connection con = null;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
		            String query="select * from invoice ";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					invoice.setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(1584, 578, 116, 44);
		slnoTxt.add(button);
		
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
		lblWhereAllThe.setBounds(38, 94, 581, 48);
		mwtitle.add(lblWhereAllThe);
		
		JLabel logolbl = new JLabel("");
		logolbl.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		logolbl.setBounds(58, 7, 151, 151);
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
		
		JButton btnAppointment = new JButton("TO - DO");
		btnAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				appointments ap = new appointments();
				ap.appointmentList();
				frame.dispose();
			}
		});
		btnAppointment.setForeground(Color.WHITE);
		btnAppointment.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAppointment.setBackground(Color.BLACK);
		btnAppointment.setBounds(1290, 60, 125, 44);
		header.add(btnAppointment);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}