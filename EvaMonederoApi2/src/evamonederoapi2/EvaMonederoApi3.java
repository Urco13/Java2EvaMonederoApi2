/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam115
 */
public class EvaMonederoApi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sw=0;
       Menu miMenu = new Menu();
       Monedero3 miMonedero = null;
       do{
       try{
        switch (miMenu.mostrarMenu()) {
            case 1:
              miMonedero=new Monedero3(Utilidades.leerTexto("Dime que cantidad que deseas ingresar"));
                break;
            case 2:
                double cantidad;
                cantidad = Utilidades.leerTexto("Que cantidad deseas ingresar");
                miMonedero.ingreso(cantidad);
                break;
            case 3:
                break;
            case 4:
                miMonedero.verSaldo();
                break;
            case 5:
                sw=1;
                break;
        }
       } catch (ExceptionCantidadInicial2 ex){
           System.out.println(ex.getMessage());
       } catch (ExceptionRetirarDinero2 ej){
           System.out.println(ej.getMessage());
           
       }catch(ExceptionIngresarDinero2 er){
           System.out.println(er.getMessage());
       }
       
       catch(Exception ef){
           System.out.println("Error");
       }
        
       
       }while(sw==0);
    }
    
}
