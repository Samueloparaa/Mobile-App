package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Travelling_Sys.Travelling_S;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(139, 69, 19));
		frame.setBounds(200, 200, 532, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Login System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(163, 11, 210, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsername.setBounds(25, 80, 99, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(22, 173, 102, 34);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUsername.setBounds(163, 85, 292, 34);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPassword.setBounds(160, 173, 295, 38);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();			
				String username = txtUsername.getText();
				
				if (password.contains("Smith") && username.contains("one")){
				   txtPassword.setText(null);					
				   txtUsername.setText(null);
					
				  Travelling_S info = new Travelling_S();
				  Travelling_S.main(null);
				   
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);					
					txtUsername.setText(null);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(25, 267, 89, 43);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(199, 267, 89, 43);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame = new JFrame("Exit");
				 if (JOptionPane.showConfirmDialog(frame , "Confirm if you want to exit" , "Login System",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				 System.exit(0);
				 
				 }
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(382, 267, 89, 43);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 233, 481, 0);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 244, 496, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 65, 496, 2);
		frame.getContentPane().add(separator_1_1);
	}
}
