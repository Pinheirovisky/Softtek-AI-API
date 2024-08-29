package com.projetoAI.Project.AI.controllers;

import com.projetoAI.Project.AI.models.PerguntaDTO;
import com.projetoAI.Project.AI.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chat {

    @Autowired
    private ChatService chatService;

    @PostMapping("/enviar-pergunta")
    String comunicarAI(@RequestBody PerguntaDTO perguntaDTO) throws Exception {
        return chatService.enviarPergunta(perguntaDTO.getPergunta(), perguntaDTO.getApiKey());
    }
}
