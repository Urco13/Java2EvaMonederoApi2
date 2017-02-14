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

public class Menu {
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public Menu(){};
    
    public int mostrarMenu(){
        int option = 0;
        int sw=1;
        do{
        sw=1;
        System.out.println("1-Crear Monedero");
        System.out.println("2-Ingresar dinero al Monedero");
        System.out.println("3-Retirar dinero del Monedero");
        System.out.println("4-Ver saldo del Monedero");
        System.out.println("5-Cerrar Programa");
        try {
            option = Integer.parseInt(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error");
            sw=0;
        } catch (Exception ex) {
            System.out.println("Error dos");
            sw=0;
        }
        }while(sw==0);
        return option;
    }
}
