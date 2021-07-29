package Farmacia.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Farmacia.farmacia.model.Produto;
import Farmacia.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repositoryProduto;

	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(repositoryProduto.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id) {
		return repositoryProduto.findById(id).map(resp -> ResponseEntity.ok(resp)) // resp = id | -> então me responda
																						// ok se o resp for achado
				.orElse(ResponseEntity.notFound().build()); // caso não encontrar, builda a resposta
	}
	
	@GetMapping("/descricaoProduto/{descricaoProduto}")
	public ResponseEntity<List<Produto>> getByDescricaoProduto(@PathVariable String descricaoProduto)
	{
		return ResponseEntity.ok(repositoryProduto.findAllByDescricaoProdutoContainingIgnoreCase(descricaoProduto));
	}

	@PostMapping
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {

		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryProduto.save(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> putProduto(@RequestBody Produto produto) {

		return ResponseEntity.status(HttpStatus.OK).body(repositoryProduto.save(produto));
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {

		repositoryProduto.deleteById(id);
	}
}
