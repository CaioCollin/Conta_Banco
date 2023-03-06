package javaapplication16;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication16 {
    
    public static void  Menu(){
        System.out.println("Banco do Brasil");
        System.out.println("1 - Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - sair");
        System.out.println();
    }

    public static void main(String[] args) {  
        
        Scanner input = new Scanner(System.in);
        Random gerador = new Random(10);
        int numro = (int)(Math.random() * 9000) + 1000;      
                
        Banco c1 = new Banco("Luiz",1000,numro);        
        int opc = 0;
        Menu();
        do{
            int menu = input.nextInt();
         
            switch (menu) {
                case 1:
                   c1.Extrato();
                    break;
                case 2:
                    System.out.println("Digitar o valor e ser sacado");
                    c1.saque  = input.nextDouble();
                    c1.valorInicial = c1.valorInicial - c1.saque;
                    c1.saquesRealizados++;
                    c1.getsaquesRealizados();                    
                    c1.sacar();                
                    break;
                case 3:
                     System.out.println("Digitar o valor e ser depositado");
                    c1.depositar = input.nextDouble();
                    c1.valorInicial = c1.valorInicial + c1.depositar;
                    c1.depositar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("opção invalida");     
            }
        }while(opc != 4);
        
    }   
}
