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
	private Integer quantidade;

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

	public ItemPedido() {
	}

	public ItemPedido(Integer idItemPedido, Integer quantidade, BigDecimal precoVenda, BigDecimal percentualDesconto,
			BigDecimal valorBruto, BigDecimal valorLiquido, Produto produto, Pedido pedido) {
		super();
		this.idItemPedido = idItemPedido;
		this.quantidade = quantidade;
		this.precoVenda = precoVenda;
		this.percentualDesconto = percentualDesconto;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.produto = produto;
		this.pedido = pedido;
	}

	public Integer getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(BigDecimal percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
