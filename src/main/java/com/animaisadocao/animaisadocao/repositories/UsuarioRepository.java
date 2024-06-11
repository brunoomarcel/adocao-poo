package com.animaisadocao.animaisadocao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.animaisadocao.animaisadocao.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}

