package br.org.serratec.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Integer idProduto;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "qtd_estoque", precision = 10, scale = 2)
	private BigDecimal qtdEstoque;

	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@Column(name = "valor_unitario", precision = 10, scale = 2)
	private BigDecimal valorUnitario;

	@Column(name = "url")
	private String url;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;

	@OneToMany(mappedBy = "produto")
	private List<ItemPedido> itensPedidos;

	public Produto() {
	}

	public Produto(Integer idProduto, String nome, String descricao, BigDecimal qtdEstoque, LocalDate dataCadastro,
			BigDecimal valorUnitario, String url, Categoria categoria, List<ItemPedido> itensPedidos) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.dataCadastro = dataCadastro;
		this.valorUnitario = valorUnitario;
		this.url = url;
		this.categoria = categoria;
		this.itensPedidos = itensPedidos;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(BigDecimal qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

}