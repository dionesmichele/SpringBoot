package Farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Farmacia.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	/**
	 * 
	 * @param nome
	 * @return retorna lista com todos os nomes independete de estarem maiusculas ou
	 *         minusculas
	 * @since v1.0
	 * @author denise
	 */
	public List<Produto> findAllByDescricaoProdutoContainingIgnoreCase(String descricaoProduto);

}
