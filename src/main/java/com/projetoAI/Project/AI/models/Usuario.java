package com.projetoAI.Project.AI.models;

public class Usuario {
    private String cd_usuario;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String grupo_de_atribuicao;

    public String getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(String cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGrupo_de_atribuicao() {
        return grupo_de_atribuicao;
    }

    public void setGrupo_de_atribuicao(String grupo_de_atribuicao) {
        this.grupo_de_atribuicao = grupo_de_atribuicao;
    }
}