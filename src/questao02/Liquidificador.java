package questao02;

public class Liquidificador {
    int velocidade;

    public Liquidificador() {
        this.velocidade = 0;
    }

    boolean aumentarVelocidade(){
        if (velocidade < 3){
            velocidade++;
            return true;
        } else {
            return false;
        }
    }

    boolean diminuirVelocidade(){
        if (velocidade > 0){
            velocidade--;
            return true;
        } else {
            return false;
        }
    }

    int obterVelocidade() {
        return velocidade;
    }
}
