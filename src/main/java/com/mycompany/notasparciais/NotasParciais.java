package com.mycompany.notasparciais;

import java.util.Scanner;
public class NotasParciais {

    public static void main(String[] args) {
        Notas2 n = new Notas2();
        
    Scanner leia1 = new Scanner (System.in);
    System.out.println("Digite a primeira nota: ");
    n.n1 = leia1.nextDouble();
    
    Scanner leia2 = new Scanner (System.in);
    System.out.println("Digite a segunda nota: ");
    n.n2 = leia2.nextDouble();
    
        System.out.println("Sua média foi de: " +n.op());
    }
}
