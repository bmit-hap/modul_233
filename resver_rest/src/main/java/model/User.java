package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	//@ID Gibt den Primärschlüssel einer Entität 
	//@GeneratedValue Gibt die Spezifikation von Generierungsstrategien für die Werte von Primärschlüsseln an. 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	//@ManytoOne zeigt auf in welcher Beziehung die Entitäten zu einander stehen 
	//Hier Mehrere zu eins, dass heisst das ein User nur Eine rolle haben kann aber mehrere User können die Gleiche rolle haben
	//Hier ist mir in der Planung ein Denkfehler unterlaufen ( In der Doku 1zu1) zum Glück habe ich es hier bemerkt
	@ManyToOne
	@JoinColumn(name = "rolle_id")
	private int rolle_id_fk;
	
	// String für Nachname, Vorname usw. 
	private String nachname;
	private String vorname;
	private String login_name;
	private String passwort;
	
	//Getter und Setter für alle Variablen 
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRolle_id_fk() {
		return rolle_id_fk;
	}
	public void setRolle_id_fk(int rolle_id_fk) {
		this.rolle_id_fk = rolle_id_fk;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	
}
