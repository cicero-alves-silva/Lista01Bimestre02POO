package questao03;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void ligar(){
        System.out.println("O carro está ligado");
    }

    void acelerar(double valor){
        double velocidadePretendida = velocidadeAtual + valor;
        if (velocidadePretendida <= velocidadeMaxima){
            velocidadeAtual = velocidadePretendida;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    int pegarMarcha(){
        if (velocidadeAtual >= 0 && velocidadeAtual < 20) {
            return 1;
        } else if (velocidadeAtual >= 20 && velocidadeAtual < 40) {
            return 2;
        } else if (velocidadeAtual >= 40 && velocidadeAtual < 60) {
            return 3;
        } else if (velocidadeAtual >= 60 && velocidadeAtual < 80) {
            return 4;
        } else {
            return 5;
        }
    }
}
