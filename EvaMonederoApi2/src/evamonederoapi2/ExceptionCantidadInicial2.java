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
public class ExceptionCantidadInicial2 extends Exception{
    public ExceptionCantidadInicial2(){
        
    }
    @Override
    public String getMessage(){
        return "Error dinero inicial";
    }
}
