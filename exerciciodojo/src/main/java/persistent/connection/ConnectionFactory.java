package persistent.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
public static Connection getConnection(){
		
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException excpt){
			System.out.println("Erro ao carregar driver do postgresql!!!");
			excpt.printStackTrace();
		}
			
			try {
				Connection connectSql;
				connectSql = DriverManager.getConnection("jdbc:postgresql:"
						+"//localhost:5432/dojo","postgres","admin");
				System.out.println("Conectado");
				return connectSql;
				
			} catch (SQLException excpt) {
				throw new RuntimeException("Não Conectado", excpt);
		}
	}

}
