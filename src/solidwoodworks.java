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

public class solidwoodworks {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					solidwoodworks window = new solidwoodworks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void solid_wood() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					solidwoodworks window = new solidwoodworks();
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
	public solidwoodworks() {
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
		slnoTxt.setBounds(14, 210, 1880, 809);
		frame.getContentPane().add(slnoTxt);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 10, 1880, 67);
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
		
		JLabel lblSolidWoodWorks = new JLabel("SOLIDWOOD WORKS");
		lblSolidWoodWorks.setForeground(Color.WHITE);
		lblSolidWoodWorks.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblSolidWoodWorks.setBounds(735, 69, 410, 72);
		slnoTxt.add(lblSolidWoodWorks);
		
		JLabel bsImg = new JLabel("");
		bsImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\band-saw-300x300.jpg"));
		bsImg.setBounds(38, 152, 300, 255);
		slnoTxt.add(bsImg);
		
		JLabel bsLbl = new JLabel("Band Saw");
		bsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		bsLbl.setForeground(Color.WHITE);
		bsLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		bsLbl.setBounds(38, 404, 300, 50);
		slnoTxt.add(bsLbl);
		
		JLabel bsmLbl = new JLabel("Belt Sander Machine");
		bsmLbl.setHorizontalAlignment(SwingConstants.CENTER);
		bsmLbl.setForeground(Color.WHITE);
		bsmLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		bsmLbl.setBounds(414, 404, 300, 50);
		slnoTxt.add(bsmLbl);
		
		JLabel bsmImg = new JLabel("");
		bsmImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\belt sander machine.jpg"));
		bsmImg.setHorizontalAlignment(SwingConstants.LEFT);
		bsmImg.setBounds(414, 152, 300, 255);
		slnoTxt.add(bsmImg);
		
		JLabel tpImg = new JLabel("");
		tpImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\big-multipurpose-wood-working-planner-300x300.jpg"));
		tpImg.setBounds(790, 152, 300, 255);
		slnoTxt.add(tpImg);
		
		JLabel tpLbl = new JLabel("Thickeness Planner");
		tpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tpLbl.setForeground(Color.WHITE);
		tpLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		tpLbl.setBounds(785, 404, 300, 50);
		slnoTxt.add(tpLbl);
		
		JLabel spLbl = new JLabel("Surface Planner");
		spLbl.setHorizontalAlignment(SwingConstants.CENTER);
		spLbl.setForeground(Color.WHITE);
		spLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		spLbl.setBounds(1166, 404, 300, 50);
		slnoTxt.add(spLbl);
		
		JLabel spImg = new JLabel("");
		spImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\surface-planner-300x300.jpg"));
		spImg.setBounds(1166, 152, 300, 255);
		slnoTxt.add(spImg);
		
		JLabel csLbl = new JLabel("Circular Saw");
		csLbl.setHorizontalAlignment(SwingConstants.CENTER);
		csLbl.setForeground(Color.WHITE);
		csLbl.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		csLbl.setBounds(1542, 404, 300, 50);
		slnoTxt.add(csLbl);
		
		JLabel csImg = new JLabel("");
		csImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\circular-saw-300x300.jpg"));
		csImg.setBounds(1542, 152, 300, 255);
		slnoTxt.add(csImg);
		
		JLabel feederImg = new JLabel("");
		feederImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\feeder-attachment-300x300.jpg"));
		feederImg.setBounds(38, 486, 300, 255);
		slnoTxt.add(feederImg);
		
		JLabel lblFeeder = new JLabel("Feeder ");
		lblFeeder.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeder.setForeground(Color.WHITE);
		lblFeeder.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblFeeder.setBounds(38, 748, 300, 50);
		slnoTxt.add(lblFeeder);
		
		JLabel lblRouterMachine = new JLabel("Router Machine");
		lblRouterMachine.setHorizontalAlignment(SwingConstants.CENTER);
		lblRouterMachine.setForeground(Color.WHITE);
		lblRouterMachine.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblRouterMachine.setBounds(414, 748, 300, 50);
		slnoTxt.add(lblRouterMachine);
		
		JLabel rmImg = new JLabel("");
		rmImg.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\router-machine-300x300.jpg"));
		rmImg.setHorizontalAlignment(SwingConstants.LEFT);
		rmImg.setBounds(414, 486, 300, 255);
		slnoTxt.add(rmImg);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\vertical-spindle-moulder-300x300.jpg"));
		label_15.setBounds(785, 486, 300, 255);
		slnoTxt.add(label_15);
		
		JLabel lblVerticalSpindle = new JLabel("Vertical Spindle Moulder");
		lblVerticalSpindle.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerticalSpindle.setForeground(Color.WHITE);
		lblVerticalSpindle.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblVerticalSpindle.setBounds(777, 748, 330, 50);
		slnoTxt.add(lblVerticalSpindle);
		
		JLabel lblChainChiselMortisel = new JLabel("Chain Chisel Mortisel");
		lblChainChiselMortisel.setHorizontalAlignment(SwingConstants.CENTER);
		lblChainChiselMortisel.setForeground(Color.WHITE);
		lblChainChiselMortisel.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblChainChiselMortisel.setBounds(1166, 748, 300, 50);
		slnoTxt.add(lblChainChiselMortisel);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\chain-chisel-mortisel-machine-300x300.jpg"));
		label_18.setBounds(1166, 486, 300, 255);
		slnoTxt.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\CHINMAYA SH\\eclipse-workspace\\Machine works\\src\\imgs\\solid wood working\\five-side-planning-moulding-300x300.jpg"));
		label_19.setBounds(1542, 486, 300, 255);
		slnoTxt.add(label_19);
		
		JLabel lblFiveSidePlanning = new JLabel("Five Side Planning");
		lblFiveSidePlanning.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiveSidePlanning.setForeground(Color.WHITE);
		lblFiveSidePlanning.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblFiveSidePlanning.setBounds(1542, 748, 300, 50);
		slnoTxt.add(lblFiveSidePlanning);
		
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
		label_1.setBounds(59, 7, 151, 151);
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
		btnTodo.setBounds(1303, 60, 125, 44);
		header.add(btnTodo);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1920	, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}