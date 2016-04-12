package pack_restuarant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Restuarant_app {

	private JFrame frame;
	private JTextField txtFldChickBir;
	private JTextField txtFldMutBir;
	private JTextField txtFldChick65;
	private JTextField txtFldChickFriRi;
	private JTextField txtFldChickNood;
	private JTextField txtFldFishBir;
	private JTextField txtFldDrinkQnty;
	private JTextField txtFld_TendCash;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restuarant_app window = new Restuarant_app();
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
	public Restuarant_app() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Restaurant Billing");
		frame.setBounds(1, 1, 1200, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(13, 103, 474, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
/*	===================================    FOODS PANEL ===================================
	======================================================================================	*/
		
		JLabel lblChickBir = new JLabel("Chicken Biryani");
		lblChickBir.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblChickBir.setBounds(6, 10, 140, 26);
		panel.add(lblChickBir);
		
		JLabel lblMuttonBir = new JLabel("Mutton Biryani");
		lblMuttonBir.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblMuttonBir.setBounds(6, 60, 140, 26);
		panel.add(lblMuttonBir);
		
		JLabel lblChick65 = new JLabel("Chicken 65");
		lblChick65.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblChick65.setBounds(6, 110, 140, 26);
		panel.add(lblChick65);
		
		JLabel lblChickFR = new JLabel("Chicken Fried Rice");
		lblChickFR.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblChickFR.setBounds(6, 160, 169, 26);
		panel.add(lblChickFR);
		
		JLabel lblChickNood = new JLabel("Chicken Noodles");
		lblChickNood.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblChickNood.setBounds(6, 210, 169, 26);
		panel.add(lblChickNood);
		
		JLabel lblFishBir = new JLabel("Fish Biryani");
		lblFishBir.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblFishBir.setBounds(6, 260, 140, 26);
		panel.add(lblFishBir);
		
		JLabel lblEnterQuantity = new JLabel("Enter Quantity");
		lblEnterQuantity.setBounds(356, 17, 90, 16);
		panel.add(lblEnterQuantity);
		
		txtFldChickBir = new JTextField();
		txtFldChickBir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldChickBir.setBounds(225, 11, 127, 28);
		panel.add(txtFldChickBir);
		txtFldChickBir.setColumns(10);
		
		
		txtFldMutBir = new JTextField();
		txtFldMutBir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldMutBir.setColumns(10);
		txtFldMutBir.setBounds(225, 60, 127, 28);
		panel.add(txtFldMutBir);
		
		
		txtFldChick65 = new JTextField();
		txtFldChick65.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldChick65.setColumns(10);
		txtFldChick65.setBounds(225, 111, 127, 28);
		panel.add(txtFldChick65);
		
		
		txtFldChickFriRi = new JTextField();
		txtFldChickFriRi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldChickFriRi.setColumns(10);
		txtFldChickFriRi.setBounds(225, 161, 127, 28);
		panel.add(txtFldChickFriRi);
		
		txtFldChickNood = new JTextField();
		txtFldChickNood.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldChickNood.setColumns(10);
		txtFldChickNood.setBounds(225, 208, 127, 28);
		panel.add(txtFldChickNood);
		
		
		txtFldFishBir = new JTextField();
		txtFldFishBir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldFishBir.setColumns(10);
		txtFldFishBir.setBounds(225, 260, 127, 28);
		panel.add(txtFldFishBir);
		
/*		=================================== TOTALS PANEL =====================
 * ============================================================================*/		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(504, 103, 295, 321);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblCostOfDrinks.setBounds(6, 56, 140, 26);
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblCostOfMeal.setBounds(6, 6, 140, 26);
		panel_1.add(lblCostOfMeal);
		
		JLabel lblDeliveryCost = new JLabel("Delivery Cost");
		lblDeliveryCost.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblDeliveryCost.setBounds(6, 106, 140, 26);
		panel_1.add(lblDeliveryCost);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblTotal.setBounds(6, 217, 89, 26);
		panel_1.add(lblTotal);
		
		JLabel lblCostMeal = new JLabel("0");
		lblCostMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblCostMeal.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCostMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostMeal.setBounds(178, 6, 111, 23);
		panel_1.add(lblCostMeal);
		
		JLabel label_1 = new JLabel("0");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_1.setBounds(178, 56, 111, 23);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_2.setBounds(178, 106, 111, 23);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 27));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_3.setBounds(122, 209, 167, 48);
		panel_1.add(label_3);
		
		
/*====================================== DRINKS PANEL ======================
  ============================================================================*/
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(13, 440, 474, 191);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		final JComboBox drinksComboBox = new JComboBox();
		drinksComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Coca-cola", "Fanta", "Thumbs Up", "Sprite", "Pepsi", "Maaza", "Water"}));
		drinksComboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		drinksComboBox.setBounds(6, 19, 159, 27);
		panel_2.add(drinksComboBox);
		
		txtFldDrinkQnty = new JTextField();
		txtFldDrinkQnty.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if ( 
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFldDrinkQnty.setColumns(10);
		txtFldDrinkQnty.setBounds(231, 18, 127, 28);
		panel_2.add(txtFldDrinkQnty);
		
		JLabel lblBottlingType = new JLabel("Bottling Type");
		lblBottlingType.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblBottlingType.setBounds(16, 58, 140, 26);
		panel_2.add(lblBottlingType);
		
		final JRadioButton rdbtnPlastic = new JRadioButton("Plastic");
		rdbtnPlastic.setSelected(true);
		rdbtnPlastic.setBounds(15, 96, 78, 23);
		panel_2.add(rdbtnPlastic);
		
		JRadioButton rdbtnLidCup = new JRadioButton("Lid Cup");
		rdbtnLidCup.setBounds(123, 96, 80, 23);
		panel_2.add(rdbtnLidCup);
		
		JRadioButton rdbtnCoolerCup = new JRadioButton("Cooler Cup");
		rdbtnCoolerCup.setBounds(239, 96, 102, 23);
		panel_2.add(rdbtnCoolerCup);
		
		final ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnPlastic);
	    group.add(rdbtnLidCup);
	    group.add(rdbtnCoolerCup);
	    
	    final JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
	    chckbxHomeDelivery.setBounds(145, 146, 128, 23);
	    panel_2.add(chckbxHomeDelivery);
	    
	    JLabel label = new JLabel("Enter Quantity");
	    label.setBounds(360, 24, 90, 16);
	    panel_2.add(label);
	    
/* ================================= CHANGE PANEL =================================		
	===============================================================================    */
	    
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(505, 440, 294, 191);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblChange.setBounds(6, 92, 72, 26);
		panel_3.add(lblChange);
		
		JLabel lblTenderedCash = new JLabel("Tendered Cash");
		lblTenderedCash.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblTenderedCash.setBounds(6, 42, 140, 26);
		panel_3.add(lblTenderedCash);
		
		txtFld_TendCash = new JTextField();
		txtFld_TendCash.addKeyListener(new KeyAdapter() {
			

			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				
				if (
					!(Character.isDigit(vchar))
					|| (vchar == KeyEvent.VK_BACK_SPACE)
					|| (vchar == KeyEvent.VK_DELETE)
					) {
					e.consume();
				}
			}
		});
		txtFld_TendCash.setBounds(157, 42, 118, 29);
		panel_3.add(txtFld_TendCash);
		txtFld_TendCash.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(145, 80, 130, 43);
		panel_3.add(lblNewLabel);
		
		JButton button = new JButton("Get Change");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button.setBounds(6, 143, 118, 29);
		panel_3.add(button);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBounds(810, 102, 373, 529);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea txtArea_Receipt = new JTextArea();
		txtArea_Receipt.setBounds(6, 43, 361, 486);
		txtArea_Receipt.setEditable(false);
		txtArea_Receipt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);	    //These three lines add padding to the textarea	
		txtArea_Receipt.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	
		panel_4.add(txtArea_Receipt);
		
		JLabel lbl_Receipt = new JLabel("RECEIPT");
		lbl_Receipt.setBounds(136, 6, 97, 25);
		lbl_Receipt.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		panel_4.add(lbl_Receipt);
		
		JLabel title = new JLabel("Restuarant Billing System");
		title.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		title.setBounds(254, 18, 692, 65);
		frame.getContentPane().add(title);
		
		
