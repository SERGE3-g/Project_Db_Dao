package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.bean.Studente;
import java.util.*;

public class StudenteDAO {

	private Connection conn;
	
	public StudenteDAO() {
		this.conn = ConnectionManager.getInstance().getConn(); 
	}
	
	public List<Studente> getAllStudente(){
		
		List<Studente> studenti = new ArrayList<>();
		
		try (Statement stmt = this.conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM studente;")){
			
			while(rs.next()) {
				Studente s = new Studente();
				
				//s.setMatricola(rs.getString(1));
				s.setMatricola(rs.getString("matricola"));
				s.setNome(rs.getString("nome"));
				s.setCognome(rs.getString("cognome"));
				s.setEmail(rs.getString("email"));
				s.setPin(rs.getInt("pin"));
				
				studenti.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return studenti;
	}
	
	
	public void aggiungiStudente(Studente studente) {
		String insert = "INSERT INTO studente VALUES ('" + studente.getMatricola() + "', '"
														+ studente.getNome() + "', '" 
														+ studente.getCognome() + "', '" 
														+ studente.getEmail() + "', " 
														+ studente.getPin() + ");";
		int risultato = 0;
		try (Statement stmt = this.conn.createStatement()){
			risultato = stmt.executeUpdate(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(risultato > 0) {
			System.out.println(risultato + " row(s) affected");
		} else {
			System.out.println("qualcosa è andato storto, nessuna aggiunta avvenuta!");
		}
	}
}