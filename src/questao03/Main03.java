package questao03;

public class Main03 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.cor = "Branco";
        c1.modelo = "UNO";
        c1.velocidadeAtual = 0;
        c1.velocidadeMaxima = 100;
        System.out.println("CARRO");
        System.out.println("COR: " + c1.cor);
        System.out.println("MODELO: " + c1.modelo);
        System.out.println("VELOCIDADE ATUAL: " + c1.velocidadeAtual);
        System.out.println("VELOCIDADE MÁXIMA: " + c1.velocidadeMaxima);
        c1.ligar();
        System.out.println("MARCHA: " + c1.pegarMarcha());
        c1.acelerar(50);
        System.out.println("MARCHA: " + c1.pegarMarcha());
    }
}