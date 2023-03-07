package Cadastros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class Dao {
	
	Connection con; //Conexão ao BD
	PreparedStatement stmt; // Acessa Tabela (insert, update, delete, select)
	ResultSet rs; //Consulta Tabela
	CallableStatement call; //Procedures e Function
	
	
}
