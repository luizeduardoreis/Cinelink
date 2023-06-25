/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author maxwell
 */
public class Meia extends Ingresso {
    
    public String DocumentoComprobatorio;

    public Meia() {
    }

    public Meia(int id, Cliente cliente, Sessao sessao, 
            Assento assento) {
        super(id, cliente, sessao, assento);
    }

    public String getDocumentoComprobatorio() {
        return DocumentoComprobatorio;
    }

    public void setDocumentoComprobatorio(String DocumentoComprobatorio) {
        this.DocumentoComprobatorio = DocumentoComprobatorio;
    }
    
    @Override
    public float getPrecoBase() {
       return super.getPrecoBase() * 0.5f;
    }
     
}
