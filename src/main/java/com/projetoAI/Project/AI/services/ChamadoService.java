package com.projetoAI.Project.AI.services;

import com.projetoAI.Project.AI.models.Chamado;
import com.projetoAI.Project.AI.factories.ChamadoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoFactory chamadoFactory;

    @Autowired
    public ChamadoService(ChamadoFactory chamadoFactory) {
        this.chamadoFactory = chamadoFactory;
    }

    public List<Chamado> getChamadosEmTratamento() {
        return chamadoFactory.createChamadosEmTratamento();
    }

    public List<Chamado> getChamadosEmFila() {
        return chamadoFactory.createChamadosEmFila();
    }

    public List<Chamado> getChamadosEmValidacao() {
        return chamadoFactory.createChamadosEmValidacao();
    }

    public List<Chamado> getChamadosResolvidos() {
        return chamadoFactory.createChamadosResolvidos();
    }
}
