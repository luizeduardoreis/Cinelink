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
    private int classificacaoINdicativa;
    private long bilheteria;
    private float avaliacaoDoPublico;
    private Diretor diretor;
    private ArrayList<Personagem> personagens;
    private ArrayList<Sessao> sessoes;

    public Filme(){
        personagens = new ArrayList();
        sessoes = new ArrayList();
    };
 
    public Filme(int id, String titulo, Date dataEstreia, int classificacaoINdicativa, long bilheteria, float avaliacaoDoPublico, Diretor diretor) {
        this.id = id;
        this.titulo = titulo;
        this.dataEstreia = dataEstreia;
        this.classificacaoINdicativa = classificacaoINdicativa;
        this.bilheteria = bilheteria;
        this.avaliacaoDoPublico = avaliacaoDoPublico;
        this.diretor = diretor;
        
        personagens = new ArrayList();
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

    public int getClassificacaoINdicativa() {
        return classificacaoINdicativa;
    }

    public void setClassificacaoINdicativa(int classificacaoINdicativa) {
        this.classificacaoINdicativa = classificacaoINdicativa;
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
    
    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }
    
    public void addSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    
}
