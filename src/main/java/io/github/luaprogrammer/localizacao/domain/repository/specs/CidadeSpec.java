package io.github.luaprogrammer.localizacao.domain.repository.specs;

import io.github.luaprogrammer.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.domain.Specification;

public class CidadeSpec {

    public static Specification<Cidade> habitantesGreaterThan(Integer value) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("habitantes"), value));
    }

    public static Specification<Cidade> nomeEquals(String nome) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("nome"), nome));
    }

}
