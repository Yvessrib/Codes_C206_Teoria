package br.inatel.cdg;

//Usando import
import br.inatel.cdg.matematica.Matematica;
import br.inatel.cdg.outramatematica.Calculadora;

public class Main {

    //br.inatel.cdg.matematica.Matematica ma = new br.inatel.cdg.matematica.Matematica(); - Sem usar import
    Matematica ma = new Matematica();

    //Sem usar import
    br.inatel.cdg.outramatematica.Matematica ma2 = new br.inatel.cdg.outramatematica.Matematica();

    //Puxando direto com o import
    Calculadora ca = new Calculadora();
}