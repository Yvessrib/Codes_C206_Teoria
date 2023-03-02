public class Zumbi {

    //Membros da calsse. O que os zumbis sabem sobre eles?
    String nome;
    double vida = 100;
    boolean alimentado = true;

    void alimentar(double vida){
        if(alimentado){
            //Já está alimentado
            System.out.println("Já estou alimentado!");
        }
        else{
            //Está com fome. Irá se alimentar.
            System.out.println("Sinto uma presa por perto!");
            this.vida += vida;
            System.out.println("Acabei de alimentar" + vida + " pontos de vida");
            System.out.println("Agora estou com " this.vida + " pontos de vida");
            if(this.vida >= 100) //Vida máxima
                alimetado = true;
        }
    }

    void tomarDano(double vida){
        this.vida = vida - dano;
        if(this.vida < 100)
            alimentado = false;
    }
}
