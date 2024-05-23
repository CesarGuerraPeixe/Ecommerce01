package br.org.serratec.ecommerce.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.entities.ItemPedido;
import br.org.serratec.ecommerce.entities.Pedido;
import br.org.serratec.ecommerce.exception.ResourceNotFoundException;
import br.org.serratec.ecommerce.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;


    public Pedido salvarPedido(Pedido pedido) {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : pedido.getItensPedidos()) {
            BigDecimal valorBruto = item.getPrecoVenda().multiply(BigDecimal.valueOf(item.getQuantidade()));
            BigDecimal valorDesconto = valorBruto.multiply(item.getPercentualDesconto().divide(BigDecimal.valueOf(100)));
            BigDecimal valorLiquido = valorBruto.subtract(valorDesconto);

            item.setValorBruto(valorBruto);
            item.setValorLiquido(valorLiquido);
            valorTotal = valorTotal.add(valorLiquido);
        }
        pedido.setValorTotal(valorTotal);
        pedido.setStatus(false);
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizarStatus(Integer pedidoId, boolean novoStatus) {
        Pedido pedido = pedidoRepository.findById(pedidoId)
                .orElseThrow(() -> new ResourceNotFoundException("Pedido não encontrado com id: " + pedidoId));
        pedido.setStatus(novoStatus);
        return pedidoRepository.save(pedido);
    }

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
