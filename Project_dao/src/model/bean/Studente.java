package model.bean;

public class Studente {
	
	//POJO PLAIN OLD JAVA OBJECT
	
	private String matricola;
	private String nome;
	private String cognome;
	private String email;
	private int pin;
	
	public Studente() {
		this.matricola = "nessuna";
		this.nome = "xxxxxx";
		this.cognome = "xxxxxx";
		this.email = "xxxxxx";
		this.pin = 0; //inutile
	}

	public Studente(String matricola, String nome, String cognome, String email, int pin) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.pin = pin;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", pin=" + pin + "]";
	}
	
	
}