/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.gabrieljony.desafiorick;

import java.util.ArrayList;

/**
 *
 * @author GABRIEL
 */
public class Vertice {
    
    private int distanciadoportal = Integer.MAX_VALUE;
    private boolean visita;
    private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    
    public int getDistanciadoportal() {
        return distanciadoportal;
    }

    public void setDistanciadoportal(int distanciadoportal) {
        this.distanciadoportal = distanciadoportal;
    }

    public boolean isVisita() {
        return visita;
    }

    public void setVisita(boolean visita) {
        this.visita = visita;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }
    
}
