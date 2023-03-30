package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(tipoTiro.equals("Explosivo")){
            ast.destruir();
        }
        else {
            if(ast.getTipoAsteroide().equals("Grande")) {
                System.out.println("Impossível destruir este asteroide com esse tipo de tiro!");
                this.vida -= 5;
                System.out.println("Vida atual: " + this.vida);
            }
            else
                ast.destruir();
        }


    }
}
