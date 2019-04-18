package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.yash.model.Login;
import com.yash.model.User;


public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
	  
	JdbcTemplate template;
	
	  
	 public String registerUser(User user) {
	    
		String insertStatus="Failure";
		String sql = "insert into user_registration values(?,?,?,?,?,?,?)";
	    template.update(sql, new Object[] { user.getUserName(), user.getUserPassword(), user.getUserType(),
	    user.getUserEmail(), user.getUserAddress(), user.getUserCity(), user.getUserContact() });
	    insertStatus="Success";
	    return insertStatus;  
	  	}
	    
	
	  public Login validateUser(String userName)  {
		
		  
		  String sql="select * from user_registration where userName=?";  
		  
		  return template.queryForObject(sql, new Object[]{userName},new BeanPropertyRowMapper<Login>(Login.class));  
		  
		  
	  	}   
	  public List<Login> getUsers(){  
		    return template.query("select * from user_registration",new RowMapper<Login>(){  
		        
		    	public Login mapRow(ResultSet rs, int row) throws SQLException {  
		            Login login=new Login();  
		            login.setUserName(rs.getString("userName"));  
		            
		            
		            return login;  
		        }  
		    });  
	  
	  }
}

