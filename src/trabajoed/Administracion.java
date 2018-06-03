/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DAM124
 */
public class Administracion {

    private ArrayList<Cliente> listadoClientes;
    private int numeroClientes;
    private ArrayList<Empleado> listadoEmpleados;
    private int numeroEmpleados = 1;
    private File datosClientes = new File("clientes.dat");
    private File datosCompras = new File("compras.dat");
    private ArrayList<Compra> listadoCompras;
    private int numeroCompras = 0;

    public Administracion() {

        listadoClientes = new ArrayList<Cliente>();
        listadoEmpleados = new ArrayList<Empleado>();
        listadoCompras = new ArrayList<Compra>();
        
        
        // Carga de los clientes en el Array.
        ObjectInputStream io=null;
        try {
            io =new ObjectInputStream(new FileInputStream(datosClientes));
            Cliente c=null;
            while(true){
                c=(Cliente)io.readObject();
                this.listadoClientes.add(c);
            }
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
        
        
        setNumeroClientes(listadoClientes.size()+1);
        
        //Carga las compras en el Array
        
        ObjectInputStream io2;
        try {
            io2 =new ObjectInputStream(new FileInputStream(datosCompras));
            Compra c2=null;
            while(true){
                c2=(Compra)io2.readObject();
                this.listadoCompras.add(c2);
            }
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
        
        setNumeroCompras(listadoCompras.size()+1);

    }

    public boolean añadirCliente(Cliente nuevoCliente) {

        boolean completado = false;

        listadoClientes.add(nuevoCliente);
        numeroClientes++;

        completado = true;

        return completado;

    }

    public ArrayList<Cliente> listaCliente() {
        return listadoClientes;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public String mostrarClientes() {

        String cadena="";
        for(Cliente cli:listadoClientes){
            cadena=cadena+cli.toString()+"\n";
        }
        
        
        return cadena;

    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }
/**
     * Este método permite guardar clientes en el fichero.
     */
    public void guardarClientes(Administracion empresa) {

        ObjectOutputStream fo = null;
        try {
            fo = new ObjectOutputStream(new FileOutputStream(datosClientes));
            for (Cliente c : empresa.listadoClientes) {
                fo.writeObject(c);
            }
        } catch (IOException ex) {

        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {

                }
            }

        }

    }
    /**
     * @param Se espera que se introduzca un NIF dde tipo String. 
     * Este método permite comprobar que el nif introducido por parámetro coincide con uno
     * almacenado en el ArrayList listadoClientes.
     * @return Devuelve un Boolean true si lo encuentra.
     */
    public boolean buscarUsuario(String NIF){
        boolean encontrado=false;
        
        for(Cliente c: this.listadoClientes){
            if(c.getNIF().equals(NIF)){
                encontrado=true;
            }
        }
        
        
        return encontrado;
    }
    /**
     * @param Se pide por argumento un NIF y un nombre.
     * El método comprueba que el usuario con esos datos exista en el ArrayList listadoClientes
     * @return Devuelve un Boolean true si lo encuentra. 
     */
    public boolean iniciarSesion(String NIF, String nombre){
        
        boolean correcto=false;
        
        for(Cliente c: this.listadoClientes){
            
                if(c.getNIF().equalsIgnoreCase(NIF) && c.getNombre().equalsIgnoreCase(nombre)){
                    correcto=true;
                }
                
            
        }
        return correcto;
    }
      /**
     * @param Se pide por argumento un NIF.
     * El método almacena los datos del usuario cuyo NIF es el que pasamos por argumento.
     * @return Devuelve los datos de ese cliente. 
     */
    public Cliente devolverUsuario(String NIF){
        
        
        Cliente clienteActivo = null;
        
        for(Cliente c: this.listadoClientes){
            
                if(c.getNIF().equalsIgnoreCase(NIF)){
                    clienteActivo=c;
                    
                }
                
            
        }
        
        return clienteActivo;
   
    }
      /**
     * @param Se pide por argumento un NIF y un nombre.
     * El método permite cambiar el nombre del cliente
     */
    public void cambiarNombreUsuario(String nombre, String NIF){
        
        for(Cliente c: this.listadoClientes){
            
            if(c.getNIF().equalsIgnoreCase(NIF)){
                
                c.setNombre(nombre);
                
            }
        }
        
    }
    /**
     * @param Se pide por argumento un NIF y una dirección.
     * El método permite cambiarla dirección del cliente
     */
    
    public void cambiarDireccionUsuario(String direccion, String NIF){
        
        for(Cliente c: this.listadoClientes){
            
            if(c.getNIF().equalsIgnoreCase(NIF)){
                
                c.setDireccion(direccion);
                
            }
        }
        
    }
    /**
     * @param Se pide por argumento un NIF y un número de teléfono.
     * El método permite cambiar el número de teléfono del cliente
     */
    public void cambiarTelefono(String telefono, String NIF){
        
        for(Cliente c: this.listadoClientes){
            
            if(c.getNIF().equalsIgnoreCase(NIF)){
                
                c.setTelefono(telefono);
                
            }
        }
        
    }
      /**
     * @param Se pide por argumento un NIF y un número de tarjeta.
     * El método permite cambiar el número de terjeta del cliente
     */
    
    public void cambiarTarjeta(String tarjeta, String NIF){
        
        for(Cliente c: this.listadoClientes){
            
            if(c.getNIF().equalsIgnoreCase(NIF)){
                
                c.setTarjetaCredito(tarjeta);
                
            }
        }
        
    }
      /**
     * @param Se pide por argumento un NIF y un número de cuenta.
     * El método permite cambiar el número de cuenta del cliente
     */
    public void cambiarCuenta(String cuenta, String NIF){
        
        for(Cliente c: this.listadoClientes){
            
            if(c.getNIF().equalsIgnoreCase(NIF)){
                
                c.setCuentaCorriente(cuenta);
                
            }
        }
        
    }
      /**
     * @param Se pide por argumento un objeto de tipo Compra.
     * El método comprueba que la compra se pueda realizar
     * @return devuelve un boolean true en caso de que se pueda realizar la compra.
     */
    public boolean añadirCompra(Compra nuevaCompra) {

        boolean completado = false;

        listadoCompras.add(nuevaCompra);
        completado = true;

        return completado;

    }
      /**
     * @param Se pide por argumento unobjeto de tipo Administracion.
     * El método guarda las compras en un fichero.
     */
    public void guardarCompras(Administracion empresa) {

        ObjectOutputStream fo = null;
        try {
            fo = new ObjectOutputStream(new FileOutputStream(datosCompras));
            for (Compra c : empresa.listadoCompras) {
                fo.writeObject(c);
            }
        } catch (IOException ex) {

        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {

                }
            }

        }

    }

    public ArrayList<Compra> getListadoCompras() {
        return listadoCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }
    
    

}
