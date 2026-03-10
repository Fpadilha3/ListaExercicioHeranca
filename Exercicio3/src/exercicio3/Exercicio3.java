
package exercicio3;


public class Exercicio3 {

  
    public static void main(String[] args) {
        
      

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Rex");
        cachorro.setIdade(3);

        gato.setNome("Miau");
        gato.setIdade(2);

        System.out.println("Cachorro: " + cachorro.getNome() + " - " + cachorro.getIdade() + " anos");
        cachorro.emitirSom();

        System.out.println("Gato: " + gato.getNome() + " - " + gato.getIdade() + " anos");
        gato.emitirSom();
    }
}        
        
        
        
        
        
        
        
        
        
   
    }
    
}
