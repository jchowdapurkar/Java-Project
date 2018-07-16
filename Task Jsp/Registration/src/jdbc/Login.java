package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			String dbname = null;
			String dbpassword = null;
			
			String qry = "select * from registration where name=? and password=?";
			Class.forName("com.mysql.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal", "root", "dinga");
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			while(rs.next()) {
				dbname=rs.getString(2);
				dbpassword=rs.getString("password");
				
			}
	       if(name.equals(dbname)&&password.equals(dbpassword))
	       {
	    	   out.println("You Have Succesfully Logged in");
	       }
	       else
	       {
	    	   out.println("Wrong Credentials");
	       }
		
		
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
