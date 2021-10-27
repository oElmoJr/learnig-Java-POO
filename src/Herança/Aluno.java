package Herança;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    // public Aluno(int matricula, String curso) {
    //     this.matricula = matricula;
    //     this.curso = curso;
    // }

    public void cancelarMatricula() {

    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
}
