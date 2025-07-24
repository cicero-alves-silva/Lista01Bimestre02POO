package questao02;

public class Liquidificador {
    private int velocidade;

    public Liquidificador() {
        this.velocidade = 0;
    }

    public boolean aumentarVelocidade(){
        if (velocidade < 3){
            velocidade++;
            return true;
        } else {
            return false;
        }
    }

    public boolean diminuirVelocidade(){
        if (velocidade > 0){
            velocidade--;
            return true;
        } else {
            return false;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
