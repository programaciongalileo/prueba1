/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1git;

import java.util.Scanner;

/**
 *
 * @author martin
 */
public class Prueba1git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Teclea el nombre de un mes:");
        String mes=teclado.nextLine();
         switch(mes){
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("31 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("31 días");
                break;
            case "febrero":
                System.out.println("28 días ó 29 días si el año es bisiesto");
                break;
        }
    }
    
}
