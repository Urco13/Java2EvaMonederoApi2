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
public class ExceptionRetirarDinero2 extends Exception{
    public ExceptionRetirarDinero2(){
        
    }
    @Override
    public String getMessage(){
        return "No se puede retirar menos de 0";
    }
}
