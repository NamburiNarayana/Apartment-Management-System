package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveCoustomer extends JFrame {

	private JPanel contentPane;
	private JTextField flatno;
	private JTextField name;
	private JTextField contactno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveCoustomer frame = new RemoveCoustomer();
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
	public RemoveCoustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFlatNo = new JLabel("Flat no");
		lblFlatNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFlatNo.setBounds(12, 43, 86, 35);
		contentPane.add(lblFlatNo);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(129, 43, 8, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblEnterFlatNo = new JLabel("*Enter flat number to remove the flat user*");
		lblEnterFlatNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterFlatNo.setForeground(Color.RED);
		lblEnterFlatNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEnterFlatNo.setBounds(0, 0, 689, 42);
		contentPane.add(lblEnterFlatNo);
		
		flatno = new JTextField();
		flatno.setColumns(10);
		flatno.setBounds(181, 53, 107, 22);
		contentPane.add(flatno);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmember add = new addmember();
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
					name.setText(part.getname());
					contactno.setText(part.getcontactno());
					}
				}
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnOk.setBounds(320, 53, 97, 25);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(12, 112, 107, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(141, 112, 8, 35);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(193, 122, 484, 22);
		contentPane.add(name);
		
		contactno = new JTextField();
		contactno.setColumns(10);
		contactno.setBounds(193, 170, 484, 22);
		contentPane.add(contactno);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(141, 160, 8, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblContactNo = new JLabel("Contact no");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblContactNo.setBounds(12, 160, 120, 35);
		contentPane.add(lblContactNo);
		
		JCheckBox confirmation = new JCheckBox("are you sure that you want to remove the participant");
		confirmation.setForeground(new Color(0, 0, 255));
		confirmation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		confirmation.setBounds(12, 229, 639, 25);
		contentPane.add(confirmation);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addmember add = new addmember();
				if(confirmation.isSelected()) {
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
					add.appartmentdetails.remove(part);
					}
									}
			}
				
					else
					{
						JOptionPane.showMessageDialog(null,
								"Please check the box if you want to remove the coustomer ");
					}

				
				
				
			}
		});
		btnRemove.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRemove.setBounds(302, 276, 145, 50);
		contentPane.add(btnRemove);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				menuofadmin menu = new menuofadmin();
				menu.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMenu.setBounds(12, 360, 137, 42);
		contentPane.add(btnMenu);
	}
}
