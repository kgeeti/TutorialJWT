package br.eti.kge.tutorialJWT.domain.repository;

import br.eti.kge.tutorialJWT.domain.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório User
 * @author KGe
 */
public interface UserRepository extends JpaRepository <User, Long> {
    
    Optional<User> findByEmail(String email);
    
}
