package br.org.serratec.ecommerce.entities;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemPedido")
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_pedido")
	private Integer idItemPedido;

	@Column(name = "quantidade", precision = 10, scale = 2)
	private BigDecimal quantidade;

	@Column(name = "preco_venda", precision = 10, scale = 2)
	private BigDecimal precoVenda;

	@Column(name = "percentual_desconto", precision = 10, scale = 2)
	private BigDecimal percentualDesconto;

	@Column(name = "valor_bruto", precision = 10, scale = 2)
	private BigDecimal valorBruto;

	@Column(name = "valor_liquido", precision = 10, scale = 2)
	private BigDecimal valorLiquido;

	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

}
