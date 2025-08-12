/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.comp4.concorrenciademo.produtorconsumidor;

import java.security.SecureRandom;

/**
 *
 * @author D.N.Kasso
 */
public class Consumidor implements Runnable{
    
    private static final SecureRandom gerador = new SecureRandom();
    private final Buffer partilhado;
    
    public Consumidor(Buffer partilhado){
        this.partilhado = partilhado;
    }

    @Override
    public void run() {
        
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            
            try {
                
                Thread.sleep(gerador.nextInt(100));
                soma += partilhado.getValue();
                System.out.println("Soma: " +soma);
                
            } catch (InterruptedException ex) {
                
                Thread.currentThread().interrupt();
            }
            System.out.println("Soma total feita pelo consumidor: " +soma);
            System.out.println("Consumidor termina");
            
        }
        
    }
}
