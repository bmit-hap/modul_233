package databaseService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Reservierung;
import model.User;

@Repository
public interface ReservierungRepository extends JpaRepository<Reservierung, Integer> {
	
	//Repository Reservierung
		
}
