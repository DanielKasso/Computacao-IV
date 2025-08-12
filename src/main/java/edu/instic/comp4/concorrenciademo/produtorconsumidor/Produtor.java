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
public class Produtor implements Runnable{
    
    private static final SecureRandom gerador = new SecureRandom();
    private final Buffer partilhado;
    
    public Produtor(Buffer partilhado){
        this.partilhado = partilhado;
    }

    @Override
    public void run() {
        
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            
            try {
                
                Thread.sleep(gerador.nextInt(100));
                partilhado.putValue(i);
                soma += i;   // incrementa soma de valores
                System.out.printf("\t%2d%n", soma);
                
            } catch (InterruptedException ex) {
                
                Thread.currentThread().interrupt();
            }
            System.out.println("Produtor termina a producao");
            
        }
        
    }
    
    
}
