package Relacionamento;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(String categoria) {
        if (peso < 52.2) {
            this.categoria = "Invalido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Medio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public int getVitorias() {
        return vitorias;
    } 
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void apresentar() {
        System.out.println("\n\nLutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " Anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + "kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates() + "\n\n");
    };

    public void status() {
        System.out.println("\n\n" + getNome());
        System.out.println( "é um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates \n\n");
    };

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    };

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    };

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    };

    public Lutador(
        String nome,
        String nacionalidade,
        int idade,
        float altura,
        float peso,
        int vitorias,
        int derrotas,
        int empate
    ) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empate;
        }

}
