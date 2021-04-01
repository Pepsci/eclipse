package swing_dao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dao_swing extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField email_login;
	private JPasswordField password_login;
	private JTable table;
	private JScrollPane scrollPane;

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
		lblNewLabel.setBounds(0, 83, 154, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(0, 11, 137, 50);
		contentPane.add(lblNom);
		
		nom = new JTextField();
		nom.setBounds(147, 11, 220, 50);
		contentPane.add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(147, 83, 220, 50);
		contentPane.add(prenom);
		
		String saisie_nom = nom.getText();
		String saisie_prenom = prenom.getText();
		
		Client cli = new Client(saisie_nom,saisie_prenom);
		ClientDao clientDao = new ClientDao();
		
		JButton submit = new JButton("Ajout client");
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.DARK_GRAY);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(saisie_nom.equals("") || saisie_prenom.equals("")) {
					
					JOptionPane.showMessageDialog(submit, "Veuillez remplir tous les champs");
				}else {
					
					if(submit.getText().equals("Ajout client")) {
						
					clientDao.create(cli);
					
					table.setModel(liste());
					JOptionPane.showMessageDialog(submit, "Client ajouté");
					
					nom.setText("");
					prenom.setText("");
				}
					else {
						
						int id2 = table.getSelectedRow();
						cli.setId((int) table.getModel().getValueAt(id2, 0));
						clientDao.update(cli);
						
						table.setModel(liste());
						nom.setText("");
						prenom.setText("");
						submit.setText("Ajout client");
					}
				}
			}
		});
		submit.setBounds(10, 144, 357, 59);
		contentPane.add(submit);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.DARK_GRAY);
		panel.setBounds(387, 11, 572, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 552, 424);
		panel.add(scrollPane);
		
		JButton delete = new JButton("Suprimer client");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ligne_a_supp = table.getSelectedRow();
				int id_a_supp = (int) table.getModel().getValueAt(ligne_a_supp, 0);
				
				cli.setId(id_a_supp);
				clientDao.delete(cli);
				table.setModel(liste());
				nom.setText("");
				prenom.setText("");
			}
		});
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id = table.getSelectedRow();
				
				String user_id = table.getModel().getValueAt(id, 0).toString();
				String user_nom = (String) table.getModel().getValueAt(id, 1);
				String user_prenom = (String) table.getModel().getValueAt(id, 2);
				
				submit.setText("Modifier");
				
//				JOptionPane.showMessageDialog(panel, user_id);
//				JOptionPane.showMessageDialog(panel, user_nom);
//				JOptionPane.showMessageDialog(panel, user_prenom);
				
				nom.setText(user_nom);
				prenom.setText(user_prenom);
				
				delete.setVisible(true);
				
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(liste());
		

		delete.setForeground(Color.WHITE);
		delete.setBackground(Color.DARK_GRAY);
		delete.setBounds(10, 234, 357, 59);
		contentPane.add(delete);
		delete.setVisible(false);
		
		

	}
	public DefaultTableModel liste(){
		
		String [] col = {"ID", "Nom", "Prenom"};
		
		ClientDao cliDAO = new ClientDao();
		
		DefaultTableModel tab = new DefaultTableModel(null, col);
		
		List<Client> listClient = new ArrayList<>();
		listClient.addAll(cliDAO.read());
		
		for (int i = 0; i < listClient.size(); i++) {
			Client cli = listClient.get(i);
			
			Vector vect = new Vector();
			vect.add(cli.getId());
			vect.add(cli.getNom());
			vect.add(cli.getPrenom());
			
			tab.addRow(vect);
		}
		return tab;
	}
}



























