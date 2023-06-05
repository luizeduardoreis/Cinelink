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
public class Personagem {
    
    private int id;
    private String nome;
    private ArrayList<Ator> atores;
    private ArrayList<Filme> filmes;
    
    public Personagem() {
        atores = new ArrayList();
        filmes = new ArrayList();
    };

    public Personagem(int id, String nome) {
        this.id = id;
        this.nome = nome;
        
        atores = new ArrayList();
        filmes = new ArrayList();
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
    
    public void addAtor(Ator ator) {
        this.atores.add(ator);
    }
           
    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }
    
}
