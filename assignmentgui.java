package House_Estate_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class assignmentgui extends JFrame {

	private JPanel contentPane;
	private JTextField anda;
	private JTextField andb;
	private JTextField nanda;
	private JTextField nandb;
	private JTextField orb;
	private JTextField ora;
	private JTextField norb;
	private JTextField nora;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblA_1;
	private JLabel lblB_1;
	private JLabel lblA_2;
	private JLabel lblB_2;
	private JLabel lblA_3;
	private JLabel lblB_3;
	private JButton btnNewButton;
	private JButton btnNand;
	private JButton btnNor;
	private JButton btnOr;
	private JTextField andout;
	private JTextField nandout;
	private JTextField orout;
	private JTextField norout;
	private JLabel lblA_4;
	private JTextField nota;
	private JButton btnNot;
	private JTextField notout;
	private JLabel lblOut;
	private JLabel lblOut_1;
	private JLabel lblOut_2;
	private JLabel lblOut_3;
	private JLabel lblOut_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignmentgui frame = new assignmentgui();
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
	public assignmentgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogicGatesImplimentation = new JLabel("* LOGIC Gates Implimentation*");
		lblLogicGatesImplimentation.setForeground(Color.RED);
		lblLogicGatesImplimentation.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblLogicGatesImplimentation.setBounds(96, 29, 402, 50);
		contentPane.add(lblLogicGatesImplimentation);
		
		anda = new JTextField();
		anda.setBounds(115, 113, 21, 22);
		contentPane.add(anda);
		anda.setColumns(10);
		
		andb = new JTextField();
		andb.setColumns(10);
		andb.setBounds(115, 159, 21, 22);
		contentPane.add(andb);
		
		nanda = new JTextField();
		nanda.setColumns(10);
		nanda.setBounds(115, 310, 21, 22);
		contentPane.add(nanda);
		
		nandb = new JTextField();
		nandb.setColumns(10);
		nandb.setBounds(115, 364, 21, 22);
		contentPane.add(nandb);
		
		orb = new JTextField();
		orb.setColumns(10);
		orb.setBounds(421, 159, 21, 22);
		contentPane.add(orb);
		
		ora = new JTextField();
		ora.setColumns(10);
		ora.setBounds(421, 113, 21, 22);
		contentPane.add(ora);
		
		norb = new JTextField();
		norb.setColumns(10);
		norb.setBounds(421, 364, 21, 22);
		contentPane.add(norb);
		
		nora = new JTextField();
		nora.setColumns(10);
		nora.setBounds(421, 318, 21, 22);
		contentPane.add(nora);
		
		lblA = new JLabel("A:");
		lblA.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblA.setBounds(93, 110, 21, 28);
		contentPane.add(lblA);
		
		lblB = new JLabel("B:");
		lblB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblB.setBounds(93, 159, 21, 28);
		contentPane.add(lblB);
		
		lblA_1 = new JLabel("A:");
		lblA_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblA_1.setBounds(401, 110, 21, 28);
		contentPane.add(lblA_1);
		
		lblB_1 = new JLabel("B:");
		lblB_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblB_1.setBounds(401, 159, 21, 28);
		contentPane.add(lblB_1);
		
		lblA_2 = new JLabel("A:");
		lblA_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblA_2.setBounds(93, 309, 21, 28);
		contentPane.add(lblA_2);
		
		lblB_2 = new JLabel("B:");
		lblB_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblB_2.setBounds(93, 358, 21, 28);
		contentPane.add(lblB_2);
		
		lblA_3 = new JLabel("A:");
		lblA_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblA_3.setBounds(401, 319, 21, 28);
		contentPane.add(lblA_3);
		
		lblB_3 = new JLabel("B:");
		lblB_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblB_3.setBounds(401, 368, 21, 28);
		contentPane.add(lblB_3);
		
		btnNewButton = new JButton("AND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String anda1=anda.getText();
				String andb1=andb.getText();
				if(anda1.equals("0")&&andb1.equals("0")) {
					andout.setText("0");
				}
				if(anda1.equals("0")&&andb1.equals("1")) {
					andout.setText("0");
				}
				if(anda1.equals("1")&&andb1.equals("0")) {
					andout.setText("0");
				}
				if(anda1.equals("1")&&andb1.equals("1")) {
					andout.setText("1");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(140, 137, 89, 25);
		contentPane.add(btnNewButton);
		
		btnNand = new JButton("NAND");
		btnNand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nanda1=nanda.getText();
				String nandb1=nandb.getText();
				if(nanda1.equals("0")&&nandb1.equals("0")) {
					nandout.setText("1");
				}
				if(nanda1.equals("0")&&nandb1.equals("1")) {
					nandout.setText("1");
				}
				if(nanda1.equals("1")&&nandb1.equals("0")) {
					nandout.setText("1");
				}
				if(nanda1.equals("1")&&nandb1.equals("1")) {
					nandout.setText("0");
				}
			}
		});
		btnNand.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNand.setBounds(140, 337, 100, 25);
		contentPane.add(btnNand);
		
		btnNor = new JButton("NOR");
		btnNor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nora1=nora.getText();
				String norb1=norb.getText();
				if(nora1.equals("0")&&norb1.equals("0")) {
					norout.setText("1");
				}
				if(nora1.equals("0")&&norb1.equals("1")) {
					norout.setText("0");
				}
				if(nora1.equals("1")&&norb1.equals("0")) {
					norout.setText("0");
				}
				if(nora1.equals("1")&&norb1.equals("1")) {
					norout.setText("0");
				}
			}
		});
		btnNor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNor.setBounds(445, 339, 83, 25);
		contentPane.add(btnNor);
		
		btnOr = new JButton("OR");
		btnOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ora1=ora.getText();
				String orb1=orb.getText();
				if(ora1.equals("0")&&orb1.equals("0")) {
					orout.setText("0");
				}
				if(ora1.equals("0")&&orb1.equals("1")) {
					orout.setText("1");
				}
				if(ora1.equals("1")&&orb1.equals("0")) {
					orout.setText("1");
				}
				if(ora1.equals("1")&&orb1.equals("1")) {
					orout.setText("1");
				}
			}
		});
		btnOr.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOr.setBounds(454, 137, 74, 25);
		contentPane.add(btnOr);
		
		andout = new JTextField();
		andout.setEditable(false);
		andout.setColumns(10);
		andout.setBounds(287, 140, 21, 22);
		contentPane.add(andout);
		
		nandout = new JTextField();
		nandout.setEditable(false);
		nandout.setColumns(10);
		nandout.setBounds(287, 340, 21, 22);
		contentPane.add(nandout);
		
		orout = new JTextField();
		orout.setEditable(false);
		orout.setColumns(10);
		orout.setBounds(576, 140, 21, 22);
		contentPane.add(orout);
		
		norout = new JTextField();
		norout.setEditable(false);
		norout.setColumns(10);
		norout.setBounds(576, 340, 21, 22);
		contentPane.add(norout);
		
		lblA_4 = new JLabel("A:");
		lblA_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblA_4.setBounds(229, 239, 21, 28);
		contentPane.add(lblA_4);
		
		nota = new JTextField();
		nota.setColumns(10);
		nota.setBounds(253, 242, 21, 22);
		contentPane.add(nota);
		
		btnNot = new JButton("NOT");
		btnNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nota1=nota.getText();
				if(nota1.equals("0")) {
					notout.setText("1");
				}
				if(nota1.equals("1")) {
					notout.setText("0");
				}
			}
		});
		btnNot.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNot.setBounds(278, 239, 74, 25);
		contentPane.add(btnNot);
		
		notout = new JTextField();
		notout.setEditable(false);
		notout.setColumns(10);
		notout.setBounds(389, 242, 21, 22);
		contentPane.add(notout);
		
		lblOut = new JLabel("OUT:");
		lblOut.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOut.setBounds(241, 137, 34, 28);
		contentPane.add(lblOut);
		
		lblOut_1 = new JLabel("OUT:");
		lblOut_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOut_1.setBounds(241, 337, 34, 28);
		contentPane.add(lblOut_1);
		
		lblOut_2 = new JLabel("OUT:");
		lblOut_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOut_2.setBounds(355, 239, 34, 28);
		contentPane.add(lblOut_2);
		
		lblOut_3 = new JLabel("OUT:");
		lblOut_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOut_3.setBounds(530, 137, 34, 28);
		contentPane.add(lblOut_3);
		
		lblOut_4 = new JLabel("OUT:");
		lblOut_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOut_4.setBounds(530, 337, 34, 28);
		contentPane.add(lblOut_4);
	}
}
