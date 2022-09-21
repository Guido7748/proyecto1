package Sistema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaCliente {

	private JFrame frmNorthwind;
	private JTextField txtcustomersID;
	private JTextField txtcompanyName;
	private JTextField contactName;
	private JTextField txtcontactTitle;
	private JTextField txtaddress;
	private JTextField txtcity;
	private JTextField txtregion;
	private JTextField txtpostalCode;
	private JTextField txtcountry;
	private JTextField txtphone;
	private JTextField txtfax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaCliente window = new PantallaCliente();
					window.frmNorthwind.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNorthwind = new JFrame();
		frmNorthwind.setTitle("Northwind");
		frmNorthwind.setBounds(100, 100, 514, 410);
		frmNorthwind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNorthwind.getContentPane().setLayout(null);
		
		JLabel lblcustomersID = new JLabel("customersID");
		lblcustomersID.setBounds(10, 22, 89, 14);
		frmNorthwind.getContentPane().add(lblcustomersID);
		
		JLabel lblcompanyName = new JLabel("companyName");
		lblcompanyName.setBounds(10, 47, 89, 14);
		frmNorthwind.getContentPane().add(lblcompanyName);
		
		JLabel lblcontactName = new JLabel("contactName");
		lblcontactName.setBounds(10, 72, 89, 14);
		frmNorthwind.getContentPane().add(lblcontactName);
		
		JLabel lblcontactTitle = new JLabel("contactTitle");
		lblcontactTitle.setBounds(10, 97, 89, 14);
		frmNorthwind.getContentPane().add(lblcontactTitle);
		
		JLabel lbladdress = new JLabel("address");
		lbladdress.setBounds(10, 122, 46, 14);
		frmNorthwind.getContentPane().add(lbladdress);
		
		JLabel lblcity = new JLabel("city");
		lblcity.setBounds(10, 147, 46, 14);
		frmNorthwind.getContentPane().add(lblcity);
		
		JLabel lblregion = new JLabel("region");
		lblregion.setBounds(10, 172, 46, 14);
		frmNorthwind.getContentPane().add(lblregion);
		
		JLabel lblpostalCode = new JLabel("postalCode");
		lblpostalCode.setBounds(10, 198, 89, 14);
		frmNorthwind.getContentPane().add(lblpostalCode);
		
		JLabel lblcountry = new JLabel("country");
		lblcountry.setBounds(10, 223, 46, 14);
		frmNorthwind.getContentPane().add(lblcountry);
		
		JLabel lblphone = new JLabel("phone");
		lblphone.setBounds(10, 248, 46, 14);
		frmNorthwind.getContentPane().add(lblphone);
		
		JLabel lblfax = new JLabel("fax");
		lblfax.setBounds(10, 273, 46, 14);
		frmNorthwind.getContentPane().add(lblfax);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NegocioCliente nc= new NegocioCliente () {
					nc.setcustomerID(txtcustomerID.getText());
					nc.setcompanyName(txtcompanyName.getText());	
					nc.setcontactName(txtcontactName.getText());
					nc.setcontactTitle(txtcontactTitle.getText());
					nc.setaddress(txtaddress.getText());
					nc.setcity(txtcity.getText());
					nc.setregion(txtregion.getText());
					nc.setpostalCode(txtpostalCode.getText());
					nc.setcountry(txtcountry.getText());
					nc.setphone(txtphone.getText());
					nc.setfax(txtfax.getText());
					JOptionPane.
					}
				}
		
		});
		btnInsertar.setBounds(10, 336, 89, 23);
		frmNorthwind.getContentPane().add(btnInsertar);
		
		JButton btnElminar = new JButton("Eliminar");
		btnElminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		
		});
		btnElminar.setBounds(126, 336, 89, 23);
		frmNorthwind.getContentPane().add(btnElminar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(242, 336, 89, 23);
		frmNorthwind.getContentPane().add(btnConsultar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(366, 336, 89, 23);
		frmNorthwind.getContentPane().add(btnActualizar);
		
		txtcustomersID = new JTextField();
		txtcustomersID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcustomersID.getText().length()>=5) {
					e.consume();
				}
			}
		});
		txtcustomersID.setBounds(111, 19, 86, 20);
		frmNorthwind.getContentPane().add(txtcustomersID);
		txtcustomersID.setColumns(10);
		
		txtcompanyName = new JTextField();
		txtcompanyName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcompanyName.getText().length()>=40) {
					e.consume();
				}
			
			}
		});
		txtcompanyName.setBounds(111, 44, 86, 20);
		frmNorthwind.getContentPane().add(txtcompanyName);
		txtcompanyName.setColumns(10);
		
		contactName = new JTextField();
		contactName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcustomersID.getText().length()>=55) {
					e.consume();
				}
			}
		});
		contactName.setBounds(111, 69, 86, 20);
		frmNorthwind.getContentPane().add(contactName);
		contactName.setColumns(10);
		
		txtcontactTitle = new JTextField();
		txtcontactTitle.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcontactTitle.getText().length()>=30) {
					e.consume();
				}
			}
		});
		txtcontactTitle.setBounds(111, 94, 86, 20);
		frmNorthwind.getContentPane().add(txtcontactTitle);
		txtcontactTitle.setColumns(10);
		
		txtaddress = new JTextField();
		txtaddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtaddress.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtaddress.setBounds(111, 119, 86, 20);
		frmNorthwind.getContentPane().add(txtaddress);
		txtaddress.setColumns(10);
		
		txtcity = new JTextField();
		txtcity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcity.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtcity.setBounds(111, 144, 86, 20);
		frmNorthwind.getContentPane().add(txtcity);
		txtcity.setColumns(10);
		
		txtregion = new JTextField();
		txtregion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtregion.getText().length()>=55) {
					e.consume();
				}
			}
			
		});
		txtregion.setBounds(111, 169, 86, 20);
		frmNorthwind.getContentPane().add(txtregion);
		txtregion.setColumns(10);
		
		txtpostalCode = new JTextField();
		txtpostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtpostalCode.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtpostalCode.setBounds(111, 195, 86, 20);
		frmNorthwind.getContentPane().add(txtpostalCode);
		txtpostalCode.setColumns(10);
		
		txtcountry = new JTextField();
		txtcountry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtcountry.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtcountry.setBounds(111, 220, 86, 20);
		frmNorthwind.getContentPane().add(txtcountry);
		txtcountry.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtphone.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtphone.setBounds(111, 245, 86, 20);
		frmNorthwind.getContentPane().add(txtphone);
		txtphone.setColumns(10);
		
		txtfax = new JTextField();
		txtfax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtfax.getText().length()>=55) {
					e.consume();
				}
			}
		});
		txtfax.setBounds(111, 270, 86, 20);
		frmNorthwind.getContentPane().add(txtfax);
		txtfax.setColumns(10);
	}
}
