/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos_noprimos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Primos_noPrimos {

    /**
     * @param args the command line arguments
     */
    public static boolean primos(int num){
        boolean primo = true;
        
        for (int i=2;i<num;i++){
            if ((num % i)==0 ){
                primo = false;
                i=num+1;
            }
        }
        return primo;
    }
    
    public static int siguienteprimo(int num){
        int primo = 0;
        boolean bandera = true;
        for (int i = (num+1);bandera == true; i++){
            if (primos(i)){
                bandera = false;
                primo = i;
            }
        }
        
        return primo;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = 0;
        while (true){
        System.out.println("Escribe un numero:");
        num = leer.nextInt();
        if(primos(num)){
              System.out.println("El numero "+num+" si es primo");
              System.out.println("El siguiente numero primo es: "+siguienteprimo(num));
            }else{
                System.out.println("El numero "+num+" no es primo");
                System.out.println("El siguiente numero primo es: "+siguienteprimo(num));
            }
        if (num==0){
            System.out.println("Has salido del programa");
            break;}
        }
    }
    
}
