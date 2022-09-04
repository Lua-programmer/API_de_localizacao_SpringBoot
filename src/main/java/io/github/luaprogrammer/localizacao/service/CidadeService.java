package io.github.luaprogrammer.localizacao.service;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import io.github.luaprogrammer.localizacao.domain.repository.CidadeRepository;
import static io.github.luaprogrammer.localizacao.domain.repository.specs.CidadeSpec.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    private CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public void listarCidades() { //esse repository já retorna uma lista
        cidadeRepository.findAll().forEach(System.out::println);
    }

    public void listarCidadesPorNome() {
        cidadeRepository.findByNome("Bayeux").forEach(System.out::println);
    }

    public void listarCidadesEndingPorNome() {
        cidadeRepository.findByNomeEndingWith("lo").forEach(System.out::println);
    }

    public void listarCidadePorParte() {
        cidadeRepository.findByNomeLike("b%", Sort.by("nome")).forEach(System.out::println);
    }

    public void listarCidadeSpec() {
       cidadeRepository
               .findAll(nomeEquals("São Paulo").and(habitantesGreaterThan(1000)))
               .forEach(System.out::println);
    }


}
