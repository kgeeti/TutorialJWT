/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Repositório Produto
 */
package br.eti.kge.tutorialJWT.domain.repository;

import br.eti.kge.tutorialJWT.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório Produto
 * @author KGe
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
