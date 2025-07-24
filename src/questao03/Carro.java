package questao03;

public class Carro {
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }

    public void acelerar(double valor){
        double velocidadePretendida = velocidadeAtual + valor;
        if (velocidadePretendida <= velocidadeMaxima){
            velocidadeAtual = velocidadePretendida;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public int pegarMarcha(){
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
