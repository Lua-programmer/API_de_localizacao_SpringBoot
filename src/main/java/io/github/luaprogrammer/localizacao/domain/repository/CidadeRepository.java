package io.github.luaprogrammer.localizacao.domain.repository;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    List<Cidade> findByNome(String nome);

    List<Cidade> findByNomeEndingWith(String letra);
}
