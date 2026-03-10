
package exercicio10;


public class ItemBiblioteca {
    
    
    

    private String titulo;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

class Livro extends ItemBiblioteca {

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

class Revista extends ItemBiblioteca {

    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
    
    
    
    
    
    
    
    
}
