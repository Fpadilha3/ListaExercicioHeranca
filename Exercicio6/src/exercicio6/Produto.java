
package exercicio6;

public class Produto {
    
   

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

class ProdutoEletronico extends Produto {

    private int voltagem;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}

class ProdutoAlimenticio extends Produto {

    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
 
