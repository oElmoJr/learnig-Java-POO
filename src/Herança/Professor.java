package Herança;

public class Professor extends Pessoa {
    private String especialidade;
    private Double salario;

    // public Professor(String especialidade, Double salario) {
    //     this.especialidade = especialidade;
    //     this.salario = salario;
    // }

    public void receberAumento(Double aumento) {
        setSalario(getSalario() + aumento);
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }
}
