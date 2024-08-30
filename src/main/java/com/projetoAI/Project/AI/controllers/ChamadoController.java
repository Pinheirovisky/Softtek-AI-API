package com.projetoAI.Project.AI.controllers;

import com.projetoAI.Project.AI.models.Chamado;
import com.projetoAI.Project.AI.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chamados")
public class ChamadoController {

    private final ChamadoService chamadoService;

    @Autowired
    public ChamadoController(ChamadoService chamadoService) {
        this.chamadoService = chamadoService;
    }

    @GetMapping("/em-tratamento")
    public List<Chamado> getChamadosEmTratamento() {
        return chamadoService.getChamadosEmTratamento();
    }

    @GetMapping("/em-fila")
    public List<Chamado> getChamadosEmFila() {
        return chamadoService.getChamadosEmFila();
    }
    @GetMapping("/em-validacao")
    public List<Chamado> getChamadosEmValidacao() {
        return chamadoService.getChamadosEmValidacao();
    }

    @GetMapping("/resolvidos")
    public List<Chamado> getChamadosResolvidos() {
        return chamadoService.getChamadosResolvidos();
    }
}
