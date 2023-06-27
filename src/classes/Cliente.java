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
public class Cliente {
    
    private int id;
    private String nome;
    private String dataNasc;

    private String email;
    private String cpf;
    private String senha;

    private boolean estudante;
    private boolean preferencial;
    
    private ArrayList<Cinema> cinemas;
    private ArrayList<Ingresso> ingressos;
    
    public Cliente(){
        cinemas = new ArrayList();
        ingressos = new ArrayList();
    };
    
    public Cliente(int id, String email, String cpf, String nome,
            String senha, String dataNasc, boolean estudante, boolean preferencial) {
        
        // do not change these order of parameters!!!!
        // it will break ManageData
        
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.estudante = estudante;
        this.preferencial = preferencial;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        
        cinemas = new ArrayList();
        ingressos = new ArrayList();
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
    
    public void addCinema(Cinema cinema) {
        this.cinemas.add(cinema);
    }
    
    @Override
    public String toString() {
        return this.id + "$" + this.email + "$" + this.cpf + "$" + this.nome + "$" + this.senha + "$" + 
                this.dataNasc + "$" + this.estudante + "$" + this.preferencial + "$";
    }
}
