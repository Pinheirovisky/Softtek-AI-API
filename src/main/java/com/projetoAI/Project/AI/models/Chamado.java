package com.projetoAI.Project.AI.models;

public class Chamado {
    private String numero;
    private String aberto;
    private String atualizado_em;
    private String estado_relatorio;
    private String resolvido_relatorio;
    private String categoria_relatorio;
    private String subcategoria_relatorio;
    private String sintoma;
    private String qualificacao_sintoma;
    private String grupo_de_atribuicao;
    private String categoria;
    private String atribuido_a;
    private String prioridade;
    private String encerrado;
    private String solicitante_tarefa;
    private String local;
    private String descricao;
    private String comentarios_visiveis_pergunta;
    private String comentarios_visiveis_resposta;
    private String resolucao;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getAberto() {
        return aberto;
    }
    public void setAberto(String aberto) {
        this.aberto = aberto;
    }
    public String getAtualizado_em() {
        return atualizado_em;
    }
    public void setAtualizado_em(String atualizado_em) {
        this.atualizado_em = atualizado_em;
    }
    public String getEstado_relatorio() {
        return estado_relatorio;
    }
    public void setEstado_relatorio(String estado_relatorio) {
        this.estado_relatorio = estado_relatorio;
    }
    public String getResolvido_relatorio() {
        return resolvido_relatorio;
    }
    public void setResolvido_relatorio(String resolvido_relatorio) {
        this.resolvido_relatorio = resolvido_relatorio;
    }
    public String getCategoria_relatorio() {
        return categoria_relatorio;
    }
    public void setCategoria_relatorio(String categoria_relatorio) {
        this.categoria_relatorio = categoria_relatorio;
    }
    public String getSubcategoria_relatorio() {
        return subcategoria_relatorio;
    }
    public void setSubcategoria_relatorio(String subcategoria_relatorio) {
        this.subcategoria_relatorio = subcategoria_relatorio;
    }
    public String getSintoma() {
        return sintoma;
    }
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    public String getQualificacao_sintoma() {
        return qualificacao_sintoma;
    }
    public void setQualificacao_sintoma(String qualificacao_sintoma) {
        this.qualificacao_sintoma = qualificacao_sintoma;
    }
    public String getGrupo_de_atribuicao() {
        return grupo_de_atribuicao;
    }
    public void setGrupo_de_atribuicao(String grupo_de_atribuicao) {
        this.grupo_de_atribuicao = grupo_de_atribuicao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAtribuido_a() {
        return atribuido_a;
    }
    public void setAtribuido_a(String atribuido_a) {
        this.atribuido_a = atribuido_a;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    public String getEncerrado() {
        return encerrado;
    }
    public void setEncerrado(String encerrado) {
        this.encerrado = encerrado;
    }
    public String getSolicitante_tarefa() {
        return solicitante_tarefa;
    }
    public void setSolicitante_tarefa(String solicitante_tarefa) {
        this.solicitante_tarefa = solicitante_tarefa;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getComentarios_visiveis_pergunta() {
        return comentarios_visiveis_pergunta;
    }
    public void setComentarios_visiveis_pergunta(String comentarios_visiveis_pergunta) {
        this.comentarios_visiveis_pergunta = comentarios_visiveis_pergunta;
    }
    public String getComentarios_visiveis_resposta() {
        return comentarios_visiveis_resposta;
    }
    public void setComentarios_visiveis_resposta(String comentarios_visiveis_resposta) {
        this.comentarios_visiveis_resposta = comentarios_visiveis_resposta;
    }
    public String getResolucao() {
        return resolucao;
    }
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String toStringSimplificado(){
        return String.format("""
              Chamado: %s,
              Descrição do Problema: %s,
              Aberto em: %s""",numero, aberto, descricao);
    }

    @Override
    public String toString() {
        return String.format("""
              Chamado: %s,
              Aberto em: %s,
              Data Atualização: %s,
              Status: %s,
              Data de Resolução: %s,
              Categoria do Relatório: %s,
              Subcategoria do Relatório: %s,
              Sintoma: %s,
              Qualificação do Sintoma: %s,
              Grupo de Atribuição: %s,
              Categoria: %s,
              Atribuido a: %s,
              Prioridade: %s,
              Data de Encerramento: %s,
              Solicitante: %s,
              Local: %s,
              Descrição do Problema: %s,
              Comentários Visíveis: %s,
              Comentários Visíveis: %s""",numero, aberto, atualizado_em, estado_relatorio, resolvido_relatorio, categoria_relatorio,
                subcategoria_relatorio, sintoma, qualificacao_sintoma, grupo_de_atribuicao, categoria, atribuido_a,
                prioridade, encerrado, solicitante_tarefa, local,
                descricao, comentarios_visiveis_pergunta, comentarios_visiveis_resposta, resolucao);
    }
    public String toJson() {
        return String.format("""
                {
                  "numero" : "%s",
                  "aberto" : "%s",
                  "atualizado_em" : "%s",
                  "estado_relatorio" : "%s",
                  "resolvido_relatorio" : "%s",
                  "categoria_relatorio" : "%s",
                  "subcategoria_relatorio" : "%s",
                  "sintoma" : "%s",
                  "qualificacao_sintoma" : "%s",
                  "grupo_de_atribuicao" : "%s",
                  "categoria" : "%s",
                  "atribuido_a" : "%s",
                  "prioridade" : "%s",
                  "encerrado" : "%s",    
                  "solicitante_tarefa" : "%s",
                  "local" : "%s",
                  "descricao" : "%s",
                  "comentarios_visiveis_pergunta" : "%s",
                  "comentarios_visiveis_resposta" : "%s"
                }""",numero, aberto, atualizado_em, estado_relatorio, resolvido_relatorio, categoria_relatorio,
                subcategoria_relatorio, sintoma, qualificacao_sintoma, grupo_de_atribuicao, categoria, atribuido_a,
                prioridade, encerrado, solicitante_tarefa, local,
                descricao, comentarios_visiveis_pergunta, comentarios_visiveis_resposta, resolucao);
    }

    public String toAI() {
        return String.format("""
        { \\n         \\"numero \\":  \\"%s\\", \\n         \\"categoria_relatorio \\":  \\"%s \\", \\n         \\"subcategoria_relatorio \\":  \\"%s \\", \\n         \\"sintoma \\":  \\"%s \\", \\n         \\"qualificacao_sintoma \\":  \\"%s \\", \\n         \\"grupo_de_atribuicao \\":  \\"%s \\", \\n         \\"categoria \\":  \\"%s \\", \\n         \\"atribuido_a \\":  \\"%s \\", \\n         \\"prioridade \\":  \\"%s \\", \\n         \\"solicitante_tarefa \\":  \\"%s \\", \\n         \\"local \\":  \\"%s \\", \\n         \\"descricao \\":  \\"%s \\", \\n         \\"comentarios_visiveis_pergunta \\":  \\"%s \\", \\n         \\"comentarios_visiveis_resposta \\":  \\"%s \\", \\n         \\"resolucao \\":  \\"%s \\" \\n    } \\n""",
                numero, categoria_relatorio, subcategoria_relatorio, sintoma, qualificacao_sintoma, grupo_de_atribuicao,
                categoria, atribuido_a, prioridade, solicitante_tarefa, local, descricao, comentarios_visiveis_pergunta,
                comentarios_visiveis_resposta, resolucao
        );
    }


    public Chamado(String numero, String aberto, String atualizado_em, String estado_relatorio, String resolvido_relatorio,  String categoria_relatorio, String subcategoria_relatorio, String sintoma, String qualificacao_sintoma,
                   String grupo_de_atribuicao, String categoria, String atribuido_a, String prioridade, String encerrado,
                   String solicitante_tarefa, String local, String descricao, String comentarios_visiveis_pergunta,
                   String comentarios_visiveis_resposta, String resolucao) {
        this.numero = numero;
        this.aberto = aberto;
        this.atualizado_em = atualizado_em;
        this.estado_relatorio = estado_relatorio;
        this.resolvido_relatorio = resolvido_relatorio;
        this.categoria_relatorio = categoria_relatorio;
        this.subcategoria_relatorio = subcategoria_relatorio;
        this.sintoma = sintoma;
        this.qualificacao_sintoma = qualificacao_sintoma;
        this.grupo_de_atribuicao = grupo_de_atribuicao;
        this.categoria = categoria;
        this.atribuido_a = atribuido_a;
        this.prioridade = prioridade;
        this.encerrado = encerrado;
        this.solicitante_tarefa = solicitante_tarefa;
        this.local = local;
        this.descricao = descricao;
        this.comentarios_visiveis_pergunta = comentarios_visiveis_pergunta;
        this.comentarios_visiveis_resposta = comentarios_visiveis_resposta;
        this.resolucao = resolucao;
    }
}
