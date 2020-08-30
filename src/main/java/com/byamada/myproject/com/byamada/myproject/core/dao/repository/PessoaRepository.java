package com.byamada.myproject.com.byamada.myproject.core.dao.repository;

import com.byamada.myproject.com.byamada.myproject.core.dao.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
