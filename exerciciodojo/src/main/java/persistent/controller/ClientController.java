package persistent.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistent.model.Client;
import persitent.dao.ClientDAO;

@WebServlet("/client") // nome publico digitado pelo usuario url
public class ClientController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		ClientDAO clientDao = new ClientDAO();
		Client client = new Client();
		client.setName(req.getParameter("name"));
		String result = clientDao.salvar(client);
		System.out.println(result);
		resp.getWriter().print(result);
	}
}
