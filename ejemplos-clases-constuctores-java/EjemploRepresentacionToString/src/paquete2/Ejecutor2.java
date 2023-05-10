/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;


public class Ejecutor2 {
    public static void main(String[] args) {
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        FacturaTelefonica fac = new FacturaTelefonica();
        // se llama al método que calcula el valor de la factura
        fac.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac);
        fac.establecerNumeroTelefono("0997286751");
        System.out.printf("%s\n", fac);
    }
}
