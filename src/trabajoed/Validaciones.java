/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAM124
 */
public class Validaciones {
    
    public static boolean introducirNombre(String nombre) {
        
        boolean valido = false;
        
            if (nombre.matches("[A-Z]{1}[a-z ]{2,15}")) {
                valido = true;
            }
        
        return valido;
    }

    public static boolean introducirDireccion(String direccion) {
        
        boolean valido = false;
        
            if (direccion.matches("[A-Z]{1}[a-z ]{2,30}")) {
                valido = true;
            }
        
        return valido;
    }
    
    public static boolean introducirNIF(String NIF) {

        boolean correcto = false;

        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher = pattern.matcher(NIF);

        if (matcher.matches()) {
            String letra = matcher.group(2);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = Integer.parseInt(matcher.group(1));
            index = index % 23;
            String reference = letras.substring(index, index + 1);
            if (reference.equalsIgnoreCase(letra)) {
                correcto = true;
            } else {
                correcto = false;
            }
        } else {
            correcto = false;
        }

        return correcto;

    }


    public static boolean introducirNumero(String tlf) {

        boolean valido = false;

        if (tlf.matches("[0-9]{9}")) {
            valido = true;
        } else {
            System.err.println("ERROR. Tlf no válido.");

        }
        return valido;

    }
    
    public static boolean introducirTarjeta(String tarjeta){
        
        boolean valido = false;
        
         
            if (tarjeta.matches("[0-9]{16}")) {
                valido = true;
            } else {
                System.err.println("ERROR. Tarjeta no válida.");
            }
        
        return valido;
    }
    
    public static boolean introducirCuenta(String cuenta){
        
        boolean valido = false;
        
        
            if (cuenta.matches("[0-9]{20}")) {
                valido = true;
            } else {
                System.err.println("ERROR. Cuenta bancaria.");
            }
        
        return valido;
        
    }
}
    

