package br.org.serratec.ecommerce.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemPedido")
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_pedido")
	private Integer idItemPedido;

	@Column(name = "quantidade")
	private BigDecimal quantidade;

	@Column(name = "preco_venda")
	private BigDecimal precoVenda;

	@Column(name = "percentual_desconto")
	private BigDecimal percentualDesconto;

	@Column(name = "valor_bruto")
	private BigDecimal valorBruto;

	@Column(name = "valor_liquido")
	private BigDecimal valorLiquido;

}
