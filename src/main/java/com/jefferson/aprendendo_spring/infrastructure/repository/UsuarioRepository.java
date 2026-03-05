package com.jefferson.aprendendo_spring.infrastructure.repository;

import com.jefferson.aprendendo_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { //Nome da tabela e o tipo do Id
}
