
package exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        
        
   

        ProdutoEletronico eletronico = new ProdutoEletronico();
        ProdutoAlimenticio alimento = new ProdutoAlimenticio();

        // Definindo dados do eletrônico
        eletronico.setNome("Smartphone");
        eletronico.setPreco(2500.0);
        eletronico.setVoltagem(110);

        // Definindo dados do alimento
        alimento.setNome("Leite");
        alimento.setPreco(6.50);
        alimento.setDataValidade("10/04/2026");

        // Exibindo dados do eletrônico
        System.out.println("Produto Eletrônico:");
        System.out.println("Nome: " + eletronico.getNome());
        System.out.println("Preço: R$ " + eletronico.getPreco());
        System.out.println("Voltagem: " + eletronico.getVoltagem() + "V");

        // Exibindo dados do alimento
        System.out.println("\nProduto Alimentício:");
        System.out.println("Nome: " + alimento.getNome());
        System.out.println("Preço: R$ " + alimento.getPreco());
        System.out.println("Validade: " + alimento.getDataValidade());
    }
}
        
        
        
        
        
        
        
        
        
        
        
