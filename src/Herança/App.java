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

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("NB");

        p1.setIdade(30);
        p2.setIdade(67);
        p3.setIdade(19);
        p4.setIdade(26);

        p2.setCurso("POO");
        p3.setSalario(10.000);
        p4.setSetor("FrontEnd");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println( p3.toString());
        System.out.println(p4.toString());

        
    }
    
}
