package questao01;

public class Lampada {
    private String tipo;
    private int potencia;

    public Lampada(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Lâmpada ligada!!!");
    }

    public void desligar() {
        System.out.println("Lâmpada desligada!!!");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
