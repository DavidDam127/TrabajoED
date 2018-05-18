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

    public Administracion() {

        listadoClientes = new ArrayList<Cliente>();
        listadoEmpleados = new ArrayList<Empleado>();

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

        String clientes = "";

        for (int i = 0; i < listadoClientes.size(); i++) {
            clientes = "\t" + listadoClientes.get(i).toString();
        }

        return clientes;

    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }
    
    
    
    
    public String cargarClientes(){
        
        ObjectInputStream io;
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
        String cadena="";
        for(Cliente cli:listadoClientes){
            cadena=cadena+cli.toString()+"\n";
        }
        
        setNumeroClientes(listadoClientes.size()+1);
        
        return cadena;
        
        
    
    }

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
    
    public boolean buscarUsuario(String NIF){
        boolean encontrado=false;
        
        for(Cliente c: this.listadoClientes){
            if(c.getNIF().equals(NIF)){
                encontrado=true;
            }
        }
        
        
        return encontrado;
    }
    
    public boolean iniciarSesion(String NIF){
        
        boolean correcto=false;
        
        for(Cliente c: this.listadoClientes){
            
                if(c.getNIF().equalsIgnoreCase(NIF)){
                    correcto=true;
                }
                
            
        }
        return correcto;
    }

}
