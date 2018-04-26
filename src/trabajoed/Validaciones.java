/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAM124
 */
public class Validaciones {
    
    public static String introducirNombre() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String nombre = "";

        while (!valido) {
            System.out.println("Introducir nombre: ");
            
            nombre = sc.nextLine();
            if (nombre.matches("[A-Z]{1}[a-z ]{2,15}")) {
                valido = true;
            } else {
                System.err.println("ERROR. Nombre no válido.");
            }
        }
        return nombre;
    }

    public static String introducirDireccion() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String direccion = "";

        while (!valido) {
            System.out.println("Introducir dirección: ");
            direccion = sc.nextLine();
            if (direccion.matches("[A-Z]{1}[a-z ]{2,30}")) {
                valido = true;
            } else {
                System.err.println("ERROR. Dirección no válida.");
            }
        }
        return direccion;
    }
    
    public static String introducirNIF() {

        Scanner sc = new Scanner(System.in);
        String nif="";
        boolean correcto = false;

        while (!correcto) {
            System.out.println("Introducir NIF: ");
            nif = sc.nextLine();
            Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
            Matcher matcher = pattern.matcher(nif);

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
        }
        return nif;

    }


    public static String introducirNumero() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String tlf = "";
         while (!valido) {
            System.out.println("Introducir número de tlf: ");
            tlf = sc.nextLine();
            if (tlf.matches("[0-9]{9}")) {
                valido = true;
            } else {
                System.err.println("ERROR. Tlf no válido.");
            }
        }
        return tlf;
       
    }
    
    public static String introducorTarjeta(){
        Scanner sc=new Scanner(System.in);
        boolean valido = false;
        String tarjeta =" ";
         while (!valido) {
            System.out.println("Introducir Tarjeta de Crédito: ");
            tarjeta = sc.nextLine();
            if (tarjeta.matches("[0-9][16]")) {
                valido = true;
            } else {
                System.err.println("ERROR. Tarjeta no válida.");
            }
        }
        return tarjeta;
    }
    
    public static String introducirCuenta(){
        Scanner sc=new Scanner(System.in);
        boolean valido = false;
        String cuenta =" ";
         while (!valido) {
            System.out.println("Introducir Cuenta bancaria: ");
            cuenta = sc.nextLine();
            if (cuenta.matches("[0-9][20]")) {
                valido = true;
            } else {
                System.err.println("ERROR. Cuenta bancaria.");
            }
        }
        return cuenta;
        
    }
    
    public static double introducirPrecio(){
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        double precio=0;
        while(!valido){
            try{
                System.out.println("Introduce el precio por metro cuadrado: ");
                precio=sc.nextDouble();
                if((precio>0)){
                    valido = true;
                }else{
                    System.err.println("ERROR. Precio no válido.");
                }
            }catch(InputMismatchException ex){
                System.out.println("ERROR. El precio debe ser un número de tipo double.");
                sc.next();
            }
        }
        
        return precio;
    }

    public static int introducirOpcion() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int num = 0;
        while (!valido) {
            try {
                System.out.println("Introduce la opción: ");
                num = sc.nextInt();
                if ((num >= 1) && (num <= 7)) {
                    valido = true;
                } else {
                    System.err.println("ERROR. Número de opción no válido.");
                }
            } catch (InputMismatchException ex) {
                System.err.println("ERROR. No se ha introducido un número entero.");
            }
        }
        return num;
    }
    
}
