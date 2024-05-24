package br.org.serratec.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private RoleEnum nome;

	public Role() {
	}

	public Role(Integer id, RoleEnum nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Role(RoleEnum nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RoleEnum getNome() {
		return nome;
	}

	public void setNome(RoleEnum nome) {
		this.nome = nome;
	}

}
