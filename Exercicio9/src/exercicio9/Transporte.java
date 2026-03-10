
package exercicio9;


public class Transporte {
   

    private int capacidade;
    private double velocidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}

class Aviao extends Transporte {

    private String companhiaAerea;

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
}

class Onibus extends Transporte {

    private String numeroLinha;

    public String getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(String numeroLinha) {
        this.numeroLinha = numeroLinha;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
   
