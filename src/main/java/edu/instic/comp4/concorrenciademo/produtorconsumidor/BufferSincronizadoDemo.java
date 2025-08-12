/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.comp4.concorrenciademo.produtorconsumidor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author D.N.Kasso
 */
public class BufferSincronizadoDemo {
    
    public static void main(String[] args) throws InterruptedException{
        
        Buffer b = new BufferSincronizado();
        Produtor p = new Produtor(b);
        Consumidor c = new Consumidor(b);
        
        Thread tP = new Thread(p);
        Thread tC = new Thread(c);
        
        tP.start();
        tC.start();
  
    }
}
