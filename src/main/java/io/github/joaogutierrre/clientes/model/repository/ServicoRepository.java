package io.github.joaogutierrre.clientes.model.repository;

import io.github.joaogutierrre.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
