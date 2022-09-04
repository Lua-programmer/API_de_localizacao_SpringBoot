package io.github.luaprogrammer.localizacao.domain.repository;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    List<Cidade> findByNome(String nome);

    List<Cidade> findByNomeEndingWith(String letra);

    //não vai considerar o case, nem da aplicação, nem do banco
    @Query(" select c from Cidade c where upper(c.nome) like upper(?1) ")
    List<Cidade> findByNomeLike(String nome);
}
