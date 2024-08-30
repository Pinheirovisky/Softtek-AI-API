package com.projetoAI.Project.AI.factories;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.projetoAI.Project.AI.models.Chamado;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class ChamadoFactory {

    private List<Chamado> generateChamados(String path) {
        Gson gson = new Gson();
        List<Chamado> chamados = null;
        try (FileReader reader = new FileReader(path)) {
            Type chamadoListType = new TypeToken<List<Chamado>>(){}.getType();
            chamados = gson.fromJson(reader, chamadoListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chamados;
    }

    public List<Chamado> createChamadosEmTratamento() {
        return generateChamados("src/main/resources/chamados/chamadosEmTratamento.json");
    }

    public List<Chamado> createChamadosEmFila() {
        return generateChamados("src/main/resources/chamados/chamadosEmFila.json");
    }

    public List<Chamado> createChamadosEmValidacao() {
        return generateChamados("src/main/resources/chamados/chamadosEmValidacao.json");
    }

    public List<Chamado> createChamadosResolvidos() {
        return generateChamados("src/main/resources/chamados/chamadosResolvidos.json");
    }
}
