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
public class Ator extends Pessoa {
    
    private String nomeArtistico;
    private int anosDeExperiencia;
    private boolean dublador;
    private ArrayList<Personagem> personagens;

    public Ator(){
        personagens = new ArrayList();
    };
    
    public Ator(String nomeArtistico, int anosDeExperiencia, boolean dublador, int id, String nome, String dataNasc) {
        super(id, nome, dataNasc);
        this.nomeArtistico = nomeArtistico;
        this.anosDeExperiencia = anosDeExperiencia;
        this.dublador = dublador;
        
        personagens = new ArrayList();
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public boolean isDublador() {
        return dublador;
    }

    public void setDublador(boolean dublador) {
        this.dublador = dublador;
    }
    
    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    
}
