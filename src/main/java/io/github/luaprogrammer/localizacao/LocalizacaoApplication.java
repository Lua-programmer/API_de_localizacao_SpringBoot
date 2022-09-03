package io.github.luaprogrammer.localizacao;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import io.github.luaprogrammer.localizacao.domain.repository.CidadeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transaction;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    private final CidadeRepository cidadeRepository;

    public LocalizacaoApplication(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    void listaCidades() { //esse repository já retorna uma lista
        cidadeRepository.findAll().forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        listaCidades();
    }
    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class, args);
    }
}

