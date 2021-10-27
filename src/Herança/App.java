package Herança;

public class App {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); 
        Aluno p2 = new Aluno(); 
        Professor p3 = new Professor(); 
        Funcionario p4 = new Funcionario(); 

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Ana");
        p4.setNome("tonia");

        p1.exibir();
        p2.exibir();
        p3.exibir();
        p4.exibir();

        
    }
    
}
