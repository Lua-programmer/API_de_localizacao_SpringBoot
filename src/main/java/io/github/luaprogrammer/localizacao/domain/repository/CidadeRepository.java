package io.github.luaprogrammer.localizacao.domain.repository;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
