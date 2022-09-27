/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Controller ProdutoController
 */
package br.eti.kge.tutorialJWT.controller;

import br.eti.kge.tutorialJWT.domain.model.Produto;
import br.eti.kge.tutorialJWT.domain.repository.ProdutoRepository;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementa RestController de Produto
 * @author KGe
 */
@RestController
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @GetMapping("/produto")
    public List<Produto> showAllProduto() {
        return produtoRepository.findAll();
    }

    @PostMapping("/produto")
    public ResponseEntity<Produto> create(@RequestBody @Valid Produto produto) {
        Produto savedProduto = produtoRepository.save(produto);
        URI productURI = URI.create("/produto/" + savedProduto.getId());
        return ResponseEntity.created(productURI).body(savedProduto);
    }
    
    @GetMapping("/produto/{produtoId}")
    public ResponseEntity<Produto> showCliente(@PathVariable Long produtoId) {
        Optional<Produto> produto = produtoRepository.findById(produtoId);
        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // TODO Implementar metodo showById
    // TODO Implementar métodos PUT DELETE
    
    
}
