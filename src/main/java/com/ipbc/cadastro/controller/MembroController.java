package com.ipbc.cadastro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.validation.Valid;

import com.ipbc.cadastro.model.Membro;
import com.ipbc.cadastro.service.MembroService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/membros")
public class MembroController {

    private final MembroService membroService;

    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    @PostMapping
    public Membro cadastrar(@Valid @RequestBody Membro membro) {
        return membroService.cadastrar(membro);
    }
    @GetMapping
    public List<Membro> listarTodos() {
        return membroService.listarTodos();
    }
}
