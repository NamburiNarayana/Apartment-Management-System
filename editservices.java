package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class editservices extends JFrame {

	private JPanel contentPane;
	private JTextField swimming;
	private JTextField maintanance;
	private JTextField gym;
	private JTextField club;
	private JTextField backuppower;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editservices frame = new editservices();
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
	public editservices() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Backup Power");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(12, 13, 173, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblClub = new JLabel("Club");
		lblClub.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblClub.setBounds(12, 71, 173, 45);
		contentPane.add(lblClub);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gym");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(12, 129, 173, 45);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Maintanance");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(12, 187, 173, 45);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Swimming");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(12, 245, 173, 45);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(210, 13, 13, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(210, 71, 13, 45);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(210, 129, 13, 45);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel(":");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2_3.setBounds(210, 187, 13, 45);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(":");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2_4.setBounds(210, 245, 13, 45);
		contentPane.add(lblNewLabel_2_4);
		
		swimming = new JTextField();
		swimming.setEditable(false);
		swimming.setText("500");
		swimming.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		swimming.setBounds(246, 260, 308, 22);
		contentPane.add(swimming);
		swimming.setColumns(10);
		
		maintanance = new JTextField();
		maintanance.setEditable(false);
		maintanance.setText("600");
		maintanance.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		maintanance.setColumns(10);
		maintanance.setBounds(246, 200, 308, 22);
		contentPane.add(maintanance);
		
		gym = new JTextField();
		gym.setEditable(false);
		gym.setText("1000");
		gym.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		gym.setColumns(10);
		gym.setBounds(246, 142, 308, 22);
		contentPane.add(gym);
		
		club = new JTextField();
		club.setEditable(false);
		club.setText("1200");
		club.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		club.setColumns(10);
		club.setBounds(246, 86, 308, 22);
		contentPane.add(club);
		
		backuppower = new JTextField();
		backuppower.setEditable(false);
		backuppower.setText("800");
		backuppower.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		backuppower.setColumns(10);
		backuppower.setBounds(246, 28, 308, 22);
		contentPane.add(backuppower);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				menuofadmin menu=new menuofadmin();
				menu.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setFont(new Font("Sitka Heading", Font.PLAIN, 26));
		btnNewButton.setBounds(12, 320, 106, 44);
		contentPane.add(btnNewButton);
		addmember add=new addmember();
		
		for(holder_details part:add.appartmentdetails) {
			if (part.x) {
			int a=0;
			if(part.maintanance) {
			a=Integer.parseInt(maintanance.getText());}
			if(part.swimming) {
			a=a+Integer.parseInt(swimming.getText());}
			if(part.gym) {
			a=a+Integer.parseInt(gym.getText());}
			if(part.club) {
			a=a+Integer.parseInt(club.getText());}
			if(part.backuppower) {
			a=a+Integer.parseInt(backuppower.getText());}
			if(part.singlebedroom) {
				a=a+500;}
			if(part.doublebedroom) {
				a=a+1000;}
			if(part.triplebedroom) {
				a=a+2000;}
            part.amount=a;
        }
	}
	}
}
