package com.projetoAI.Project.AI.controllers;

import com.projetoAI.Project.AI.dtos.ComunicarDTO;
import com.projetoAI.Project.AI.dtos.RespostaDTO;
import com.projetoAI.Project.AI.models.Chamado;
import com.projetoAI.Project.AI.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gemini")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/enviar-pergunta")
    RespostaDTO comunicarAI(@RequestBody ComunicarDTO chamado) throws Exception {
        return chatService.comunicarGemini(chamado.getNroChamado(), chamado.getApiKey());
    }
}
