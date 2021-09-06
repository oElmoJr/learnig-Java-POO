import java.util.Set;

public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta + "mm");
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }

    public Caneta(){

    }
    
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public int getCarga() {
        return this.carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return this.tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void rabiscar(){
        if (this.tampada==true) {
            System.out.println("Sorry, não posso rabiscar estando tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
