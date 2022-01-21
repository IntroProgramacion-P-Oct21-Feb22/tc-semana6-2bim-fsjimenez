/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;
/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[10];
        
        obtenerArreglo(a);           
    }
    
    public static void obtenerArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = RandomUtils.nextInt(100, 110);
            System.out.println(arreglo[i]);
        }
}
    
}
