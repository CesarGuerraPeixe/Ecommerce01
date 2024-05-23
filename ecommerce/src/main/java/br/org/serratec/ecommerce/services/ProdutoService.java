package br.org.serratec.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.entities.Produto;
import br.org.serratec.ecommerce.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	ImageService imageService;
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto findById(Integer id) {
		return produtoRepository.findById(id).get();
	}

	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	public Produto update(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void delete(Produto produto) {
		produtoRepository.delete(produto);
	}

	public void deleteById(Integer id) {
		produtoRepository.deleteById(id);
	}

	public long count() {
		return produtoRepository.count();
	}

	public boolean deleteById2(Integer id) {
		if (produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
			Produto produtoDeletado = produtoRepository.findById(id).orElse(null);
			if (produtoDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}