package Travelling_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

public class Travelling_S {

	private JFrame frame;
	private JTextField txtFirstname;
	private JTextField txtSurname;
	private JTextField txtAddress;
	private JTextField txtDate;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling_S window = new Travelling_S();
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
	public Travelling_S() {
		initialize();
	 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(0, 0,1360,689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 11, 1332, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("TRAVEL MANAGEMENT SYSTEM");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel_3.setBounds(189, 11, 1040, 59);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(10, 128, 461, 343);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(144, 22, 293, 29);
		panel_1.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(144, 68, 293, 35);
		panel_1.add(txtSurname);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(144, 119, 293, 29);
		panel_1.add(txtAddress);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(144, 172, 293, 29);
		panel_1.add(txtDate);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(144, 223, 293, 29);
		panel_1.add(txtPhoneNumber);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(144, 276, 293, 29);
		panel_1.add(txtEmail);
		
		JLabel lblNewLabel = new JLabel(" Firstname");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 22, 124, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Surname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 68, 110, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(" Date");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(10, 172, 110, 29);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Phone Number");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(10, 223, 124, 29);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Email");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(10, 276, 110, 29);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2 = new JLabel(" Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 126, 95, 22);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 482, 461, 182);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Transport Means");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(20, 11, 147, 24);
		panel_2.add(lblNewLabel_4);
		
		JRadioButton rdbtnPlane = new JRadioButton("Plane");
		rdbtnPlane.setBackground(new Color(192, 192, 192));
		rdbtnPlane.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnPlane.setBounds(20, 42, 109, 23);
		panel_2.add(rdbtnPlane);
		
		JRadioButton rdbtnShip = new JRadioButton("Ship");
		rdbtnShip.setBackground(new Color(192, 192, 192));
		rdbtnShip.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnShip.setBounds(20, 68, 109, 23);
		panel_2.add(rdbtnShip);
		
		JRadioButton rdbtnTrain = new JRadioButton("Train");
		rdbtnTrain.setBackground(new Color(192, 192, 192));
		rdbtnTrain.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnTrain.setBounds(20, 96, 109, 23);
		panel_2.add(rdbtnTrain);
		
		JRadioButton rdbtnTaxPaid = new JRadioButton("Tax Paid");
		rdbtnTaxPaid.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnTaxPaid.setBackground(new Color(192, 192, 192));
		rdbtnTaxPaid.setBounds(42, 129, 96, 23);
		panel_2.add(rdbtnTaxPaid);
		
		JLabel lblNewLabel_5 = new JLabel("Ticket");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(177, 13, 96, 21);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adult");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(302, 13, 55, 21);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Child");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(381, 13, 55, 21);
		panel_2.add(lblNewLabel_7);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBackground(new Color(192, 192, 192));
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnStandard.setBounds(166, 42, 109, 23);
		panel_2.add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setBackground(new Color(192, 192, 192));
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEconomy.setBounds(166, 68, 109, 23);
		panel_2.add(rdbtnEconomy);
		
		JRadioButton rdbtnVip = new JRadioButton("Vip");
		rdbtnVip.setBackground(new Color(192, 192, 192));
		rdbtnVip.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVip.setBounds(166, 96, 109, 23);
		panel_2.add(rdbtnVip);
		
		JRadioButton rdbtnYes1 = new JRadioButton("Yes");
		rdbtnYes1.setBackground(new Color(192, 192, 192));
		rdbtnYes1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnYes1.setBounds(288, 42, 77, 23);
		panel_2.add(rdbtnYes1);
		
		JRadioButton rdbtnTravellingInsurancePaid = new JRadioButton("Travelling Insurance Paid");
		rdbtnTravellingInsurancePaid.setBackground(new Color(192, 192, 192));
		rdbtnTravellingInsurancePaid.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnTravellingInsurancePaid.setBounds(140, 141, 239, 23);
		panel_2.add(rdbtnTravellingInsurancePaid);
		
		JRadioButton rdbtnRegisterLaugage = new JRadioButton("Register Laugage");
		rdbtnRegisterLaugage.setBackground(new Color(192, 192, 192));
		rdbtnRegisterLaugage.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnRegisterLaugage.setBounds(302, 85, 145, 23);
		panel_2.add(rdbtnRegisterLaugage);
		
		JRadioButton rdbtnExitLaugage = new JRadioButton("Exit Laugage");
		rdbtnExitLaugage.setBackground(new Color(192, 192, 192));
		rdbtnExitLaugage.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnExitLaugage.setBounds(302, 111, 128, 23);
		panel_2.add(rdbtnExitLaugage);
		
