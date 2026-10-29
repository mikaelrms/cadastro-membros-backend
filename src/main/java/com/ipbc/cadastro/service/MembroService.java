package com.ipbc.cadastro.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.ipbc.cadastro.model.Membro;
import com.ipbc.cadastro.repository.MembroRepository;

@Service
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public Membro cadastrar(Membro membro) {
        return membroRepository.save(membro);
    }
    public List<Membro> listarTodos() {
        return membroRepository.findAll();
    }
}
