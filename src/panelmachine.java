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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class panelmachine {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelmachine window = new panelmachine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void panel_machine() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelmachine window = new panelmachine();
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
	public panelmachine() {
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
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 10, 1880, 67);
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
		
		JLabel cncImg = new JLabel("");
		cncImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\cnc-router-pic-300x300.jpg"));
		cncImg.setBounds(38, 166, 300, 250);
		body.add(cncImg);
		
		JLabel cpImg = new JLabel("");
		cpImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\cold-press-pic-300x300.jpg"));
		cpImg.setBounds(414, 166, 300, 250);
		body.add(cpImg);
		
		JLabel dsImg = new JLabel("");
		dsImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\dimension-sawscorring-cutter245-TLT-300x300.jpg"));
		dsImg.setBounds(790, 166, 300, 250);
		body.add(dsImg);
		
		JLabel dcImg = new JLabel("");
		dcImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\dust-collectionr-large-300x300.jpg"));
		dcImg.setBounds(1166, 166, 300, 250);
		body.add(dcImg);
		
		JLabel ebmImg = new JLabel("");
		ebmImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\edge-banding-pic-300x300.jpg"));
		ebmImg.setBounds(1542, 166, 300, 250);
		body.add(ebmImg);
		
		JLabel label_6 = new JLabel("PANEL MACHINES");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		label_6.setBounds(760, 83, 360, 72);
		body.add(label_6);
		
		JLabel hpImg = new JLabel("");
		hpImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\hot-press-300x300.jpg"));
		hpImg.setBounds(48, 495, 300, 250);
		body.add(hpImg);
		
		JLabel mbImg = new JLabel("");
		mbImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\multiple-boring-machine-pic-300x300.jpg"));
		mbImg.setBounds(414, 495, 300, 250);
		body.add(mbImg);
		
		JLabel hp2Img = new JLabel("");
		hp2Img.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\pic01-300x300.jpg"));
		hp2Img.setBounds(790, 495, 300, 250);
		body.add(hp2Img);
		
		JLabel ptImg = new JLabel("");
		ptImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\profile-trimmer-large-300x300.jpg"));
		ptImg.setBounds(1542, 495, 300, 250);
		body.add(ptImg);
		
		JLabel cncLbl = new JLabel("CNC Router");
		cncLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cncLbl.setForeground(Color.WHITE);
		cncLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		cncLbl.setBounds(38, 427, 300, 50);
		body.add(cncLbl);
		
		JLabel pfLbl = new JLabel("Profile Trimmer");
		pfLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pfLbl.setForeground(Color.WHITE);
		pfLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		pfLbl.setBounds(1542, 756, 300, 50);
		body.add(pfLbl);
		
		JLabel dcLbl = new JLabel("Dust Collector");
		dcLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dcLbl.setForeground(Color.WHITE);
		dcLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		dcLbl.setBounds(1166, 427, 300, 50);
		body.add(dcLbl);
		
		JLabel dsLbl = new JLabel("Dimension Saw");
		dsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dsLbl.setForeground(Color.WHITE);
		dsLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		dsLbl.setBounds(790, 427, 300, 50);
		body.add(dsLbl);
		
		JLabel cpLbl = new JLabel("Cold Press");
		cpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cpLbl.setForeground(Color.WHITE);
		cpLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		cpLbl.setBounds(414, 427, 300, 50);
		body.add(cpLbl);
		
		JLabel lblEdgeBanding = new JLabel("Edge Banding Machine");
		lblEdgeBanding.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdgeBanding.setForeground(Color.WHITE);
		lblEdgeBanding.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblEdgeBanding.setBounds(1542, 427, 329, 50);
		body.add(lblEdgeBanding);
		
		JLabel lblHotPress = new JLabel("Hot Press");
		lblHotPress.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotPress.setForeground(Color.WHITE);
		lblHotPress.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblHotPress.setBounds(48, 756, 300, 50);
		body.add(lblHotPress);
		
		JLabel lblMultipleBoring = new JLabel("Multiple Boring");
		lblMultipleBoring.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultipleBoring.setForeground(Color.WHITE);
		lblMultipleBoring.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblMultipleBoring.setBounds(414, 756, 300, 50);
		body.add(lblMultipleBoring);
		
		JLabel lblPostFormingMachin = new JLabel("Post Forming Machine");
		lblPostFormingMachin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostFormingMachin.setForeground(Color.WHITE);
		lblPostFormingMachin.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblPostFormingMachin.setBounds(1176, 756, 300, 50);
		body.add(lblPostFormingMachin);
		
		JLabel lblHP = new JLabel("Hot Press");
		lblHP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHP.setForeground(Color.WHITE);
		lblHP.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblHP.setBounds(790, 756, 300, 50);
		body.add(lblHP);
		
		JLabel pfmImg = new JLabel("");
		pfmImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\panel machine\\post-forming-machine-pic-300x300.jpg"));
		pfmImg.setBounds(1166, 495, 300, 250);
		body.add(pfmImg);
		
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
		
		JButton button = new JButton("SIGN UP");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				signup sg = new signup();
				sg.signupStart();
				frame.dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(1488, 60, 116, 44);
		header.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\Pictures\\download.png"));
		label_1.setBounds(57, 7, 151, 151);
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
		btnTodo.setBounds(1293, 60, 125, 44);
		header.add(btnTodo);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}