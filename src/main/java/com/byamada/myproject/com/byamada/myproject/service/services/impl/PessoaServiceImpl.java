package com.byamada.myproject.com.byamada.myproject.service.services.impl;

import com.byamada.myproject.com.byamada.myproject.core.dao.model.Pessoa;
import com.byamada.myproject.com.byamada.myproject.core.dao.repository.PessoaRepository;
import com.byamada.myproject.com.byamada.myproject.service.services.PessoaService;
import com.byamada.myproject.com.byamada.myproject.service.services.exceptions.ObjectNotFoundExceprion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa listarId(int id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundExceprion("Objeto não encontrado! Id: "+id));
    }

    @Override
    public Pessoa add(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa edit(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void delete(int id) {
        Pessoa pessoa = this.listarId(id);
       pessoaRepository.delete(pessoa);
    }
}
