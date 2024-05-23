package br.org.serratec.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import br.org.serratec.ecommerce.dtos.CepDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;

	@Column(name = "email")
	private String email;

	@Column(name = "nome_completo")
	private String nomeCompleto;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;

	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;
	
	private CepDto cep;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

}
