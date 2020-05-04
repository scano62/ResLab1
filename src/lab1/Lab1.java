/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        while (true) {

            System.out.println("1.Primo");
            System.out.println("2.Dividir");
            System.out.println("3.Restar");
            System.out.println("4.Salir");

            System.out.println("Ingrese opcion");
            Scanner sc = new Scanner(System.in);
            String opc = sc.nextLine();

            switch (opc) {

                case "1":
                   // boolean valor = PRIMO();
                    //System.out.println("Resultado es : " + valor);
                    System.out.println("Interesante");
                case "2":

                case "3":

                case "4":

                    break;

            }

        }

    }

    

}
