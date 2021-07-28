package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setForeground(Color.RED);
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblWelcome.setBackground(SystemColor.menu);
		lblWelcome.setBounds(0, 0, 552, 48);
		contentPane.add(lblWelcome);
		
		JLabel lblTo = new JLabel("TO    ");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setForeground(Color.RED);
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTo.setBackground(SystemColor.menu);
		lblTo.setBounds(10, 35, 552, 45);
		contentPane.add(lblTo);
		
		JLabel lblNoble = new JLabel("NOBLE HEIGHTS");
		lblNoble.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoble.setForeground(Color.RED);
		lblNoble.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNoble.setBackground(SystemColor.menu);
		lblNoble.setBounds(0, 77, 552, 45);
		contentPane.add(lblNoble);
		
		JButton btnNewButton = new JButton("COUSTOMER PORTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CoustomerPortal coustomer=new CoustomerPortal();
				coustomer.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(0, 135, 274, 168);
		contentPane.add(btnNewButton);
		
		JButton btnAdminPortal = new JButton("ADMIN PORTAL");
		btnAdminPortal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LoginPage login = new LoginPage();
				login.setVisible(true);
			}
		});
		btnAdminPortal.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnAdminPortal.setBackground(Color.LIGHT_GRAY);
		btnAdminPortal.setBounds(272, 302, 268, 190);
		contentPane.add(btnAdminPortal);
	}

}
