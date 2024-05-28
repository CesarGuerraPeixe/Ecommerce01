package br.org.serratec.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.ecommerce.dtos.ClienteDTO;
import br.org.serratec.ecommerce.entities.Cliente;
import br.org.serratec.ecommerce.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Cliente cliente = clienteService.findById(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<ClienteDTO> save(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<String> delete(@RequestBody Cliente cliente) {
		if (clienteService.delete(cliente)) {
			return new ResponseEntity<>("Deletado com sucesso", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Não foi possível deletar", HttpStatus.BAD_REQUEST);
		}
	}

}
