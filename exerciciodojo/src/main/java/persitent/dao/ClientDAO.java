package persitent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import persistent.connection.ConnectionFactory;
import persistent.model.Client;

public class ClientDAO {
	
Connection connection;//criando uma variavel
	
	public ClientDAO(){//criando um metodo de conexão
		this.connection = ConnectionFactory.getConnection();//chamando a classe de conexão
	}
	
	public String salvar(Client client){
		
		String sqlsalvar = "insert into client (name) values(?)";
		try {
			PreparedStatement preparar = connection.prepareStatement(sqlsalvar);
			preparar.setString(1, client.getName());
			preparar.execute();
			
			//System.out.println("Cadastrado com sucesso!!!");
			return "Salvo com sucesso!!!";
		} catch (SQLException e) {
			//e.printStackTrace();
			return "Erro ao Salvar";
		}
	}
}
