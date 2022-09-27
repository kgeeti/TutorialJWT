package br.eti.kge.tutorialJWT;

/**
 * Classe teste para criar usuário no database
 * Para executar este teste, colocar no TestPackages e executar o teste com 
 * botão direito em cima do projeto - Test (Alt+F6) ou Clean & Rebuild
 * @author kge
 */

import static org.assertj.core.api.Assertions.assertThat;

import br.eti.kge.tutorialJWT.domain.model.User;
import br.eti.kge.tutorialJWT.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
public class UserRepositoryTests {
 
    @Autowired private UserRepository userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryTests.class);
    
    @Test
    public void testCreateUser() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("kge1234");
         
        User newUser = new User("professor@kge.local", password);
        User savedUser = userRepository.save(newUser);
        
        
        LOGGER.info("Teste1234 executado#");
        
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
