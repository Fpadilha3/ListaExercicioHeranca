
package exercicio4;


public class Exercicio4 {

 
    public static void main(String[] args) {
        
        
        
        
 

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2022);
        carro.setNumeroPortas(4);

        moto.setMarca("Honda");
        moto.setModelo("CB 500");
        moto.setAno(2021);
        moto.setCilindradas(500);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Portas: " + carro.getNumeroPortas());

        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}  
        
        
        
        
        
        
  