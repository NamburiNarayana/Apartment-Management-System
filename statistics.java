package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class statistics extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statistics frame = new statistics();
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
	
	public statistics() {
		int maintanance=0;
		int swimming=0;
		int gym=0;
		int club=0;
		int backuppower=0;
		addmember add =new addmember();
		for(holder_details part:add.appartmentdetails) {
			if(part.maintanance==true) {
				maintanance=maintanance+1;
			}
		}
		for(holder_details part:add.appartmentdetails) {
			if(part.swimming==true) {
				swimming=swimming+1;
			}
		}
		for(holder_details part:add.appartmentdetails) {
			if(part.gym==true) {
				gym=gym+1;
			}
		}
		for(holder_details part:add.appartmentdetails) {
			if(part.club==true) {
				club=club+1;
			}
		}
		for(holder_details part:add.appartmentdetails) {
			if(part.backuppower==true) {
				backuppower=backuppower+1;
			}
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 403, 137);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Backup Power", backuppower},
				{"Club", club},
				{"Gym", gym},
				{"Maintainence", maintanance},
				{"Swimming", swimming},
			},
			new String[] {
				"Services", "No of Flats"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(150, 163, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				menuofadmin menu =new menuofadmin();
				menu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
	}
}
