package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Restaurant {
	
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
	
	
	
}
