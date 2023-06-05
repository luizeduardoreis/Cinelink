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
public class Sala {
    
    private int id;
    private int capacidadeTotal;
    private ArrayList<Sessao> sessoes;
    private ArrayList<Assento> assentos;
    
    public Sala() {
        assentos = new ArrayList();
        sessoes = new ArrayList();
    };

    public Sala(int id, int capacidadeTotal) {
        this.id = id;
        this.capacidadeTotal = capacidadeTotal;
        assentos = new ArrayList();
        sessoes = new ArrayList();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    
    public void addAssento(Assento assento) {
        this.assentos.add(assento);
    }
    
    public void addSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    } 
    
}
