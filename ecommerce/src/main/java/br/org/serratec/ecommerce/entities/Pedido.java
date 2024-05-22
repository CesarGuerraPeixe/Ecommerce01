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
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Integer idPedido;
	
	@Column(name = "data_pedido")
	private LocalDate dataPedido;
	
	@Column(name = "data_entrega")
	private LocalDate dataEntrega;
	
	@Column(name = "data_envio")
	private LocalDate dataEnvio;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "valor_total", precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itensPedidos;
	

}
