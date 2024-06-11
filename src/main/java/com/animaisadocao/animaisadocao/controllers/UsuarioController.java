package com.animaisadocao.animaisadocao.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animaisadocao.animaisadocao.entities.Usuario;
import com.animaisadocao.animaisadocao.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	// busca todos os Usuários
	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> result = repository.findAll();
		return result;
	}
	
	// busca um Usuario pelo ID
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id) {
		Usuario result = repository.findById(id).get();
		return result;
	}
	
	// adiciona um novo Usuario
	@PostMapping
	public Usuario insert(@RequestBody Usuario Usuario) {
		Usuario result = repository.save(Usuario);
		return result;
	}
	
	// atualiza um Usuario
    @PutMapping(value = "/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario Usuario) {
        // verifica se o Usuario a ser atualizado existe no banco de dados, pelo ID
        Optional<Usuario> existingUsuario = repository.findById(id);
        if (existingUsuario.isPresent()) {
            // Update the existing Usuario with the new values
            Usuario updatedUsuario = existingUsuario.get();
            updatedUsuario.setName(Usuario.getName());
            updatedUsuario.setEmail(Usuario.getEmail());
            updatedUsuario.setTelefone(Usuario.getTelefone());

            Usuario result = repository.save(updatedUsuario);
            return result;
        } else {
            return null; 
        }
    }
    
    // Delete an existing Usuario
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
