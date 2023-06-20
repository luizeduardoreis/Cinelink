/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author maxwell
 */
public class Cinema {
    
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private int capacidadeTotal;
    private int quantidadeSalas;

    private ArrayList<Cliente> clientes;
    private ArrayList<Sessao> sessoes;
    
    
    public Cinema(){
        clientes = new ArrayList();
        sessoes = new ArrayList();
    };
    
    public Cinema(int id, String nome, String telefone, String email, String endereco, int capacidadeTotal, int quantidadeSalas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.capacidadeTotal = capacidadeTotal;
        this.quantidadeSalas = quantidadeSalas;
    
        clientes = new ArrayList();
        sessoes = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getQuantidadeSalas() {
        return quantidadeSalas;
    }

    public void setQuantidadeSalas(int quantidadeSalas) {
        this.quantidadeSalas = quantidadeSalas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
    
    public void registrarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
    
}
