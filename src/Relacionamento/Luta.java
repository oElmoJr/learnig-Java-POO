package Relacionamento;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado, desafiante;
    private int round;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2 ){
        if (( l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            
            Random aleatorio = new Random();

            int vencedor =aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("\n\nEmpatou\n\n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                System.out.println( "\n\n" +  this.desafiado.getNome() + " Ganhou!!\n\n");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                
                break;
                case 2:
                System.out.println( "\n\n" +  this.desafiante.getNome() + " Ganhou!!\n\n");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                    break;
            }


        } else {
            System.out.println("Luta não pode acontecer");
        }
         
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado; 
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
 