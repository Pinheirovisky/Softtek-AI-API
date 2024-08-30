package com.projetoAI.Project.AI.controllers;

import com.projetoAI.Project.AI.dtos.login.AuthDTO;
import com.projetoAI.Project.AI.dtos.login.LoginDTO;
import com.projetoAI.Project.AI.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    AuthDTO login(@RequestBody LoginDTO loginDTO) throws Exception {
        return usuarioService.autenticar(loginDTO);
    }
}
