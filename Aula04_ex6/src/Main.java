public class Main {
    public static void main(String[] args) {

        //Criando os pilotos e karts
        Piloto p1 = new Piloto();
        Kart k1 = new Kart("RelampagoMarquinhos", "50", 120);

        Piloto p2 = new Piloto();
        Kart k2 = new Kart("AventuraMovel", "70", 100);

        //Configurando p1
        k1.piloto.nome = "Yves";
        k1.piloto.vilao = true;

        //Configurando p2
        k2.piloto.nome = "Victor";
        k2.piloto.vilao = true;

        //Realizando as interações
        k1.motor.mostraInfo();
        k2.motor.mostraInfo();

        k1.soltarTurbo();
        k2.fazerDrift();

        p2.soltaSuperPoder();
        k1.pular();

        p1.soltaSuperPoder();



    }
}