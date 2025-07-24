package questao03;

public class Main03 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Branco", "UNO", 0 , 100);
        System.out.println("CARRO");
        System.out.println("COR: " + c1.getCor());
        System.out.println("MODELO: " + c1.getModelo());
        System.out.println("VELOCIDADE ATUAL: " + c1.getVelocidadeAtual());
        System.out.println("VELOCIDADE MÁXIMA: " + c1.getVelocidadeMaxima());
        c1.ligar();
        System.out.println("MARCHA: " + c1.pegarMarcha());
        c1.acelerar(50);
        System.out.println("MARCHA: " + c1.pegarMarcha());
    }
}