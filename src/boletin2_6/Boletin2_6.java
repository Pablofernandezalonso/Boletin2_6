
package boletin2_6;

import java.util.Scanner;


public class Boletin2_6 {

    
    public static void main(String[] args) {
        
        float precioTarifa, precioPagado, descuento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir precio original");
        precioTarifa = sc.nextFloat();
        System.out.println("Introducir precio pagado");
        precioPagado = sc.nextFloat();
        descuento = (precioTarifa-precioPagado)/precioTarifa*100;
        System.out.println("el descuento aplicado es de "+descuento+" %");
        
        
        
    }
    
}
