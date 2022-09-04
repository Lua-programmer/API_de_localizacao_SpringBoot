package io.github.luaprogrammer.localizacao;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import io.github.luaprogrammer.localizacao.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transaction;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public void run(String... args) throws Exception {
        //listarCidades();
        //listarCidadesPorNome();
        listarCidadesEndingPorNome();
    }

    void listarCidades() { //esse repository já retorna uma lista
        cidadeRepository.findAll().forEach(System.out::println);
    }

    void listarCidadesPorNome() {
        cidadeRepository.findByNome("Bayeux").forEach(System.out::println);
    }
    void listarCidadesEndingPorNome() {
        cidadeRepository.findByNomeEndingWith("lo").forEach(System.out::println);
    }


    public static void main(String... args) {
        SpringApplication.run(LocalizacaoApplication.class, args);
    }
}

