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
public class Filme {
    
    private int id;
    private String titulo;
    private Date dataEstreia;
    private int classificacaoIndicativa;
    private long bilheteria;
    private float avaliacaoDoPublico;
    private String diretor;
    private ArrayList<Sessao> sessoes;
    private String sinopse;

    public Filme(){
        sessoes = new ArrayList();
    };
 
    public Filme(int id, String titulo, String diretor, Date dataEstreia, int classificacaoIndicativa, long bilheteria, float avaliacaoDoPublico, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.dataEstreia = dataEstreia;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.bilheteria = bilheteria;
        this.avaliacaoDoPublico = avaliacaoDoPublico;
        this.diretor = diretor;
        this.sinopse = sinopse;
        
        sessoes = new ArrayList();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataEstreia() {
        return dataEstreia;
    }

    public void setDataEstreia(Date dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoINdicativa) {
        this.classificacaoIndicativa = classificacaoINdicativa;
    }

    public long getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(long bilheteria) {
        this.bilheteria = bilheteria;
    }

    public float getAvaliacaoDoPublico() {
        return avaliacaoDoPublico;
    }

    public void setAvaliacaoDoPublico(float avaliacaoDoPublico) {
        this.avaliacaoDoPublico = avaliacaoDoPublico;
    }
    
    public void addSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
    
}