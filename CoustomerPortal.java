package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class CoustomerPortal extends JFrame {

	private JPanel contentPane;
	private JTextField flatno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoustomerPortal frame = new CoustomerPortal();
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
	public CoustomerPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 619);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coustomer Portal");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 13, 535, 45);
		contentPane.add(lblNewLabel);
		
		flatno = new JTextField();
		flatno.setBounds(158, 71, 147, 28);
		contentPane.add(flatno);
		flatno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Flat no");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(22, 71, 84, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(122, 71, 15, 28);
		contentPane.add(lblNewLabel_1_1);
		
		TextArea coustomerdetails = new TextArea();
		coustomerdetails.setEditable(false);
		coustomerdetails.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		coustomerdetails.setBounds(0, 228, 535, 255);
		contentPane.add(coustomerdetails);
		
		JButton btnNewButton = new JButton("Check Status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmember add = new addmember();
				coustomerdetails.setText("");
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
						coustomerdetails.append("Name:-              "+part.getname()+"\n");
						coustomerdetails.append("Contact No:-      "+part.getcontactno()+"\n");
						coustomerdetails.append("Balance to pay:-"+part.amount+"\n");
					}
					
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(169, 141, 185, 45);
		contentPane.add(btnNewButton);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainPage main = new MainPage();
				main.setVisible(true);
			}
		});
		btnMenu.setForeground(Color.BLACK);
		btnMenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnMenu.setBackground(Color.WHITE);
		btnMenu.setBounds(0, 527, 173, 45);
		contentPane.add(btnMenu);
		
		
	}
}
