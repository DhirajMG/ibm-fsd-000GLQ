package comm.servlet;

import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.*;  
  
public class EmployeeDao {  
	private static javax.sql.DataSource dataSource=null;
	private static Connection connection=null;
	
    public static Connection getConnection(){ 
    	
        Connection connection=null;  
        try{  
        	Context initContext = new InitialContext();
			Object o  = initContext.lookup("java:/comp/env/jdbc/mysql");
			dataSource=(javax.sql.DataSource)o;
			
			 connection= dataSource.getConnection(); 
        }catch(Exception e){System.out.println(e);}  
        return connection;  
    }  
    public static int save(Employee e){  
        int status=0;  
        try{  
            Connection connection=EmployeeDao.getConnection();  
            PreparedStatement ps=connection.prepareStatement(  
                         "insert into emps(name,password,email,country) values (?,?,?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            connection.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Employee e){  
        int status=0;  
        try{  
            Connection connection=EmployeeDao.getConnection();  
            PreparedStatement ps=connection.prepareStatement("update emps set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            connection.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection connection=EmployeeDao.getConnection();  
            PreparedStatement ps=connection.prepareStatement("delete from emps where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            connection.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Employee getEmployeeById(int id){  
        Employee e=new Employee();  
          
        try{  
            Connection connection=EmployeeDao.getConnection();  
            PreparedStatement ps=connection.prepareStatement("select * from emps where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            connection.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Employee> getAllEmployees(){  
        List<Employee> list=new ArrayList<Employee>();  
          
        try{  
            Connection connection=EmployeeDao.getConnection();  
            PreparedStatement ps=connection.prepareStatement("select * from emps");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Employee e=new Employee();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            connection.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
} 