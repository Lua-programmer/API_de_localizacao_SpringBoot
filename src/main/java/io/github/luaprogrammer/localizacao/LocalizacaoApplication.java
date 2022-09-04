package io.github.luaprogrammer.localizacao;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import io.github.luaprogrammer.localizacao.domain.repository.CidadeRepository;
import io.github.luaprogrammer.localizacao.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transaction;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    private CidadeService cidadeService;

    public LocalizacaoApplication(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @Override
    public void run(String... args) throws Exception {
        //cidadeService.listarCidadePorParte();
        cidadeService.listarCidadeSpec();
    }

    public static void main(String... args) {
        SpringApplication.run(LocalizacaoApplication.class, args);
    }
}

