package pro_ev3;
import java.sql.*;

import javax.swing.*;
public class SQL {

	private String url = "jdbc:mysql://localhost:3306/almacen";
	private String usu = "root";
	private String pwd = "";
	private Connection con = null;
	
	public Connection conectar(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usu, pwd);
			JOptionPane.showMessageDialog(null, "Conexión establecida");
		}catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
		return con;
	}
	
	ResultSet rs = null;
	Statement st = null;
	
	public void select(String sentencia, String encabezados, String colum1, String colum2) throws ClassNotFoundException{
		try{
			st = con.createStatement();
			rs = st.executeQuery(sentencia);
			System.out.println(encabezados);
			while(rs.next()){
				String art, cod;
				art = rs.getString(colum1);
				cod = rs.getString(colum2);
				System.out.println(art+" - "+cod);
			}
			rs.last();
			JOptionPane.showMessageDialog(null, rs.getRow()+" registros encontrados");
			rs.close();
			st.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}	
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		SQL sql = new SQL();
		sql.conectar();
		String sentencia = "SELECT * FROM articulos";
		String encabezados = "ARTÍCULO - FABRICANTE";
		String colum1 = "articulo";
		String colum2 = "cod_fabricante";
		sql.select(sentencia, encabezados, colum1, colum2);
	}

}
