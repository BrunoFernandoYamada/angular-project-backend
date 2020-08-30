package com.byamada.myproject.com.byamada.myproject.service.services;

import com.byamada.myproject.com.byamada.myproject.core.dao.model.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    List<Pessoa> listar();
    Pessoa listarId(int id);
    Pessoa add(Pessoa pessoa);
    Pessoa edit(Pessoa pessoa);
    void delete(int id);


}