/* 		============================= CLEAR BUTTON =============================
 =================================================================================== */		
 
		
		JButton btnClearAll = new JButton("CLEAR ALL");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFldChickBir.setText(null);
				txtFldMutBir.setText(null);
				txtFldChick65.setText(null);
				txtFldChickFriRi.setText(null);
				txtFldChickNood.setText(null);
				txtFldFishBir.setText(null);
				drinksComboBox.setSelectedIndex(0);
				txtFldDrinkQnty.setText(null);
				rdbtnPlastic.setSelected(true);
				chckbxHomeDelivery.setSelected(false);
				txtFld_TendCash.setText(null);
				
				
				
				
			}
		});
		btnClearAll.setBounds(138, 641, 127, 39);
		btnClearAll.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(btnClearAll);
		
		
/* ================================= FOOTER TEXT ==========================
 * ==========================================================================*/		
		
		JLabel footer = new JLabel("Developed by Benjamin Orimoloye");
		footer.setFont(new Font("Lucida Grande", Font.ITALIC, 12));
		footer.setHorizontalAlignment(SwingConstants.RIGHT);
		footer.setForeground(Color.GRAY);
		footer.setBounds(942, 676, 241, 16);
		frame.getContentPane().add(footer);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnTotal.setBounds(577, 643, 127, 39);
		frame.getContentPane().add(btnTotal);
	}
}
