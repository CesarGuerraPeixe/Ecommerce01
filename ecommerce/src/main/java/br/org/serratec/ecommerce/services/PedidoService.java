package br.org.serratec.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.entities.Pedido;
import br.org.serratec.ecommerce.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;

	

	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	public Pedido findById(Integer id) {
		return pedidoRepository.findById(id).get();
	}

	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public Pedido update(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public void delete(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}

	public void deleteById(Integer id) {
		pedidoRepository.deleteById(id);
	}

	public long count() {
		return pedidoRepository.count();
	}

	public boolean deleteById2(Integer id) {
		if (pedidoRepository.existsById(id)) {
			pedidoRepository.deleteById(id);
			Pedido pedidoDeletado = pedidoRepository.findById(id).orElse(null);
			if (pedidoDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
