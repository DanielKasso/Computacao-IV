/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.instic.comp4.concorrenciademo;

/**
 *
 * @author D.N.Kasso
 */
public class ConcorrenciaDemo {

    public static void main(String[] args) {
        
        ArrayPartilhado partilhado = new ArrayPartilhado(8);
        ArrayEscritor escritor1 = new ArrayEscritor(partilhado, 10);
        ArrayEscritor escritor2 = new ArrayEscritor(partilhado, 20);

        Thread t1 = new Thread(escritor1);
        Thread t2 = new Thread(escritor2);
        
        t1.start();
        t2.start();
    }   
    
}
