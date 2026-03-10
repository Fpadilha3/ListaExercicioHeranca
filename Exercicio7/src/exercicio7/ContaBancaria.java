
package exercicio7;


public class ContaBancaria {
    
    


    private String numeroConta;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

class ContaCorrente extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
    
    
    
    
    
    
    
    
    
    

