/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam115
 */
public class Monedero3 {

    private double saldo;
    //constructor
    public Monedero3(){
    }
    ///Cantidad Inicial
    public Monedero3(double cantidadInicial) throws ExceptionCantidadInicial2{
        if (cantidadInicial>0) {
            this.saldo=cantidadInicial;
        }else{
            throw new ExceptionCantidadInicial2();
        }
    }//fin cantidad inicial
    
    
    ///Ingreso
    void ingreso(Double ingreso) throws ExceptionIngresarDinero2 {
        if (ingreso>0) {
            this.saldo+=ingreso;
        }else
            throw new ExceptionIngresarDinero2();
    }
    
    ///Retirar Dinero
    void retirar(Double sacarDinero) throws ExceptionRetirarDinero2 {
        if(sacarDinero>0&&this.saldo<=sacarDinero){
           this.saldo-=sacarDinero;
        }else{
            throw new ExceptionRetirarDinero2();
        }
    }
    //ver saldo
    void verSaldo(){
        System.out.println(this.saldo);
    }
}//fin class
