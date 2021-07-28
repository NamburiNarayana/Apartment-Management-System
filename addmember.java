package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class addmember extends JFrame {

	private JPanel contentPane;
	JTextField Name1;
	JTextField Flat_no;
	JTextField contact_no;
    private static int length;   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmember frame = new addmember();
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
	static LinkedList<holder_details> appartmentdetails = new LinkedList<holder_details>();
	private JCheckBox doublebedroom;
	private JCheckBox triplebedroom;
	private JCheckBox backuppower;

	public addmember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblContactNo_1 = new JLabel("Choose Services");
		lblContactNo_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblContactNo_1.setBounds(1, 128, 177, 35);
		contentPane.add(lblContactNo_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(1, 0, 86, 35);
		contentPane.add(lblNewLabel);

		JLabel lblFlatNo_1 = new JLabel("Flat no");
		lblFlatNo_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFlatNo_1.setBounds(1, 40, 86, 35);
		contentPane.add(lblFlatNo_1);

		JLabel lblContactNo = new JLabel("Contact no");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblContactNo.setBounds(1, 80, 114, 35);
		contentPane.add(lblContactNo);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(130, 0, 8, 35);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_4 = new JLabel(":");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(130, 40, 8, 35);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(130, 80, 8, 35);
		contentPane.add(lblNewLabel_3);

		Name1 = new JTextField();
		Name1.setColumns(10);
		Name1.setBounds(182, 10, 612, 22);
		contentPane.add(Name1);

		Flat_no = new JTextField();
		Flat_no.setColumns(10);
		Flat_no.setBounds(182, 50, 612, 22);
		contentPane.add(Flat_no);

		contact_no = new JTextField();
		contact_no.setColumns(10);
		contact_no.setBounds(182, 90, 612, 22);
		contentPane.add(contact_no);
		JCheckBox maintanance = new JCheckBox("Maintanance");
		maintanance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		maintanance.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		maintanance.setBounds(1, 189, 161, 25);
		contentPane.add(maintanance);

		JCheckBox swimming = new JCheckBox("Swimming");
		swimming.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		swimming.setBounds(0, 240, 161, 25);
		contentPane.add(swimming);

		JCheckBox gym = new JCheckBox("Gym");
		gym.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		gym.setBounds(1, 288, 161, 25);
		contentPane.add(gym);

		JCheckBox club = new JCheckBox("Club");
		club.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		club.setBounds(1, 339, 161, 25);
		contentPane.add(club);

		JCheckBox singlebedroom = new JCheckBox("Single Bed room");
		singlebedroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(singlebedroom.isSelected()) {
					doublebedroom.setSelected(false);
					triplebedroom.setSelected(false);
				}
			}
		});
		singlebedroom.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		singlebedroom.setBounds(397, 189, 189, 25);
		contentPane.add(singlebedroom);

		doublebedroom = new JCheckBox("Double Bed room");
		doublebedroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(doublebedroom.isSelected()) {
					singlebedroom.setSelected(false);
					triplebedroom.setSelected(false);
				}
			}
		});
		doublebedroom.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		doublebedroom.setBounds(397, 240, 203, 25);
		contentPane.add(doublebedroom);

		triplebedroom = new JCheckBox("Triple Bed Room");
		triplebedroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(triplebedroom.isSelected()) {
					doublebedroom.setSelected(false);
					singlebedroom.setSelected(false);
				}
			}
		});
		triplebedroom.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		triplebedroom.setBounds(397, 288, 203, 25);
		contentPane.add(triplebedroom);

		backuppower = new JCheckBox("Backup Power");
		backuppower.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		backuppower.setBounds(397, 339, 177, 25);
		contentPane.add(backuppower);

		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				menuofadmin menu = new menuofadmin();
				menu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(1, 395, 97, 25);
		contentPane.add(btnNewButton);

		JButton btnAdd = new JButton("ADD");

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean unique = true;
				
				if(singlebedroom.isSelected() || doublebedroom.isSelected() || triplebedroom.isSelected()) {
				if ("".compareTo(Flat_no.getText()) == 0 || "".compareTo(Name1.getText()) == 0|| "".compareTo(contact_no.getText()) == 0) {
					JOptionPane.showMessageDialog(null,
							"Error Enter Flat no or mobile no or Name");			
				}
				
					
				
				else {
					
					for (holder_details part : appartmentdetails) {
						if (part.getflatno().compareTo(Flat_no.getText()) == 0
								|| part.getname().compareTo(Name1.getText()) == 0
								|| part.getcontactno().compareTo(contact_no.getText()) == 0) {
							unique = false;
						}
					}
					if (unique == false) {
						JOptionPane.showMessageDialog(null,
								"Error this Flat no or Owner name or contact no already exists ");

					} else {
						lists list = new lists();
						appartmentdetails.add(new holder_details(Name1.getText(), Flat_no.getText(), contact_no.getText(), maintanance.isSelected(),swimming.isSelected(),gym.isSelected(),club.isSelected(),singlebedroom.isSelected(),doublebedroom.isSelected(),triplebedroom.isSelected(),backuppower.isSelected()));
						
					   
					    editservices edit = new editservices();
					    
					}
					
				
				}
				
				}
				else {
					JOptionPane.showMessageDialog(null,
							"Error please select the No of Bed Room");
				}
			}
		});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdd.setBounds(223, 370, 97, 25);
		contentPane.add(btnAdd);
	}
}
