package persistent.dao;

import persistent.model.Client;
import persitent.dao.ClientDAO;

public class TestClientDao {
	
	public static void main(String[] args) {
		
		ClientDAO clientDao = new ClientDAO();
		Client client = new Client();
			client.setName("Anderson");
		String result = clientDao.salvar(client);
		System.out.println(result);
	}
}
