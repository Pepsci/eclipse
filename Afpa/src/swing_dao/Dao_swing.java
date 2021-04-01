package swing_dao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.Client;
import DAO.ClientDao;
import DAO.User;
import DAO.UserDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Dao_swing extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField email;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dao_swing frame = new Dao_swing();
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
	public Dao_swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Pr\u00E9nom");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 112, 198, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(32, 41, 198, 50);
		contentPane.add(lblNom);
		
		nom = new JTextField();
		nom.setBounds(155, 41, 260, 50);
		contentPane.add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(155, 112, 260, 50);
		contentPane.add(prenom);
		
		JButton submit = new JButton("Ajout user");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String saisie_nom = nom.getText();
				String saisie_prenom = prenom.getText();
				
				if(saisie_nom.equals("") || saisie_prenom.equals("")) {
					
					JOptionPane.showMessageDialog(submit, "Veuillez remplir tous les champs");
				}else {
					//JOptionPane.showMessageDialog(submit, saisie_prenom);
					
					Client cli = new Client(saisie_nom,saisie_prenom);
					
					ClientDao clientDao = new ClientDao();
					
					clientDao.create(cli);
				}
				
			}
		});
		submit.setBounds(10, 216, 354, 73);
		contentPane.add(submit);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(640, 59, 154, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mot de passe");
		lblNewLabel_1_1.setBounds(565, 121, 74, 32);
		contentPane.add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setBounds(689, 56, 252, 35);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton submit_user = new JButton("Ajout User");
		submit_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email_user = email.getText();
				String pwd_user = pwd.getText();
				
				User user = new User(email_user,pwd_user);
				UserDao udao = new UserDao();
				
				udao.create(user);
				
			}
		});
		submit_user.setBounds(714, 201, 207, 59);
		contentPane.add(submit_user);
		
		pwd = new JPasswordField();
		pwd.setBounds(699, 112, 242, 41);
		contentPane.add(pwd);
	}

}
