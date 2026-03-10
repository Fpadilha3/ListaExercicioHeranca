
package exercicio8;


public class Dispositivo {
    

    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Celular extends Dispositivo {

    private int memoria; // em GB

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}

class Notebook extends Dispositivo {

    private String processador;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
