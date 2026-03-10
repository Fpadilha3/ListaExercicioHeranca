
package exercicio10;


public class Exercicio10 {

   
    public static void main(String[] args) {
       

        Livro livro = new Livro();
        Revista revista = new Revista();

        // Definindo dados do livro
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAnoPublicacao(1954);
        livro.setAutor("J.R.R. Tolkien");

        // Definindo dados da revista
        revista.setTitulo("National Geographic");
        revista.setAnoPublicacao(2026);
        revista.setEdicao(202);

        // Exibindo dados do livro
        System.out.println("Livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Autor: " + livro.getAutor());

        // Exibindo dados da revista
        System.out.println("\nRevista:");
        System.out.println("Título: " + revista.getTitulo());
        System.out.println("Ano de Publicação: " + revista.getAnoPublicacao());
        System.out.println("Edição: " + revista.getEdicao());
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
