package questao02;

public class Main02 {
    public static void main(String[] args) {
        Liquidificador liq1 = new Liquidificador();
        liq1.velocidade = 0;

        System.out.println("Velocidade: " + liq1.obterVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Velocidade: " + liq1.obterVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Velocidade: " + liq1.obterVelocidade());
    }
}