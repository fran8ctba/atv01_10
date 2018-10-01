package com.example.fran8.atv01_10.modelo;

public class Pessoa {
    private String uid;
    private String nome;
    private String email;
    private String uri;

    public Pessoa() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Pessoa(String uid, String nome, String email, String uri) {
        this.uid = uid;
        this.nome = nome;
        this.email = email;
        this.uri = uri;
    }

    @Override
    public String toString() {
        return nome;
    }
}
