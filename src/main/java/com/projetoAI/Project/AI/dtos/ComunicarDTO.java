package com.projetoAI.Project.AI.dtos;

public class ComunicarDTO {
    private String nroChamado;
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getNroChamado() {
        return nroChamado;
    }

    public void setNroChamado(String nroChamado) {
        this.nroChamado = nroChamado;
    }
}
