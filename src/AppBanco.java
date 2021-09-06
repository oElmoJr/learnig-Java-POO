public class AppBanco {
    public static void main(String[] args) {
        Banco cnt1 = new Banco();
        cnt1.setNumConta(1);
        cnt1.setDono("Jubileu");
        cnt1.abrirConta("cc");
        cnt1.depositar(500);
        cnt1.sacar(538);
        cnt1.pagarMensal();
        cnt1.fecharConta();
        cnt1.status();

        Banco cnt2 = new Banco();
        cnt2.setNumConta(222);
        cnt2.setDono("creusa");
        cnt2.abrirConta("cp");
        cnt2.sacar(150);
        cnt2.fecharConta();
        cnt2.status();
    }

    
}
