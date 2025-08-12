/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.comp4.concorrenciademo.produtorconsumidor;

/**
 *
 * @author D.N.Kasso
 */
public class BufferSincronizado implements Buffer{
    
    private int buffer = -1; // compartilhado pelas threads Produtor e consumidor
    private boolean ocupado = false;
    
    @Override
    public synchronized void putValue(int valor) throws InterruptedException
    {
        while(ocupado){
            System.out.println("Produtor aguarda");
            wait();
        }
        buffer = valor;
        System.out.println("Produtor escreve: " +buffer);
        ocupado = true;
        notifyAll();
    } 

    @Override
    public synchronized int getValue() throws InterruptedException
    {
        while(!ocupado){
            System.out.println("Consumidor aguarda");
            wait();
        }
        ocupado = false;
        System.out.println("Consumidor le: " +buffer);
        
        notifyAll();
        
        return buffer;
    }
    
}
