package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class menuofadmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuofadmin frame = new menuofadmin();
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
	public menuofadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				addmember add=new addmember();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(142, 143, 250, 74);
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editmembers edit=new editmembers();
				edit.setVisible(true);
				dispose();
			}
		});
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnEdit.setBounds(12, 248, 250, 74);
		contentPane.add(btnEdit);
		
		JButton btnServices = new JButton("Services");
		btnServices.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				editservices edit2=new editservices();
				edit2.setVisible(true);
				dispose();
			}
		});
		btnServices.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnServices.setBounds(12, 362, 250, 74);
		contentPane.add(btnServices);
		
		JButton btnStats = new JButton("Stats");
		btnStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				statistics stat=new statistics();
				stat.setVisible(true);
			}
		});
		btnStats.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnStats.setBounds(299, 362, 250, 74);
		contentPane.add(btnStats);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				lists list=new lists();
				list.setVisible(true);
			}
		});
		btnList.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnList.setBounds(299, 248, 250, 74);
		contentPane.add(btnList);
		
		JLabel lblAdmiPrompt = new JLabel("ADMIN PORTAL");
		lblAdmiPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmiPrompt.setForeground(Color.RED);
		lblAdmiPrompt.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblAdmiPrompt.setBounds(0, 13, 561, 74);
		contentPane.add(lblAdmiPrompt);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Billing bill = new Billing();
				bill.setVisible(true);
			}
		});
		btnBilling.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBilling.setBounds(12, 466, 250, 74);
		contentPane.add(btnBilling);
		
		JButton btnServices_2 = new JButton("Remove Coustomer");
		btnServices_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RemoveCoustomer remove = new RemoveCoustomer();
				remove.setVisible(true);
			}
		});
		btnServices_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnServices_2.setBounds(299, 466, 250, 74);
		contentPane.add(btnServices_2);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage main = new MainPage();
				main.setVisible(true);
			}
		});
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnLogOut.setBounds(142, 553, 250, 74);
		contentPane.add(btnLogOut);
		addmember add = new addmember();
		editservices edit = new editservices();
	}
}
