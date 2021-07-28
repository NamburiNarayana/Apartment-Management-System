package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField flatno;
	private JTextField name;
	private JTextField amounttopay;
	private JTextField amountpaid;
	private JTextField amountafterpay;
	private int a;
	private String n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFlatNo = new JLabel("Flat no");
		lblFlatNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFlatNo.setBounds(12, 52, 86, 35);
		contentPane.add(lblFlatNo);
		
		flatno = new JTextField();
		flatno.setColumns(10);
		flatno.setBounds(189, 62, 107, 22);
		contentPane.add(flatno);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmember add = new addmember();
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
					a=part.amount;
					n=part.getname();
					name.setText(n);
					amounttopay.setText(Integer.toString(a));
					
					}
					
				}
			}
			
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnOk.setBounds(332, 59, 97, 25);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(143, 52, 8, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblenterFlatNumber = new JLabel("*Enter flat number to pay the bill of the flat*");
		lblenterFlatNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblenterFlatNumber.setForeground(Color.RED);
		lblenterFlatNumber.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblenterFlatNumber.setBounds(0, 0, 608, 42);
		contentPane.add(lblenterFlatNumber);
		
		JLabel lblAmount = new JLabel("Amount  To pay");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAmount.setBounds(12, 180, 284, 35);
		contentPane.add(lblAmount);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblName.setBounds(12, 113, 86, 35);
		contentPane.add(lblName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(143, 113, 8, 35);
		contentPane.add(lblNewLabel_1_1_1);
		
		name = new JTextField();
		name.setEditable(false);
		name.setColumns(10);
		name.setBounds(189, 117, 431, 35);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(361, 180, 18, 35);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		amounttopay = new JTextField();
		amounttopay.setEditable(false);
		amounttopay.setColumns(10);
		amounttopay.setBounds(391, 184, 65, 35);
		contentPane.add(amounttopay);
		
		JLabel lblAmountPaidIn = new JLabel("Amount paid in that month");
		lblAmountPaidIn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAmountPaidIn.setBounds(12, 253, 303, 35);
		contentPane.add(lblAmountPaidIn);
		
		amountpaid = new JTextField();
		amountpaid.setColumns(10);
		amountpaid.setBounds(391, 257, 65, 35);
		contentPane.add(amountpaid);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1.setBounds(361, 253, 18, 35);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmember add = new addmember();
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
				int amountgiven;
				amountgiven=Integer.parseInt(amountpaid.getText());
				
				amountafterpay.setText(Integer.toString((a-amountgiven)));
				part.amount=a-amountgiven;
				part.x=false;
				editservices edit = new editservices();
					}
				}
							}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpdate.setBounds(211, 319, 133, 25);
		contentPane.add(btnUpdate);
		
		JLabel lblAmountToPay = new JLabel("Amount To pay");
		lblAmountToPay.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAmountToPay.setBounds(12, 357, 303, 35);
		contentPane.add(lblAmountToPay);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel(":");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1_1.setBounds(361, 357, 18, 35);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		amountafterpay = new JTextField();
		amountafterpay.setEditable(false);
		amountafterpay.setColumns(10);
		amountafterpay.setBounds(391, 357, 65, 35);
		contentPane.add(amountafterpay);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				menuofadmin menu = new menuofadmin();
				menu.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMenu.setBounds(28, 426, 123, 38);
		contentPane.add(btnMenu);
	}
}