		JRadioButton rdbtnYes2 = new JRadioButton("Yes");
		rdbtnYes2.setBackground(new Color(192, 192, 192));
		rdbtnYes2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnYes2.setBounds(370, 44, 66, 23);
		panel_2.add(rdbtnYes2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(481, 169, 452, 444);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel(" Departure Point");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(10, 27, 142, 28);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel(" Destination");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8_1.setBounds(10, 80, 142, 28);
		panel_3.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel(" Accomodation");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8_2.setBounds(10, 144, 142, 28);
		panel_3.add(lblNewLabel_8_2);
		
		JComboBox DeparturePoint = new JComboBox();
		DeparturePoint.setFont(new Font("Tahoma", Font.BOLD, 15));
		DeparturePoint.setModel(new DefaultComboBoxModel(new String[] {"None", "Yaounde", "Douala", "Ngoundere", "Kumba", "Limbe", "Ebolowa"}));
		DeparturePoint.setBounds(173, 26, 257, 36);
		panel_3.add(DeparturePoint);
		
		JComboBox Destination = new JComboBox();
		Destination.setFont(new Font("Tahoma", Font.BOLD, 15));
		Destination.setModel(new DefaultComboBoxModel(new String[] {"None", "Nigeria _ 2 Days in Lagos", "Ghana_  2 Days in Accra", "Kenya_  3 Days in Nairobi", "Congo_ 2 Days in Kinshasa", "USA _ 5 Days in Boston", "UK _ 4 Days in London", "France _ 4 Days in Paris", "Canada _ 5 Days in Ottawa", "Italy_ 4 Days in Roma", "Brazil _ 5 Days in Rio"}));
		Destination.setBounds(173, 79, 257, 36);
		panel_3.add(Destination);
		
		JComboBox Accomodation = new JComboBox();
		Accomodation.setFont(new Font("Tahoma", Font.BOLD, 15));
		Accomodation.setModel(new DefaultComboBoxModel(new String[] {"None", "Single", "Double", "Extra"}));
		Accomodation.setBounds(173, 143, 257, 36);
		panel_3.add(Accomodation);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTax.setBounds(30, 221, 91, 28);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubTotal.setBounds(30, 275, 101, 28);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal.setBounds(30, 326, 89, 26);
		panel_3.add(lblTotal);
		
		JLabel txtTax = new JLabel(" ");
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTax.setBounds(173, 221, 257, 38);
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(txtTax);
		
		JLabel txtSubTotal = new JLabel(" ");
		txtSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtSubTotal.setBounds(173, 272, 257, 38);
		panel_3.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel(" ");
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtTotal.setBounds(173, 322, 257, 38);
		panel_3.add(txtTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double Nigeria = 270;
				double Ghana = 320;
			    double Kenya = 530;
			    double Congo = 340;
			    double USA = 760;
			    double UK = 650;
			    double France = 610;
			    double Canada = 780;
			    double Italy = 670;
			    double Brazil = 800;
			    
			    
			    double Acc_Single = 45;
			    double Acc_Double = 45;
			    double Acc_Extra = 45;
			    
			    double Plane = 5.5;
			    double Ship = 4.1;
			    double Train = 3.1;
			    
			    double standard = 2.5;
			    double Economy = 65.5;	    		
			    double  Vip = 122.5;
			    
			    
			    double TaxPaid = 6.7;
			    double TravellingInsurancePaid = 62.4;
			    double RegisterLaugage = 25.9;
			    double ExitLaugage = 25.9;
			    
			    
			    double[] TravelCost = new double[120];
			    double iTax = 4.5;
			    
			    if ((Destination.getSelectedItem().equals("Nigeria _ 2 Days in Lagos")) &&
			    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
			    {
			    
			    	TravelCost[0] = Nigeria + Acc_Single + Plane;
			    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
			    	String sTax = String.format("$%.2f", TravelCost[1]);
			    	txtTax.setText(sTax);
			    	String subTotal = String.format("$%.2f", TravelCost[0]); 
			    	txtSubTotal.setText(subTotal);
			    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
			    	txtTotal.setText(Total);	    	
			    	
			    	
			    }
			    
			  
			     if ((Destination.getSelectedItem().equals("Nigeria _ 2 Days in Lagos")) &&
			    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
			    {
			    
			    	TravelCost[0] = Nigeria + Acc_Single + Plane  + TaxPaid ;
			    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
			    	String sTax = String.format("$%.2f", TravelCost[1]);
			    	txtTax.setText(sTax);
			    	String subTotal = String.format("$%.2f", TravelCost[0]); 
			    	txtSubTotal.setText(subTotal);
			    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
			    	txtTotal.setText(Total);	    	
			    	
			    	
			    }
			  
			     if ((Destination.getSelectedItem().equals("Nigeria _ 2 Days in Lagos")) &&
			    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
			    {
			    
			    	TravelCost[0] = Nigeria + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
			    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
			    	String sTax = String.format("$%.2f", TravelCost[1]);
			    	txtTax.setText(sTax);
			    	String subTotal = String.format("$%.2f", TravelCost[0]); 
			    	txtSubTotal.setText(subTotal);
			    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
			    	txtTotal.setText(Total);	    	
			    	 
			    
			    }
			     if ((Destination.getSelectedItem().equals("Nigeria _ 2 Days in Lagos")) &&
			    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
			    {
			    
			    	TravelCost[0] = Nigeria + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
			    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
			    	String sTax = String.format("$%.2f", TravelCost[1]);
			    	txtTax.setText(sTax);
			    	String subTotal = String.format("$%.2f", TravelCost[0]); 
			    	txtSubTotal.setText(subTotal);
			    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
			    	txtTotal.setText(Total);	    	
			    	 
			    }
			     if ((Destination.getSelectedItem().equals("Nigeria _ 2 Days in Lagos")) &&
			    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
			    {
			    
			    	TravelCost[0] = Nigeria + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
			    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
			    	String sTax = String.format("$%.2f", TravelCost[1]);
			    	txtTax.setText(sTax);
			    	String subTotal = String.format("$%.2f", TravelCost[0]); 
			    	txtSubTotal.setText(subTotal);
			    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
			    	txtTotal.setText(Total);
			    
			    
			   			    }
			      // This is for the next country so we are going to call that country 2
			     
			     //................................... country 2 ........................................	     
			     
				    if ((Destination.getSelectedItem().equals("Ghana_  2 Days in Accra")) &&
				    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected()) 
				            
		                    		    
				    {
				    
				    	TravelCost[0] = Ghana + Acc_Single + Plane;
				    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
				    	String sTax = String.format("$%.2f", TravelCost[1]);
				    	txtTax.setText(sTax);
				    	String subTotal = String.format("$%.2f", TravelCost[0]); 
				    	txtSubTotal.setText(subTotal);
				    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
				    	txtTotal.setText(Total);	    	
				    	
				    	
				    }
			     
				    if ((Destination.getSelectedItem().equals("Ghana_  2 Days in Accra")) &&
				    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
				    {
				    
				    	TravelCost[0] = Ghana + Acc_Single + Plane  + TaxPaid ;
				    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
				    	String sTax = String.format("$%.2f", TravelCost[1]);
				    	txtTax.setText(sTax);
				    	String subTotal = String.format("$%.2f", TravelCost[0]); 
				    	txtSubTotal.setText(subTotal);
				    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
				    	txtTotal.setText(Total);	    	
				    	
				    	
				    }
			     
				    
				     if ((Destination.getSelectedItem().equals("Ghana_  2 Days in Accra")) &&
				    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
				    {
				    
				    	TravelCost[0] = Ghana + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
				    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
				    	String sTax = String.format("$%.2f", TravelCost[1]);
				    	txtTax.setText(sTax);
				    	String subTotal = String.format("$%.2f", TravelCost[0]); 
				    	txtSubTotal.setText(subTotal);
				    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
				    	txtTotal.setText(Total);	    	
				    	 
				    
				    }
				     if ((Destination.getSelectedItem().equals("Ghana_  2 Days in Accra")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Ghana + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
				     if ((Destination.getSelectedItem().equals("Ghana_  2 Days in Accra ")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Ghana + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
				     
				     //................................... country 3 ........................................
				     if ((Destination.getSelectedItem().equals("Kenya_  3 Days in Nairobi")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = Kenya + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }

					    if ((Destination.getSelectedItem().equals("Kenya_  3 Days in Nairobi")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = Kenya + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Kenya_  3 Days in Nairobi")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = Kenya + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    
					    }
					    if ((Destination.getSelectedItem().equals("Kenya_  3 Days in Nairobi")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Kenya + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Kenya_  3 Days in Nairobi ")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Kenya + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    
					    //................................... country 4........................................
					    if ((Destination.getSelectedItem().equals("Congo_ 2 Days in Kinshasa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = Congo + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Congo_ 2 Days in Kinshasa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = Congo + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Congo_ 2 Days in Kinshasa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = Congo + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    
					    if ((Destination.getSelectedItem().equals("Congo_ 2 Days in Kinshasa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Congo + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    
					    if ((Destination.getSelectedItem().equals("Congo_ 2 Days in Kinshasa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Congo + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    //................................... country 5........................................
					    if ((Destination.getSelectedItem().equals("USA _ 5 Days in Boston")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = USA + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("USA _ 5 Days in Boston")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = USA + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("USA _ 5 Days in Boston")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = USA + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("USA _ 5 Days in Boston")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = USA + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("USA _ 5 Days in Boston")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = USA + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    //................................... country 6........................................
					    if ((Destination.getSelectedItem().equals("UK _ 4 Days in London")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = UK + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("UK _ 4 Days in London")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = UK + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("UK _ 4 Days in London")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = UK + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("UK _ 4 Days in London")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = UK + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("UK _ 4 Days in London")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = UK + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    
					    //................................... country 7........................................
					    if ((Destination.getSelectedItem().equals("France _ 4 Days in Paris")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = France + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("France _ 4 Days in Paris")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = France + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("France _ 4 Days in Paris")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = France + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("France _ 4 Days in Paris")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = France + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("France _ 4 Days in Paris")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = France + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    //................................... country 8........................................
					    if ((Destination.getSelectedItem().equals("Canada _ 5 Days in Ottawa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = Canada + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Canada _ 5 Days in Ottawa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = Canada + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Canada _ 5 Days in Ottawa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = Canada + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Canada _ 5 Days in Ottawa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Canada + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Canada _ 5 Days in Ottawa")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Canada + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    //................................... country 9........................................
					    if ((Destination.getSelectedItem().equals("Italy_ 4 Days in Roma")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = Italy + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Italy_ 4 Days in Roma")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = Italy + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Italy_ 4 Days in Roma")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = Italy + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Italy_ 4 Days in Roma")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Italy + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Italy_ 4 Days in Roma")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Italy + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    //................................... country 10........................................
					    if ((Destination.getSelectedItem().equals("Brazil _ 5 Days in Rio")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected())
					    {
					    
					    	TravelCost[0] = Brazil + Acc_Single + Plane;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Brazil _ 5 Days in Rio")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTaxPaid.isSelected())
					    {
					    
					    	TravelCost[0] = Brazil + Acc_Single + Plane  + TaxPaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	
					    	
					    }
					    if ((Destination.getSelectedItem().equals("Brazil _ 5 Days in Rio")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnTravellingInsurancePaid.isSelected())
					    {
					    
					    	TravelCost[0] = Brazil + Acc_Single + Plane  + TaxPaid + TravellingInsurancePaid ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Brazil _ 5 Days in Rio")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnRegisterLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Brazil + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    if ((Destination.getSelectedItem().equals("Brazil _ 5 Days in Rio")) &&
					    		Accomodation.getSelectedItem().equals("Single") && rdbtnPlane.isSelected() && rdbtnExitLaugage.isSelected())
					    {
					    
					    	TravelCost[0] = Brazil + Acc_Single + Plane + TaxPaid + TravellingInsurancePaid + RegisterLaugage + ExitLaugage ;
					    	TravelCost[1] = ((TravelCost[0] * iTax)/100);	    	
					    	String sTax = String.format("$%.2f", TravelCost[1]);
					    	txtTax.setText(sTax);
					    	String subTotal = String.format("$%.2f", TravelCost[0]); 
					    	txtSubTotal.setText(subTotal);
					    	String Total = String.format("$%.2f", TravelCost[0] + TravelCost[1]);
					    	txtTotal.setText(Total);	    	
					    	 
					    }
					    
					    
			    	
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(30, 387, 101, 36);
		panel_3.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTax.setText(null);
				txtSubTotal.setText(null);				
				txtTotal.setText(null);				
				txtFirstname.setText(null);
				txtSurname.setText(null);
				txtAddress.setText(null);
				txtDate.setText(null);
				txtPhoneNumber.setText(null);
				txtEmail.setText(null);
				rdbtnPlane.setSelected(false);
				rdbtnShip.setSelected(false);
				rdbtnTrain.setSelected(false);
				rdbtnTaxPaid.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnVip.setSelected(false);
				rdbtnTravellingInsurancePaid.setSelected(false);
				rdbtnYes1.setSelected(false);
				rdbtnYes2.setSelected(false);
				rdbtnRegisterLaugage.setSelected(false);
				rdbtnExitLaugage.setSelected(false);
				DeparturePoint.setSelectedItem("None");				
				Destination.setSelectedItem("None");
				Accomodation.setSelectedItem("None");
				 

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(306, 387, 101, 36);
		panel_3.add(btnReset);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(943, 137, 399, 527);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setBounds(21, 460, 101, 39);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(275, 460, 101, 39);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit" , "TRAVEL MANAGEMENT SYSTEM",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(btnExit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 21, 355, 428);
		panel_4.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_5, null);
		
		JLabel lblNewLabel_9 = new JLabel("Receipt");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setBounds(943, 114, 87, 23);
		frame.getContentPane().add(lblNewLabel_9);
	}
}
