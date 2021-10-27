package projetoLivro;

public class App {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
    
        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "F", 25);

        l[0] = new Livro("Eu Robo", "isac asimov", 400, p[0]);
        l[1] = new Livro("A coragem de ser imperfeito", "brene brow", 300, p[1]);
        l[2] = new Livro("O menino que se alimentava de pesadelos", "Ko Moon-Young", 200, p[1]);
        

        l[2].abrir();
        l[2].folhear(200);
        System.out.println(l[2].detalhes());
    }    
}
