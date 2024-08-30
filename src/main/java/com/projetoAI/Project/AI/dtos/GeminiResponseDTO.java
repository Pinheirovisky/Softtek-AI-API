package com.projetoAI.Project.AI.dtos;

public class GeminiResponseDTO {
    private boolean possui_doc_it;
    private String descricao_problema;
    private String insight;
    private String nome_doc_it;
    private String resumo_doc_it;
    private String possivel_solucao_problema;

    public boolean isPossui_doc_it() {
        return possui_doc_it;
    }

    public String getDescricao_problema() {
        return descricao_problema;
    }

    public String getInsight() {
        return insight;
    }

    public String getNome_doc_it() {
        return nome_doc_it;
    }

    public String getResumo_doc_it() {
        return resumo_doc_it;
    }

    public String getPossivel_solucao_problema() {
        return possivel_solucao_problema;
    }

    @Override
    public String toString() {
        if (possui_doc_it) return String.format("""
                    Descrição do problema:
                    %s
                    
                    Documento para solução: %s
                    
                    Solução:
                    %s
                    
                    Insights e sugestões:
                    %s""", descricao_problema, nome_doc_it, resumo_doc_it, insight);
        return String.format("""
                    Descrição do problema:
                    %s
                    
                    Este chamado não possui um documento de referência para solucioná-lo, porém aqui está uma possível solução para ele:
                    %s
                    
                    Insights e sugestões:
                    %s""", descricao_problema ,possivel_solucao_problema , insight);
    }
}
