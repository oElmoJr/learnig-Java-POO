package Caneta ;
public class AppCaneta {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta("BIC", "Amarelo", 0.44f);
        // c1.setModelo("BIC");
        // c1.setPonta(0.44f);
        c1.status();

        // System.out.println("Uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta("Stablo", "Preta", 0.44f);
        c2.status();
    }
}
