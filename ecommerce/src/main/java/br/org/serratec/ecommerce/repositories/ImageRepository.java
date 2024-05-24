package br.org.serratec.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.ecommerce.entities.Image;
import br.org.serratec.ecommerce.entities.Produto;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
	public Optional<Image> findByProduto(Produto produto);

}