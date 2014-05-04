package JDBC_DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {
	private DB_Conf conf = null;
	private Connection conn = null;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	//constructor
	public DB_Connect(){
		this.conf = new DB_Conf();
	}
	
	public DB_Connect(DB_Conf conf){
		if(conf != null){
			this.conf = conf;
		}
	}
	
	//set/get functions
	public Connection getConn(){
		if(this.conn != null){
			return this.conn;
		}
		return null;
	}
	
	public Statement getSt(){
		if(this.st != null){
			return this.st;
		}
		return null;
	}
	
	public PreparedStatement getPst(){
		if(this.pst != null){
			return this.pst;
		}
		return null;
	}
	
	public ResultSet getRs(){
		if(rs != null){
			return this.rs;
		}
		return null;
	}
	
	//main functions
	public boolean init() throws ClassNotFoundException, SQLException{
		if(this.conf != null){
			Class.forName(this.conf.getJDBC_Driver());
			this.conn = DriverManager.getConnection(this.conf.getURL(), this.conf.getUsername(), this.conf.getPassword());
			return true;
		}
		return false;
	}
	
	
	
//	public static void main(String[] args){
//		DB_Conf conf = new DB_Conf();
//		System.out.println(conf.getURL());
//	}

}
