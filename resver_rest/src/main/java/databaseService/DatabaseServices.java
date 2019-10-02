package databaseService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface DatabaseServices extends JpaRepository<User , Integer> {


	
}
