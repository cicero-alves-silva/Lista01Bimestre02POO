package questao02;

public class Main02 {
    public static void main(String[] args) {
        Liquidificador liq1 = new Liquidificador();

        System.out.println("Velocidade: " + liq1.getVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Aumentou? " + liq1.aumentarVelocidade());
        System.out.println("Velocidade: " + liq1.getVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Diminuiu? " + liq1.diminuirVelocidade());
        System.out.println("Velocidade: " + liq1.getVelocidade());
    }
}