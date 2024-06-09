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

import com.animaisadocao.animaisadocao.entities.Animal;
import com.animaisadocao.animaisadocao.repositories.AnimalRepository;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {
	
	@Autowired
	private AnimalRepository repository;
	
	// busca todos os animais
	@GetMapping
	public List<Animal> findAll() {
		List<Animal> result = repository.findAll();
		return result;
	}
	
	// busca um animal pelo ID
	@GetMapping(value = "/{id}")
	public Animal findById(@PathVariable Long id) {
		Animal result = repository.findById(id).get();
		return result;
	}
	
	// adiciona um novo animal
	@PostMapping
	public Animal insert(@RequestBody Animal animal) {
		Animal result = repository.save(animal);
		return result;
	}
	
	// atualiza um animal
    @PutMapping(value = "/{id}")
    public Animal update(@PathVariable Long id, @RequestBody Animal animal) {
        // verifica se o animal a ser atualizado existe no banco de dados, pelo ID
        Optional<Animal> existingAnimal = repository.findById(id);
        if (existingAnimal.isPresent()) {
            // Update the existing animal with the new values
            Animal updatedAnimal = existingAnimal.get();
            updatedAnimal.setNomeAnimal(animal.getNomeAnimal());
            updatedAnimal.setEspecie(animal.getEspecie());
            updatedAnimal.setRaca(animal.getRaca());
            updatedAnimal.setIdade(animal.getIdade());

            Animal result = repository.save(updatedAnimal);
            return result;
        } else {
            return null; 
        }
    }
    
    // Delete an existing animal
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
