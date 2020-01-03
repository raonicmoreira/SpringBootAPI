package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	// no findByCursoNome (Curso é o nome da entidade relacionada ao Topico e Nome é o atributo da entidade Curso)
	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

}
