package org.springFramework.datasource_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class EmployeeDAO {
	
	@Autowired
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	
	public void createEmployee(Employee employee)
	{
		try {
			
			int ch;
			Scanner scanner = new Scanner(System.in);
			do {
			System.out.println("Enter your choice : 1.Insert 2.Delete 3.Display 4.Exit");
			ch=scanner.nextInt();
			
			switch(ch) {
			case 1: 
			String n;
			int i;
			System.out.println("Enter name and id..");
			n=scanner.next();
			i=scanner.nextInt();
				
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(name,id) values(?,?)");
			pst.setString(1,n);
			pst.setInt(2,i);
			pst.executeUpdate();
			System.out.println("Inserted..!");
			break;
			
			case 2: 
			System.out.println("Enter id to be deleted..");	
			i=scanner.nextInt();
		    Connection connection1=dataSource.getConnection();
			PreparedStatement pst1=connection1.prepareStatement("delete from employee where id=?");
			pst1.setInt(1, i);
			pst1.executeUpdate();
			System.out.println("Deleted..!");
			break;
			
			case 3:
				Connection connection2=dataSource.getConnection();
				PreparedStatement pst2=connection2.prepareStatement("select * from employee");
				ResultSet rs=pst2.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getInt(2));
				}
				break;
				
			case 4: System.out.println("Exiting..!");
			break;
			default : System.out.println("Invalid choice");
			}
			}while(ch != 4);
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

}
