/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.act07;
import java.util.Scanner;
/**
 *
 * @author Carlos Rafael
 */
public class SPP2CGarzaGAct07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner kb=new Scanner (System.in);
     long[] agenda=new long [10];
     for (int i = 0; i<agenda.length;i++) {
         System.out.println("introduzca el numero telefonico que desea registrar en la casilla"+i);
         agenda[i]=kb.nextLong();
     }
     System.out.println("teclee el numero de casilla que desee solicitar");
     int i=kb.nextInt();
     if(i>10) {
         System.out.println("está fuera de rango");
     }else{
         System.out.println("el numero de la persona "+i+" es "+agenda[i]); 
     }
     }
     }
   