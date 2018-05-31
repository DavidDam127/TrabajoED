/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.io.Serializable;

/**
 *
 * @author DAM127
 */
public class Compra implements Serializable{
    private String referencia;
    private double precioTotal;
    private char metodoPago;

    public Compra(String referencia, double precioTotal, char metodoPago) {
        
        this.referencia=referencia;
        this.precioTotal=precioTotal;
        this.metodoPago=metodoPago;
        
                
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public char getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodoPago = metodoPago;
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
