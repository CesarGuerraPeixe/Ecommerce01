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

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDTO;
import br.org.serratec.ecommerce.entities.Pedido;
import br.org.serratec.ecommerce.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

		@Autowired
		PedidoService controllerService;
		
		@GetMapping
		public ResponseEntity<List<Pedido>> findAll () {
			return new ResponseEntity<>(controllerService.findAll(), HttpStatus.OK);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Pedido> findById(@PathVariable Integer id) {
			Pedido controller = controllerService.findById(id);
			
			if(controller == null)
				return new ResponseEntity<>(controller, HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<>(controller, HttpStatus.OK);
		}

		@PostMapping
		public ResponseEntity<Pedido> save(@RequestBody Pedido controller) {
			return new ResponseEntity<>(controllerService.save(controller), HttpStatus.CREATED);
		}
		
		@PutMapping
		public ResponseEntity<Pedido> update(@RequestBody Pedido controller) {
			return new ResponseEntity<>(controllerService.update(controller), HttpStatus.OK);
		}
		
		@DeleteMapping("/{id}")
	    public ResponseEntity<String> deletePedidoById(@PathVariable Integer id) {
	        boolean deleted = controllerService.deleteById2(id);
	        if (deleted) {
	            return new ResponseEntity<>(HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }
	    }
		
		 

		
		
}
