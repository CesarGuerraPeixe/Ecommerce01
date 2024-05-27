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

import br.org.serratec.ecommerce.entities.Cliente;
import br.org.serratec.ecommerce.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Integer id) {
		Cliente cliente = clienteService.findById(id);

		if (cliente == null)
			return new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(cliente, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteClienteById(@PathVariable Integer id) {
		boolean deleted = clienteService.deleteById2(id);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
