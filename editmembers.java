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
import java.awt.Color;

public class editmembers extends JFrame {

	private JPanel contentPane;
	JTextField Name1;
	JTextField contactno;
	private JTextField flatno;
	private JCheckBox singlebedroom;
	private JCheckBox triplebedroom;
	private JCheckBox doublebedroom;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editmembers frame = new editmembers();
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
	public editmembers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 94, 86, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblContactNo = new JLabel("Contact no");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblContactNo.setBounds(0, 142, 114, 35);
		contentPane.add(lblContactNo);
		
		JLabel lblContactNo_1 = new JLabel("Choose Services :");
		lblContactNo_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblContactNo_1.setBounds(0, 181, 189, 35);
		contentPane.add(lblContactNo_1);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(129, 94, 8, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(129, 142, 8, 35);
		contentPane.add(lblNewLabel_3);
		
		Name1 = new JTextField();
		Name1.setColumns(10);
		Name1.setBounds(181, 104, 612, 22);
		contentPane.add(Name1);
		
		contactno = new JTextField();
		contactno.setColumns(10);
		contactno.setBounds(181, 152, 612, 22);
		contentPane.add(contactno);
		
		JCheckBox maintanance = new JCheckBox("Maintanance");
		maintanance.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		maintanance.setBounds(1, 236, 161, 25);
		contentPane.add(maintanance);
		
		JCheckBox swimming = new JCheckBox("Swimming");
		swimming.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		swimming.setBounds(0, 287, 161, 25);
		contentPane.add(swimming);
		
		JCheckBox gym = new JCheckBox("Gym");
		gym.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		gym.setBounds(1, 335, 161, 25);
		contentPane.add(gym);
		
		JCheckBox club = new JCheckBox("Club");
		club.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		club.setBounds(1, 386, 161, 25);
		contentPane.add(club);
		
		singlebedroom = new JCheckBox("Single Bed room");
		singlebedroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(singlebedroom.isSelected()) {
					doublebedroom.setSelected(false);
					triplebedroom.setSelected(false);
				}
			}
		});
		singlebedroom.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		singlebedroom.setBounds(455, 236, 189, 25);
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
		doublebedroom.setBounds(455, 287, 203, 25);
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
		triplebedroom.setBounds(455, 335, 203, 25);
		contentPane.add(triplebedroom);
		
		JCheckBox backuppower = new JCheckBox("Backup Power");
		backuppower.setFont(new Font("Sitka Subheading", Font.PLAIN, 22));
		backuppower.setBounds(455, 386, 177, 25);
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
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(1, 442, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmember add=new addmember();
				boolean unique = true;
				if(singlebedroom.isSelected() || doublebedroom.isSelected() || triplebedroom.isSelected()) {
					if ("".compareTo(Name1.getText()) == 0|| "".compareTo(contactno.getText()) == 0) {
						JOptionPane.showMessageDialog(null,
								"Error Enter Flat no or mobile no or Name");			
					}
					else 
					{
						
				for(holder_details part:add.appartmentdetails) {
		        	if(part.getflatno().compareTo(flatno.getText())==0) {
		        	part.setName(Name1.getText());
		            part.setContactno(contactno.getText());
		            part.maintanance=maintanance.isSelected();
					part.swimming=swimming.isSelected();
					part.gym=gym.isSelected();
					part.club=club.isSelected();
					part.singlebedroom=singlebedroom.isSelected();
					part.doublebedroom=doublebedroom.isSelected();
					part.triplebedroom=triplebedroom.isSelected();
					part.backuppower=backuppower.isSelected();
				
				    editservices edit = new editservices();
		        	}
				}
				    }
		        }
				else 
				{
					JOptionPane.showMessageDialog(null,"Error please select the No of Bed Room");
				}
			}
		});
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEdit.setBounds(320, 442, 97, 25);
		contentPane.add(btnEdit);
		
		JLabel lblFlatNo = new JLabel("Flat no");
		lblFlatNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFlatNo.setBounds(0, 56, 86, 35);
		contentPane.add(lblFlatNo);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(129, 56, 8, 35);
		contentPane.add(lblNewLabel_1_1);
		
		flatno = new JTextField();
		flatno.setColumns(10);
		flatno.setBounds(181, 66, 107, 22);
		contentPane.add(flatno);
		
		JLabel lblEnterFlatNo = new JLabel("*Enter flat number to edit the details of the flat user*");
		lblEnterFlatNo.setForeground(Color.RED);
		lblEnterFlatNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEnterFlatNo.setBounds(111, 13, 575, 42);
		contentPane.add(lblEnterFlatNo);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmember add =new addmember();
				
				for(holder_details part:add.appartmentdetails) {
					if(part.getflatno().compareTo(flatno.getText())==0) {
					Name1.setText(part.getname());
					contactno.setText(part.getcontactno());
					maintanance.setSelected(part.maintanance);
					swimming.setSelected(part.swimming);
					gym.setSelected(part.gym);
					club.setSelected(part.club);
					singlebedroom.setSelected(part.singlebedroom);
					doublebedroom.setSelected(part.doublebedroom);
					triplebedroom.setSelected(part.triplebedroom);
					backuppower.setSelected(part.backuppower);
					
					}
				}
				
				
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnOk.setBounds(320, 66, 97, 25);
		contentPane.add(btnOk);
	}
}
