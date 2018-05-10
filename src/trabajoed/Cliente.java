/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.io.Serializable;



/**
 *
 * @author Pablo Sánchez
 */
public class Cliente implements Serializable{
    
    private String nombre, NIF, direccion, telefono, tarjetaCredito, cuentaCorriente;
    private int id;

    public Cliente(String nombre, String NIF, String telefono, 
            String direccion, int id) {
        
        this.nombre=nombre;
        this.NIF=NIF;
        this.telefono=telefono;
        this.direccion=direccion;
        this.id=id;
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", NIF=" + NIF + ", direccion=" + direccion + ", telefono=" + telefono + ", tarjetaCredito=" + tarjetaCredito + ", cuentaCorriente=" + cuentaCorriente + ", id=" + id + '}';
    }
    
    
    
    
    
}
