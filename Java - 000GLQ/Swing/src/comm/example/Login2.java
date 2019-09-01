package comm.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

import comm.example.dao.EmployeeDaoImpl;
import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login2 {

	private JFrame frame;
	private JTable table;
	private JButton btnGetDepartmentData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
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
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 23, 287, 182);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		frame.setVisible(true);
		
		JButton btnGetData = new JButton("Get Data");
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeDaoImpl emp = new EmployeeDaoImpl();
					ResultSet rs = emp.getResultSet();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnGetData.setBounds(70, 227, 89, 23);
		frame.getContentPane().add(btnGetData);
		
		btnGetDepartmentData = new JButton("Get Department Data");
		btnGetDepartmentData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeDaoImpl emp = new EmployeeDaoImpl();
					ResultSet rs = emp.getResultSet1();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnGetDepartmentData.setBounds(219, 227, 135, 23);
		frame.getContentPane().add(btnGetDepartmentData);
	}
}
