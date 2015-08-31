package ent_ev1;
import java.sql.*;

import javax.swing.*;
public class Conectar {

	Connection con = null;
	
	public Connection sql(String url, String usu, String pwd){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,usu,pwd);
			JOptionPane.showMessageDialog(null, "Conexión establecida");
		}catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null, "Error : "+e);
		}
		return con;
	}
	
	public static void main(String[] args) {
		Conectar conectar = new Conectar();
		conectar.sql("jdbc:mysql://localhost:3306/regantes","root","");

	}

}
