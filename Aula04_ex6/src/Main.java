public class Main {
    public static void main(String[] args) {

        //Criando os pilotos e karts
        Piloto p1 = new Piloto();
        Kart k1 = new Kart("RelampagoMarquinhos", "50", 120);

        Piloto p2 = new Piloto();
        Kart k2 = new Kart("AventuraMovel", "70", 100);

        //Configurando p1
        p1.nome = "Yves";
        p1.Vilao = true;
        p1.kart = k1;

        //Configurando p2
        p2.nome = "Victor";
        p2.Vilao = true;
        p2.kart = k2;

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