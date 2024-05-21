package br.org.serratec.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.entities.ItemPedido;
import br.org.serratec.ecommerce.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {

	@Autowired
	ItemPedidoRepository itemPedidoRepository;

	public List<ItemPedido> findAll() {
		return itemPedidoRepository.findAll();
	}

	public ItemPedido findById(Integer id) {
		return itemPedidoRepository.findById(id).get();
	}

	public ItemPedido save(ItemPedido itemPedido) {
		return itemPedidoRepository.save(itemPedido);
	}

	public ItemPedido update(ItemPedido itemPedido) {
		return itemPedidoRepository.save(itemPedido);
	}

	public void delete(ItemPedido itemPedido) {
		itemPedidoRepository.delete(itemPedido);
	}

	public void deleteById(Integer id) {
		itemPedidoRepository.deleteById(id);
	}

	public long count() {
		return itemPedidoRepository.count();
	}

	public boolean deleteById2(Integer id) {
		if (itemPedidoRepository.existsById(id)) {
			itemPedidoRepository.deleteById(id);
			ItemPedido itemPedidoDeletado = itemPedidoRepository.findById(id).orElse(null);
			if (itemPedidoDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
