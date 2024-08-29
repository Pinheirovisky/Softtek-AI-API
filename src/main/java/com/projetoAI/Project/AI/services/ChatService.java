package com.projetoAI.Project.AI.services;

import com.projetoAI.Project.AI.models.Chamado;
import com.projetoAI.Project.AI.models.SofttekAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private SofttekAI softtekAI;

    public String enviarPergunta(String message, String api_key) throws Exception {
//        var chamado = new Chamado(message);

        var chamado = "{  \"numero \":  \"TASK1234567 \",  \"categoria_relatorio \":  \"Acessos \",  \"subcategoria_relatorio \":  \"Reset/Desbloqueio de Senha \",  \"sintoma \":  \"Problemas de login \",  \"qualificacao_sintoma \":  \"CS SAP \",  \"grupo_de_atribuicao \":  \"N1-ACESSOS-SAP \",  \"categoria \":  \"Acesso \",  \"atribuido_a \":  \"Analista Acesso \",  \"prioridade \":  \"2 - Médio \",  \"solicitante_tarefa \":  \"Cliente X \",  \"local \":  \"Escritório Central \",  \"descricao \":  \"O cliente não consegue acessar o CS SAP. Ele informa que tentou logar com suas credenciais, mas o sistema está exibindo uma mensagem de erro. \",  \"comentarios_visiveis_pergunta \":  \"O que está sendo exibido na tela? \",  \"comentarios_visiveis_resposta \":  \" \",  \"resolucao \":  \"null \" }";

        try {
            return softtekAI.comunicarChamado(message, api_key);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
