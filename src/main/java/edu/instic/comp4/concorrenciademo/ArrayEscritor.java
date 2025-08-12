/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.comp4.concorrenciademo;

/**
 *
 * @author D.N.Kasso
 */
public class ArrayEscritor implements Runnable{
    private final ArrayPartilhado partilhado;
    private final int valorInicial;

    public ArrayEscritor(ArrayPartilhado partilhado, int valorInicial) {
        this.partilhado = partilhado;
        this.valorInicial = valorInicial;
    }

    @Override
    public void run() {
        for (int i = valorInicial; i < valorInicial + 4; i++) {
            this.partilhado.adicionar(i);
        }
    }
    
    
    
    
}
