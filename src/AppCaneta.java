public class AppCaneta {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Amarelo";
        // c1.ponta = 0.44f; 
        c1.carga = 80;
        // c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
