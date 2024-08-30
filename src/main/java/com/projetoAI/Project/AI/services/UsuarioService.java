package com.projetoAI.Project.AI.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.projetoAI.Project.AI.dtos.login.AuthDTO;
import com.projetoAI.Project.AI.dtos.login.LoginDTO;
import com.projetoAI.Project.AI.models.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {

    public AuthDTO autenticar(LoginDTO loginDTO) throws Exception {
        try {
            var usuario = validadarLogin(loginDTO.getEmail(), loginDTO.getPassword());
            var token = UUID.randomUUID().toString();

            if (usuario == null) {
                throw new ResponseStatusException(
                        HttpStatus.FORBIDDEN, "Usuário ou senha não válidos."
                );
            }

            return new AuthDTO(loginDTO.getEmail(), token);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.FORBIDDEN, "Usuário ou senha não válidos."
            );
        }
    }

    public HashMap<String, Usuario> mapearEmailESenha() throws FileNotFoundException {
        //        // Caminho para o arquivo chamados.json
        String caminhoArquivoJson = "src/main/resources/usuarios/usuarios.json";

        // Leitura do arquivo JSON
        Gson gson = new GsonBuilder().create();
        // Salva o tipo da List para o campo do método fromJson
        Type listType = new TypeToken<List<Usuario>>() {
        }.getType();
        // Insere os chamados do Arquivo JSON para a List
        List<Usuario> usuarios = gson.fromJson(new FileReader(caminhoArquivoJson), listType);

        //HashMap para acessar os dados pela Primary Key ao invés do índice da List
        HashMap<String, Usuario> usuarioESenha = new HashMap<>();
        for (Usuario usuario : usuarios) {
            usuarioESenha.put(usuario.getEmail(), usuario);
        }


        return usuarioESenha;
    }

    public Usuario validadarLogin(String email, String senha) throws FileNotFoundException, NullPointerException {
        var usuarios = mapearEmailESenha();

        try {
            Usuario usr = usuarios.get(email);
            if (usr.getSenha().equals(senha)){
                return usr;
            }
            return null;
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }
}
