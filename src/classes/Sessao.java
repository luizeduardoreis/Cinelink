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
public class Sessao {
    
    private int id;
    private String data;
    private boolean exibicaoEm3d;
    private boolean legendado;
    private boolean dublado;
    private boolean preEstreia;
    private boolean brinde;
    private boolean cancelada;
    private Sala sala;
    private Filme filme;
    private Cinema cinema;
    
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList();
    };

    public Sessao(int id, String data, boolean exibicaoEm3d, boolean legendado, boolean dublado, boolean preEstreia, boolean brinde, boolean cancelada, Sala sala, Filme filme, Cinema cinema) {
        this.id = id;
        this.data = data;
        this.exibicaoEm3d = exibicaoEm3d;
        this.legendado = legendado;
        this.dublado = dublado;
        this.preEstreia = preEstreia;
        this.brinde = brinde;
        this.cancelada = cancelada;
        this.sala = sala;
        this.filme = filme;
        this.cinema = cinema;
        
        this.ingressos = new ArrayList();
    }

    public Sessao(String data, boolean legendado, boolean dublado, Filme filme) {
        this.data = data;
        this.legendado = legendado;
        this.dublado = dublado;
        this.filme = filme;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isExibicaoEm3d() {
        return exibicaoEm3d;
    }

    public void setExibicaoEm3d(boolean exibicaoEm3d) {
        this.exibicaoEm3d = exibicaoEm3d;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public boolean isPreEstreia() {
        return preEstreia;
    }

    public void setPreEstreia(boolean preEstreia) {
        this.preEstreia = preEstreia;
    }

    public boolean isBrinde() {
        return brinde;
    }

    public void setBrinde(boolean brinde) {
        this.brinde = brinde;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }   

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }    
    
    public void addIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
    
    public String getAudioType() {
        return (this.legendado ? "Legendado" : "Dublado");
    }
    
}
