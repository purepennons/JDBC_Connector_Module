package JDBC_DB;

public class DB_Conf {
	
	//parameters setup
	private String JDBC_Driver = "com.mysql.jdbc.Driver";
	private String DB_TYPE = "mysql";
	private String domain = "localhost";
	private String port = "8889";
	private String useDB = "bill";
	private String username = "local";
	private String password = "123";
	
	//constructor
	public DB_Conf(){
	
	}
	
	//set and get function
	public void setJDBC_Driver(String driver){
		if(driver != ""){
			this.JDBC_Driver = driver;
		}
	}
	
	public String getJDBC_Driver(){
		if(this.JDBC_Driver != ""){
			return this.JDBC_Driver;
		}
		return null;
	}
	
	public void setDB_TYPE(String type){
		if(type != ""){
			this.DB_TYPE = type;
		}
	}
	
	public String getDB_TYPE(){
		if(this.DB_TYPE != ""){
			return this.DB_TYPE;
		}
		return null;
	}
	
	public void setDomain(String d){
		if(d != ""){
			this.domain = d;
		}
	}
	
	public String getDomain(){
		if(this.domain != ""){
			return this.domain;
		}
		return null;
	}
	
	public void setPort(String port){
		if(port != ""){
			this.port = port;
		}
	}
	
	public String getPort(){
		if(this.port != ""){
			return this.port;
		}
		return null;
	}
	
	public void setUseDB(String dbName){
		if(dbName != ""){
			this.useDB = dbName;
		}
	}
	
	public String getUseDB(){
		if(this.useDB != ""){
			return this.useDB;
		}
		return null;
	}
	
	public void setUsername(String usr){
		if(usr != ""){
			this.username = usr;
		}
	}
	
	public void setPassword(String pw){
		if(pw != ""){
			this.password = pw;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
