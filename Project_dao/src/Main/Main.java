package Main;

import java.sql.SQLException;
import java.util.List;

import model.ConnectionManager;
import model.StudenteDAO;
import model.bean.Studente;

public class Main {

	public static void main(String[] args) {
		
		StudenteDAO dao = new StudenteDAO();
		
		//Studente s = new Studente("041/123452", "Davide", "Nigretti", "davidenigretti@gmail.com", 22222);
		
		//dao.aggiungiStudente(s);
		
		List<Studente> elementiSulDatabase = dao.getAllStudente();
		
		for(Studente s : elementiSulDatabase) {
			System.out.println(s);
		}
		try {
			ConnectionManager.getInstance().getConn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}