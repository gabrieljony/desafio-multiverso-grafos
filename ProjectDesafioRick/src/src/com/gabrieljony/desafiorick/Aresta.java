/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.gabrieljony.desafiorick;

/**
 *
 * @author GABRIEL
 */
class Aresta {
    
    private int inicioVestice;
    private int fimVestice;
    private int duracao;
    
    public Aresta(int inicioVestice, int fimVestice, int duracao){
        this.inicioVestice = inicioVestice;
        this.fimVestice = fimVestice;
        this.duracao = duracao;
    }

    public int getInicioVestice() {
        return inicioVestice;
    }

    public int getFimVestice() {
        return fimVestice;
    }

    public int getDuracao() {
        return duracao;
    }
    
    
    
}
