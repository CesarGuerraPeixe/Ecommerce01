package br.org.serratec.ecommerce.services;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.org.serratec.ecommerce.entities.Image;
import br.org.serratec.ecommerce.entities.Produto;
import br.org.serratec.ecommerce.repositories.ImageRepository;
import br.org.serratec.ecommerce.repositories.ProdutoRepository;
import jakarta.transaction.Transactional;

@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public Image insere(Produto produto, MultipartFile file) throws IOException {
		Image image = new Image();
		image.setNome(file.getName());
		image.setTipo(file.getContentType());
		image.setDados(file.getBytes());
		image.setProduto(produto);
		return imageRepository.save(image);
	}

	@Transactional
	public Image findByIdProduto(Integer id) {
		// Produto produto = new Produto();
		// Produto.setId(id);

		Produto produto = produtoRepository.findById(id).orElse(null);
		Optional<Image> image = imageRepository.findByProduto(produto);
		if (!image.isPresent()) {
			return null;
		}
		return image.get();
	}
}
