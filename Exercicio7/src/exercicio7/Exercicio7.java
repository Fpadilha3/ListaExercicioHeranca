
package exercicio7;


public class Exercicio7 {

    
    public static void main(String[] args) {
        
        
       
      

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        // Definindo dados da conta corrente
        cc.setNumeroConta("12345-6");
        cc.setSaldo(2500.0);
        cc.setLimite(1000.0);

        // Definindo dados da conta poupança
        cp.setNumeroConta("98765-4");
        cp.setSaldo(5000.0);
        cp.setTaxaRendimento(0.05); // 5% ao mês

        // Exibindo dados da conta corrente
        System.out.println("Conta Corrente:");
        System.out.println("Número: " + cc.getNumeroConta());
        System.out.println("Saldo: R$ " + cc.getSaldo());
        System.out.println("Limite: R$ " + cc.getLimite());

        // Exibindo dados da conta poupança
        System.out.println("\nConta Poupança:");
        System.out.println("Número: " + cp.getNumeroConta());
        System.out.println("Saldo: R$ " + cp.getSaldo());
        System.out.println("Taxa de Rendimento: " + (cp.getTaxaRendimento() * 100) + "%");
    }
}
        
        
        
        
        
        
        
        
        
        
    
  