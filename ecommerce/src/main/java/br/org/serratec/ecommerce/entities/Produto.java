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
	
	/*@Column(name = "imagem")
	private  imagem;*/
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@OneToMany(mappedBy = "produto")
	private List<ItemPedido> itensPedidos;
	
	
}