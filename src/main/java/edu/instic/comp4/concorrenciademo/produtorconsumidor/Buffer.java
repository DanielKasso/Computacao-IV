/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.instic.comp4.concorrenciademo.produtorconsumidor;

/**
 *
 * @author D.N.Kasso
 */
public interface Buffer {
    
    public void putValue(int value) throws InterruptedException; 
    public int getValue() throws InterruptedException;
    
}
