package Herança;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    // public Pessoa(String nome, String sexo, int idade) {
    //     this.nome = nome;
    //     this.sexo = sexo;
    //     this.idade = idade;
    // }

    public void fazerAniv() {
        setIdade(getIdade()+1);
    }

    public void exibir() {
       System.out.println(getNome());
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
       return "Pessoa {\n" + " nome: " + nome + "\n idade: " + idade + "\n Sexo: " + sexo + "\n}\n\n";
    }

}
