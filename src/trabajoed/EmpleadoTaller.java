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
public class EmpleadoTaller extends Empleado{
    
    private int experiencia;
    
    public EmpleadoTaller(){
        
    }
    
    public void senior(Empleado nombre){
        if(experiencia>=3){
            System.out.println(nombre+" es una empleado de taller senior.");
        }
    }
    
    public void grupo(int numPrs,String nombre){
        if(numPrs>=2){
            System.out.println("Se ha formado el grupo "+nombre+" con "+numPrs+" personas que lo componen.");
        }else
            System.out.println("No hay suficiente gente para formar el grupo "+nombre);
    }
}
