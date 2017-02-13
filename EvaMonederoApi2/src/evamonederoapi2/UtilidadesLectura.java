/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author dam115
 */
public class UtilidadesLectura {
    static BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
    
    public UtilidadesLectura(){};
    
    //leerString
    public static String leerString(){
           String cadena = null;
           System.out.println("Introduce una cadena de caracteres");
        try {
            cadena = leerTeclado.readLine();
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
        return cadena;
    }//fin leerString
    
    //leerEntero
    public static int leerEntero(){
       int numero = 0;
        System.out.println("Introduce un Entero");
        try {
            numero = Integer.parseInt(leerTeclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
       return numero;
    }//fin leerEntero
    
    //leerFloat
    public static float leerFloat(){
     float numero = 0;
        System.out.println("Introduce un Entero");
        try {
            numero = Float.parseFloat(leerTeclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
       return numero;   
    }//fin leerFloat
    
    //leerDouble
    public static double leerDouble(String texto){
        double numero = 0;
        System.out.println(texto);
        try {
            numero = Double.parseDouble(leerTeclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
       return numero;   
    }//fin leerDouble
    
    public static byte leerByte(){
        byte numero = 0;
        System.out.println("Introduce un Entero");
        try {
            numero = Byte.parseByte(leerTeclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
       return numero;   
    }
}
