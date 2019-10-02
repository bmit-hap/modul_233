package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservierung {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rolle_id;	
	
	private int anzahlpersonen;
	
	
	// Die Variablen date und time sind Strings und nicht wie in der Doku,
	// weil es sonst zu umständlich wäre den Erhaltenen Datentyp von der Webseite zu konvertieren
	private String date; 
	private String time;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private int user_id_fk;

	
	/* Habe dies Auskommentiert da ich diese Tabelle nicht erstellen werde, da nicht gefordert 
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private int restaurant_id_fk;
	*/
	

	//Getter und Setter für alle Variablen 
	public int getRolle_id() {
		return rolle_id;
	}

	public void setRolle_id(int rolle_id) {
		this.rolle_id = rolle_id;
	}

	public int getAnzahlpersonen() {
		return anzahlpersonen;
	}

	public void setAnzahlpersonen(int anzahlpersonen) {
		this.anzahlpersonen = anzahlpersonen;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getUser_id_fk() {
		return user_id_fk;
	}

	public void setUser_id_fk(int user_id_fk) {
		this.user_id_fk = user_id_fk;
	}
	
	
	
	
	
}
