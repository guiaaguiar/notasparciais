package com.mycompany.notasparciais;

public class Notas2 {
    public double n1, n2, media, result;
            
    public double op(){
        media = (n1 + n2) / 2;
        
        if (media == 10) {
            System.out.println("Resultado: Aprovado com Distinção");
        }
        else if (media>= 7) {
            System.out.println("Resultado: Aprovado");
        }
        else {
            System.out.println("Resultado: Reprovado");
            }
        return media;
    }
}
