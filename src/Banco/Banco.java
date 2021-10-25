package Banco;
import java.util.Scanner;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    Scanner teclado = new Scanner(System.in);

    public Banco(){
        saldo = 0;
        status = false;
    }

    public void status(){
        System.out.println("Numero da Conta: " + getNumConta());
        System.out.println("Tipo da Conta: " + getTipo());
        System.out.println("Dono da Conta: " + getDono());
        System.out.println("Saldo da Conta: R$" + getSaldo());
        System.out.println("Status da Conta: " + getStatus());
    }

    public void setNumConta(int numCnt) {
        this.numConta = numCnt;
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String don) {
        this.dono = don;
    }
    public String getDono() {
        return this.dono;
    }

    public void setStatus(boolean stts) {
        this.status = stts;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void setSaldo(float sald) {
        this.saldo = sald;
    }
    
    public float getSaldo() {
        return this.saldo;
    }

    public void abrirConta(String tp){
        setStatus(true);
        setTipo(tp);
        if (getTipo() == "cc") {
            setSaldo(50.00f);
            System.out.println("Conta Corrente aberta com R$" + getSaldo());
        } else if(getTipo()=="cp") {
            setSaldo(150.00f);
            System.out.println("Conta Poupança aberta com R$" + getSaldo());
        } else {
            System.out.println("Tipo INVALIDO");}
    }

    public void fecharConta(){
        if (getStatus()==true && getSaldo()==0) {
            setStatus(false);
            System.out.println("Conta fechada");
        } else {System.out.println("Você não pode fechar a conta com saldo ou devendo");}
    }

    public void depositar(float v){
        if (getStatus()==true){
          setSaldo(getSaldo()+v);
        }else {System.out.println("imposivel depositar em conta fechada");}
    }
    
    public void sacar(float sc){
        if (getStatus()==true){
            if(sc <= getSaldo()) {
                setSaldo(getSaldo()-sc);
            } else {System.out.println("Você não tem saldo suficiente para sacar");}
        } else {System.out.println("imposivel depositar em conta fechada");}
    }

    public void pagarMensal(){
        if(getStatus()==true && getTipo()=="cc"){
            setSaldo(getSaldo()-12);
        }else if (getStatus()==true && getTipo()=="cp"){
            setSaldo(getSaldo()-20);
        }
    }
}


