/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author 20181cmq.ads0239
 */
public class NoNota {
    private int nota;
    private NoNota prox;

    public NoNota(int nota, NoNota prox) {
        this.nota = nota;
        this.prox = prox;
    }
    
       public NoNota() {
        this.nota = 0;
        this.prox = null;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public NoNota getProx() {
        return prox;
    }

    public void setProx(NoNota prox) {
        this.prox = prox;
    }
       
       
}
