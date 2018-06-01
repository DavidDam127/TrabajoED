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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    
    
    

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    
    public void seguimientoEnvio(Envio e){
        e.toString();
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", NIF=" + NIF + ", direccion=" + direccion + ", telefono=" + telefono + ", tarjetaCredito=" + tarjetaCredito + ", cuentaCorriente=" + cuentaCorriente + ", id=" + id + '}';
    }
    
    
    
    
    
}
