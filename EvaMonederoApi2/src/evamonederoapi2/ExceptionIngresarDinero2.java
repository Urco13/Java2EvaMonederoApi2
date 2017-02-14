/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi2;

/**
 *
 * @author dam115
 */
public class ExceptionIngresarDinero2 extends Exception{
    public ExceptionIngresarDinero2(){
        
    }
    @Override
    public String getMessage(){
        return "No se puede ingresar menos de 0";
    }
}