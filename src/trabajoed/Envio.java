/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoed;

import java.util.Calendar;

/**
 *
 * @author Nina
 */
public class Envio {
    

    private int id;
    private Calendar fechaSalida;
    private double real;
    private char tipo;
    private char lugar;

    public Envio() {

    }

    public Envio(int id, Calendar fechaSalida, double real, char tipo, char lugar) {
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.real = real;
        this.tipo = tipo;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getLugar() {
        return lugar;
    }

    public void setLugar(char lugar) {
        this.lugar = lugar;
    }
    
    public void costeEnvio(){
        if(real>=100){
            System.out.println("El coste de envío es gratuito.");
        }else if(lugar=='P'){
            real=real+20;
        }else if(lugar=='O'){
            real=real+50;
        }
    }

    @Override
    public String toString() {
        return "Envio{" + "id=" + id + ", fechaSalida=" + fechaSalida + ", real=" + real + ", tipo=" + tipo + ", lugar=" + lugar + '}';
    }
    
    
    
}
