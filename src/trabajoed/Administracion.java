/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author DAM124
 */
public class Administracion {
    
    private  ArrayList<Cliente> listadoClientes;
    private  int numeroClientes=1;
    private ArrayList<Empleado> listadoEmpleados;
    private int numeroEmpleados=1;
    private File datosClientes;
    
   public Administracion(){
       
       
      
       
       listadoClientes=new ArrayList<Cliente>();
       listadoEmpleados=new ArrayList<Empleado>();
       
       
   }
   
   
   public  boolean añadirCliente(Cliente nuevoCliente){
       
       boolean completado=false;
       
       listadoClientes.add(nuevoCliente);
       numeroClientes++;
       
       completado=true;
       
       return completado;
       
       
   }

    public  int getNumeroClientes() {
        return numeroClientes;
    }

    

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public  String mostrarClientes(){
        
        String clientes="";
        
        for(int i=0; i< listadoClientes.size(); i++){
            clientes="\t"+listadoClientes.get(i).toString();
        }
        
        return clientes;
        
    }
   
   
   
    
    
}
