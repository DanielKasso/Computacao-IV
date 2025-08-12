
package edu.instic.comp4.concorrenciademo;

import java.security.SecureRandom;

/**
 *
 * @author D.N.Kasso
 */
public class ArrayPartilhado {
    
    private static final SecureRandom gerador = new SecureRandom();
    private final int[] array;
    private int indice = 0;
    
    public ArrayPartilhado(int tamanho){
        this.array = new int[tamanho];
    }
    
    public synchronized void adicionar(int valor) {
        
        try {
            Thread.sleep(gerador.nextInt(100));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        this.array[indice] = valor;
        System.out.printf("%s escreve %d na posicao %d \n", Thread.currentThread().getName(), valor, indice);
        indice++;
        System.out.printf("Proxima posicao: %d%n", indice);
    }          
}
