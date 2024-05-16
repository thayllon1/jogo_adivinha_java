package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;


System.out.println("################################");
       System.out.println("## jogo da adivinhação ##");
        System.out.println("#################################");
        System.out.println();
        System.out.println("1- vou pensar em um numero");
        System.out.println("2- vc tenta adivinhar qaul numeroo= estou pensando");
        System.out.println("3- te informo se acertou ou não");
        System.out.println("esta pronto pra jogar?(s/n)");
        pronto = leitura.next();






        switch ("pronto"){
            case "s":
                resposta =6;
                System.out.println("qual numero entre 0 e 10 estou pensando");
                tentativa = leitura.nextInt();
                if (tentativa == resposta){
                    System.out.println("parabens, vc acertou");
                }else {
                    System.out.println("que pena, vc errou!");
                }
                break;
            case "n" :
                break;switch
            default:
                System.out.println("opção invalida!");



        }


    }
}