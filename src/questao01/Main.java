package questao01;

public class Main {
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada("LED", 20);
        System.out.println("LÂMPADA 01");
        System.out.println("TIPO: " + lamp1.getTipo());
        System.out.println("POTÊNCIA: " + lamp1.getPotencia());
        lamp1.ligar();
        lamp1.desligar();

        Lampada lamp2 = new Lampada("Fluorescente", 100);
        System.out.println("LÂMPADA 02");
        System.out.println("TIPO: " + lamp2.getTipo());
        System.out.println("POTÊNCIA: " + lamp2.getPotencia());
        lamp2.ligar();
        lamp2.desligar();

        Lampada lamp3 = new Lampada("Incandescente", 50);
        System.out.println("LÂMPADA 03");
        System.out.println("TIPO: " + lamp3.getTipo());
        System.out.println("POTÊNCIA: " + lamp3.getPotencia());
        lamp3.ligar();
        lamp3.desligar();
    }
}