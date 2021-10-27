package Herança;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    // public Funcionario(String setor) {
    //     this.setor = setor;
    //     this.trabalhando = false;
    // }

    public void mudarTrabalho() {
        if (isTrabalhando()) {
            setTrabalhando(false);
        } else {
            setTrabalhando(true);
        }
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    
}