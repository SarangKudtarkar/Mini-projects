import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.List;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	private JTextField QVadapav;
	private JTextField QSamosapav;
	private JTextField QFriedRice;
	private JTextField QTea;
	private JTextField QMirinda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//add Food-items default price
		int VadaPav,SamosaPav,Tea,Mirinda,FriedRice;
		VadaPav=12;
		SamosaPav=14;
		Tea=10;
		Mirinda=15;
		FriedRice=39;
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Canteen Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JTextArea txtrContactHotelgmailcom = new JTextArea();
		txtrContactHotelgmailcom.setEditable(false);
		txtrContactHotelgmailcom.setWrapStyleWord(true);
		txtrContactHotelgmailcom.setLineWrap(true);
		txtrContactHotelgmailcom.setText("Contact-90065432111/87754123456 hotel@gmail.com  ");
		frame.getContentPane().add(txtrContactHotelgmailcom, BorderLayout.SOUTH);
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JCheckBox CSamosapav = new JCheckBox("Samosapav");
		CSamosapav.setBounds(133, 58, 97, 23);
		panel.add(CSamosapav);
		
		JCheckBox CVadapav = new JCheckBox("Vadapav");
		CVadapav.setBounds(133, 32, 97, 23);
		panel.add(CVadapav);
		
		JCheckBox CTea = new JCheckBox("Tea");
		CTea.setBounds(133, 110, 97, 23);
		panel.add(CTea);
		
		JCheckBox CFriedrice = new JCheckBox("FriedRice");
		CFriedrice.setBounds(133, 84, 97, 23);
		panel.add(CFriedrice);
		
		JCheckBox CMirinda = new JCheckBox("Mirinda");
		CMirinda.setBounds(133, 136, 97, 23);
		panel.add(CMirinda);
		
		JLabel lblSelectItemsAnd = new JLabel("select items");
		lblSelectItemsAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectItemsAnd.setBounds(133, 11, 78, 14);
		panel.add(lblSelectItemsAnd);
		
		QVadapav = new JTextField();
		QVadapav.setBounds(236, 33, 86, 20);
		panel.add(QVadapav);
		QVadapav.setColumns(10);
		
		QSamosapav = new JTextField();
		QSamosapav.setColumns(10);
		QSamosapav.setBounds(236, 59, 86, 20);
		panel.add(QSamosapav);
		
		QFriedRice = new JTextField();
		QFriedRice.setColumns(10);
		QFriedRice.setBounds(236, 85, 86, 20);
		panel.add(QFriedRice);
		
		QTea = new JTextField();
		QTea.setColumns(10);
		QTea.setBounds(236, 111, 86, 20);
		panel.add(QTea);
		
		QMirinda = new JTextField();
		QMirinda.setColumns(10);
		QMirinda.setBounds(236, 137, 86, 20);
		panel.add(QMirinda);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(240, 11, 84, 14);
		panel.add(lblQuantity);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
			}
		});
		btnSubmit.setBounds(172, 166, 89, 26);
		panel.add(btnSubmit);
		
	}
}
