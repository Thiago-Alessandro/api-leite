package net.weg.apivendalacteos.repository;

import net.weg.apivendalacteos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

}
