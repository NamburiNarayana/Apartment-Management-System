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
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(91, 122, 110, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password   :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(91, 213, 110, 33);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setForeground(Color.BLACK);
		username.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		username.setColumns(10);
		username.setBounds(252, 120, 329, 45);
		contentPane.add(username);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String user = username.getText();
				String psd = passwordField.getText();
				if (user.contentEquals("narayana") && psd.equals("narayana")) {
					
					JOptionPane.showMessageDialog(null, "successfuuly loged in");
					dispose();
					menuofadmin menu = new menuofadmin();
					menu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "sorry you have entered wrong username or password");

				}

			
			}
		});
		btnNewButton.setBounds(192, 300, 135, 25);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 208, 329, 45);
		contentPane.add(passwordField);
		
		JLabel lblLoginToEnter = new JLabel("LOGIN TO ENTER YOUR ESTATE");
		lblLoginToEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginToEnter.setForeground(Color.RED);
		lblLoginToEnter.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLoginToEnter.setBounds(0, 13, 610, 40);
		contentPane.add(lblLoginToEnter);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainPage main = new MainPage();
				main.setVisible(true);
			}
		});
		btnMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnMainMenu.setBounds(0, 382, 148, 25);
		contentPane.add(btnMainMenu);
	}
}
