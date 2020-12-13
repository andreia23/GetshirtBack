package br.edu.ifpb.girls.getshirt.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.girls.getshirt.api.model.Cliente;
import br.edu.ifpb.girls.getshirt.api.service.ClienteService;

@RestController
@RequestMapping("/")
public class ClienteController {

	@Autowired
	private ClienteService ClienteService;

	@GetMapping("/Clientes")
	public List<Cliente> getClientes() {
		return this.ClienteService.getClientes();
	}

	@GetMapping("/Clientes/{id}")
	public Cliente getClientePorId(@PathVariable("id") Long idCliente) {
		return this.ClienteService.getClientePorId(idCliente);
	}

	@PostMapping("/Clientes")
	public Cliente inserirCliente(@RequestBody Cliente cliente) {
		return this.ClienteService.inserirCliente(cliente);
	}

	@PutMapping("/Clientes/{id}")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return this.ClienteService.atualizarCliente(cliente);
	}

	@DeleteMapping("/Clientes/{id}")
	public void apagarCliente(@PathVariable("id") Long id) {
		this.ClienteService.apagarCliente(id);
	}
}
