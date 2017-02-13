/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi2;

//import UtilidadesLectura.;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dam115
 */
public class EvaMonederoApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monedero dinero = null;
        int sw=0;
        do{
        try {
            int option;
            option =(int) UtilidadesLectura.leerDouble("Que deseas hacer\n1-Inicia tu monedero con una cantidad inicial\n"
                    + "2-Ingresar dinero al monedero\n3-Retirar dinero del monedero\n"
                    + "4-Consultar saldo del monedero\n5-Salir del monedero");
            switch (option) {
                case 1:
                    dinero = new Monedero(UtilidadesLectura.leerDouble("Cuanto deseas ingresar en tu monedero"));
                    break;
                case 2:
                    dinero
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(dinero.getSaldo());
                    break;
                case 5:
                    sw=1;
                    break;
            }
            
//            dinero.ingreso(60);
//            System.out.println(dinero.getSaldo());
        } catch (Exception erro) {
            System.out.println("Error " + erro.getMessage());
        }
        }while(sw==0);
    }
    
}
