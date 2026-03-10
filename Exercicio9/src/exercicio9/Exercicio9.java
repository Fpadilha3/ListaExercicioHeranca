
package exercicio9;

public class Exercicio9 {

   
    public static void main(String[] args) {
        
              
    

        Aviao aviao = new Aviao();
        Onibus onibus = new Onibus();

        // Definindo dados do avião
        aviao.setCapacidade(180);
        aviao.setVelocidade(850.0);
        aviao.setCompanhiaAerea("Latam");

        // Definindo dados do ônibus
        onibus.setCapacidade(50);
        onibus.setVelocidade(80.0);
        onibus.setNumeroLinha("105");

        // Exibindo dados do avião
        System.out.println("Avião:");
        System.out.println("Capacidade: " + aviao.getCapacidade() + " passageiros");
        System.out.println("Velocidade: " + aviao.getVelocidade() + " km/h");
        System.out.println("Companhia: " + aviao.getCompanhiaAerea());

        // Exibindo dados do ônibus
        System.out.println("\nÔnibus:");
        System.out.println("Capacidade: " + onibus.getCapacidade() + " passageiros");
        System.out.println("Velocidade: " + onibus.getVelocidade() + " km/h");
        System.out.println("Linha: " + onibus.getNumeroLinha());
    }
}
        
        
        
        
        
