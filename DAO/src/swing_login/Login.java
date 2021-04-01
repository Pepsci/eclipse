package swing_login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.User;
import DAO.UserDao;
import DAO.getConnect;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JPasswordField pwd;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 751, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accueil");
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 32, 170, 38);
		panel.add(lblNewLabel);
		
		JLabel lblAProposDe = new JLabel("A propos de nous");
		lblAProposDe.setFont(new Font("Sylfaen", Font.ITALIC, 15));
		lblAProposDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAProposDe.setBounds(193, 32, 170, 38);
		panel.add(lblAProposDe);
		
		JLabel lblNousConctacter = new JLabel("Nous conctacter");
		lblNousConctacter.setFont(new Font("Sylfaen", Font.ITALIC, 15));
		lblNousConctacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblNousConctacter.setBounds(387, 32, 170, 38);
		panel.add(lblNousConctacter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(335, 115, 439, 435);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(23, 36, 146, 45);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Passeword");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(23, 126, 146, 45);
		panel_2.add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setBounds(202, 42, 211, 33);
		panel_2.add(email);
		email.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(203, 126, 210, 33);
		panel_2.add(pwd);
		
		JButton connection = new JButton("Se connecter");
		connection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String email_saisie = email.getText();
				String pwd_saisie = pwd.getText();
				
				Connection connect = getConnect.getConnection();
				
				try {
					
					PreparedStatement req = connect.prepareStatement("SELECT * FROM user WHERE email=? " + " AND pwd=?");
					
					req.setString(1, email_saisie);
					req.setString(2, pwd_saisie);
					
					ResultSet rs = req.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(connection, "Welcome " + email_saisie);
						
						dispose();
						
						Home_page home = new Home_page(email_saisie);
						home.setVisible(true);
						
						JLabel user = new JLabel(email_saisie);
						home.getContentPane().add(user);
						
					}else {
						JOptionPane.showMessageDialog(connection, "Login / mdp incorrect");

					}
					
				}catch(Exception e1) {
					e1.printStackTrace();
					System.out.println("Insertion KO - KO - KO");
				}
			}
		});
		connection.setBounds(23, 187, 390, 38);
		panel_2.add(connection);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 115, 315, 435);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 295, 413);
		panel_1.add(table);
		table.setModel(liste());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 295, 413);
		panel_1.add(scrollPane);
	}
	
	
	//Liste des users
	
	public DefaultTableModel liste(){
		
		String [] col = {"ID", "EMAIL", "Pwd"};
		
		UserDao usDAO = new UserDao();
		
		DefaultTableModel tab = new DefaultTableModel(null, col);
		
		List<User> listUser = new ArrayList<>();
		listUser.addAll(usDAO.read());
		
		for (int i = 0; i < listUser.size(); i++) {
			User us = listUser.get(i);
			
			Vector vect = new Vector();
			vect.add(us.getId());
			vect.add(us.getEmail());
			vect.add(us.getPassword());
			
			tab.addRow(vect);
		}
		return tab;
	}
}












