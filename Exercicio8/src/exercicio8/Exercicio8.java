
package exercicio8;


public class Exercicio8 {

   
    public static void main(String[] args) {
        
        
        
        
        Celular celular = new Celular();
        Notebook notebook = new Notebook();

        // Definindo dados do celular
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S21");
        celular.setMemoria(128);

        // Definindo dados do notebook
        notebook.setMarca("Dell");
        notebook.setModelo("Inspiron 15");
        notebook.setProcessador("Intel i7");

        // Exibindo dados do celular
        System.out.println("Celular:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Memória: " + celular.getMemoria() + "GB");

        // Exibindo dados do notebook
        System.out.println("\nNotebook:");
        System.out.println("Marca: " + notebook.getMarca());
        System.out.println("Modelo: " + notebook.getModelo());
        System.out.println("Processador: " + notebook.getProcessador());
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
