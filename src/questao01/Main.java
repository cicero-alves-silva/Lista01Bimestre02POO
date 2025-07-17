package questao01;

public class Main {
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();
        lamp1.tipo = "LED";
        lamp1.potencia = 20;
        System.out.println("LÂMPADA 01");
        System.out.println("TIPO: " + lamp1.tipo);
        System.out.println("POTÊNCIA: " + lamp1.potencia);
        lamp1.ligar();
        lamp1.desligar();

        Lampada lamp2 = new Lampada();
        lamp2.tipo = "Fluorescente";
        lamp2.potencia = 100;
        System.out.println("LÂMPADA 02");
        System.out.println("TIPO: " + lamp2.tipo);
        System.out.println("POTÊNCIA: " + lamp2.potencia);
        lamp2.ligar();
        lamp2.desligar();

        Lampada lamp3 = new Lampada();
        lamp3.tipo = "Incandescente";
        lamp3.potencia = 50;
        System.out.println("LÂMPADA 03");
        System.out.println("TIPO: " + lamp3.tipo);
        System.out.println("POTÊNCIA: " + lamp3.potencia);
        lamp3.ligar();
        lamp3.desligar();
    }
}