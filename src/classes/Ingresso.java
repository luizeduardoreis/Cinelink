/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Utils.Constants;

/**
 *
 * @author maxwell
 */
public class Ingresso {
    
    private int id;
    private float preco;
    private Cliente cliente;
    private Sessao sessao;
    private Assento assento;
    
    public Ingresso() {};

    public Ingresso(int id, Cliente cliente, Sessao sessao, 
            Assento assento) {
        this.id = id;
        this.cliente = cliente;
        this.sessao = sessao;
        this.assento = assento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    
    public float getPrecoBase() {
        return Constants.TICKET_PRICE;
    }
    
}
