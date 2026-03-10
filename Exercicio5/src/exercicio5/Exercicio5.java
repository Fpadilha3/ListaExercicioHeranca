
package exercicio5;


public class Exercicio5 {

    
    public static void main(String[] args) {
        
      
        Professor prof = new Professor();
        Aluno aluno = new Aluno();

        prof.setNome("Ana");
        prof.setCpf("123.456.789-00");
        prof.setDisciplina("Matemática");

        aluno.setNome("Lucas");
        aluno.setCpf("987.654.321-00");
        aluno.setMatricula("2024002");

        System.out.println("Professor:");
        System.out.println("Nome: " + prof.getNome());
        System.out.println("CPF: " + prof.getCpf());
        System.out.println("Disciplina: " + prof.getDisciplina());

        System.out.println("\nAluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}  
        
        
        
        
        
        
    
    }
    
}
