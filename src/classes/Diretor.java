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
public class Diretor extends Pessoa {
    
    private int anosDeExperiencia;
    private ArrayList<Filme> filmes;

    public Diretor(){
        this.filmes = new ArrayList();
    };
    
    public Diretor(int anosDeExperiencia, int id, String nome, String dataNasc) {
        super(id, nome, dataNasc);
        this.anosDeExperiencia = anosDeExperiencia;
        this.filmes = new ArrayList();
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }
    
    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }
    
    
}
