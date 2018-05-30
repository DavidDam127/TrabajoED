/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

/**
 *
 * @author DAM127
 */
public class Compra {
    private String referencia;
    private double precioTotal;
    private char metodoPago;

    public Compra(String referencia, double precioTotal, char metodoPago) {
        
        this.referencia=referencia;
        this.precioTotal=precioTotal;
        this.metodoPago=metodoPago;
        
                
    }
    
    public String devolverFactura(){
        
        String factura="";
        String metodo="";
        
        if(metodoPago=='T'){
            metodo="Tarjeta de crédito";
        }else if(metodoPago=='C'){
            metodo="Cuenta corriente";
        }
        
        
        factura="*** FACTURA ***\nReferencia: "+referencia+"\nPrecio Total"+precioTotal+"\nMétodo de pago: "+metodo;
        
        return factura;
        
    }
    

}
