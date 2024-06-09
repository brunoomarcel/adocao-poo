package com.animaisadocao.animaisadocao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.animaisadocao.animaisadocao.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
