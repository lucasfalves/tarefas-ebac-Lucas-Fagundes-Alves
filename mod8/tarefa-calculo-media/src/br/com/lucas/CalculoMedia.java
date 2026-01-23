package br.com.lucas;

public class CalculoMedia {

    public static void main (String args[]){

       calculoMedia();

    }

    private static void calculoMedia(){

        int nota1 = 4;
        int nota2 = 3;
        int nota3 = 7;
        int nota4 = 10;

        int calculoMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das suas notas é de: " + calculoMedia);

    }

}
