/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author maxwell
 */
public class Cliente extends Pessoa {
    
    private boolean estudante;
    private boolean preferencial;
    
    private String email;
    private String cpf;
    private String senha;

    private ArrayList<Cinema> cinemas;
    private ArrayList<Ingresso> ingressos;
    
    public Cliente(){
        cinemas = new ArrayList();
        ingressos = new ArrayList();
    };
    
    public Cliente(boolean estudante, boolean preferencial, String email, String cpf, String senha, int id, String nome, String dataNasc) {
        super(id, nome, dataNasc);
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
    
}
