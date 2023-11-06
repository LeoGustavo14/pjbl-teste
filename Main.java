package BEC.Exercicio2;

import BEC.Exercicio1.Carne;
import BEC.Exercicio1.Forno;
import BEC.Exercicio1.Pao;
import BEC.Exercicio1.Pizza;

public class Main {
    public static void main (String[] args){
        EsporteRadical f = new EsporteRadical();
        Skate ska = new Skate();
        Surf su = new Surf();
        Patinete P = new Patinete();

        EsporteRadical.Manobra(f);
        Surf.Manobra(ska);
        Skate.Manobra(su);
        Patinete.Manobra(P);
    }
}
