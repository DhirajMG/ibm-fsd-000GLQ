package comm.example;

import java.sql.SQLException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import comm.example.dao.EmployeeDaoImpl;
import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField Eid;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField Email;
	private JTextField delete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(50, 35, 67, 20);
		frame.getContentPane().add(lblEmployeeId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(50, 66, 67, 20);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(50, 97, 67, 20);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 128, 67, 20);
		frame.getContentPane().add(lblEmail);
		
		Eid = new JTextField();
		Eid.setBounds(199, 35, 113, 20);
		frame.getContentPane().add(Eid);
		Eid.setColumns(10);
		
		Fname = new JTextField();
		Fname.setBounds(199, 66, 113, 20);
		frame.getContentPane().add(Fname);
		Fname.setColumns(10);
		
		Lname = new JTextField();
		Lname.setBounds(197, 97, 115, 20);
		frame.getContentPane().add(Lname);
		Lname.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(199, 128, 113, 20);
		frame.getContentPane().add(Email);
		Email.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					MyConnectionFactory factory;
					factory = MyConnectionFactory.createObject();
					Connection connection = factory.getConnection();
					PreparedStatement pStatement = connection.prepareStatement("insert into emp values (?,?,?,?)");
					pStatement.setInt(1, Integer.parseInt(Eid.getText()));
					pStatement.setString(2, Fname.getText());
					pStatement.setString(3, Lname.getText());
					pStatement.setString(4, Email.getText());
					int count = pStatement.executeUpdate();
					System.out.println(count + "row(s) updated");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
		}});
		btnAddEmployee.setBounds(66, 187, 101, 33);
		frame.getContentPane().add(btnAddEmployee);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(188, 187, 106, 33);
		frame.getContentPane().add(btnReset);
		
		JLabel lblIdToDelete = new JLabel("ID to delete");
		lblIdToDelete.setBounds(340, 49, 69, 20);
		frame.getContentPane().add(lblIdToDelete);
		
		delete = new JTextField();
		delete.setBounds(322, 66, 86, 20);
		frame.getContentPane().add(delete);
		delete.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					MyConnectionFactory factory;
					factory = MyConnectionFactory.createObject();
					Connection connection = factory.getConnection();
					PreparedStatement pStatement = connection.prepareStatement("delete from emp where id=?");
					pStatement.setInt(1, Integer.parseInt(delete.getText()));
					int count = pStatement.executeUpdate();
					System.out.println(count + "row(s) deleted");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnDelete.setBounds(322, 96, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnDisplayData = new JButton("Display Data");
		btnDisplayData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Login2();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDisplayData.setBounds(304, 189, 103, 28);
		frame.getContentPane().add(btnDisplayData);
	}
	
}
