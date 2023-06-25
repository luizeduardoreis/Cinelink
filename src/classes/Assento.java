/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author maxwell
 */
public class Assento {
    
    private String id;
    private boolean vip;
    private boolean preferencial;
    private boolean danificado;
    private Sala sala;
    
    public Assento(){};

    public Assento(String id) {
        this.id = id;
    };
    
    public Assento(String id, boolean vip, boolean preferencial, boolean danificado, Sala sala) {
        this.id = id;
        this.vip = vip;
        this.preferencial = preferencial;
        this.danificado = danificado;
        this.sala = sala;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public boolean isDanificado() {
        return danificado;
    }

    public void setDanificado(boolean danificado) {
        this.danificado = danificado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    
}
