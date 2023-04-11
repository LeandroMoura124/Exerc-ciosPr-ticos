public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Leandro", "M", 18);
        p[1] = new Pessoa("Maria", "F", 25);


        l[0] = new Livro("JAVA POO", "Anderson de Moraes", 300, p[0]);
        l[1] = new Livro("Java Avançado", "Thiagueta", 225, p[1]);



        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
