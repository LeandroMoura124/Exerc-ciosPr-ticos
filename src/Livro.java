
public class Livro implements Publicacao{
    private String titulo, autor;
    private int pagAtual, totPaginas;
    private boolean aberto;
    private Pessoa leitor;



    //Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;

    }

  
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n autor=" 
        + autor + "\n totPaginas=" + totPaginas
        + " pagAtual= " + pagAtual + "\n aberto="
        + aberto + "\n leitor=" + leitor.getNome() 
        + " idade=" + leitor.getIdade() 
        + " sexo=" + leitor.getSexo();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public int getPagAtual() {
        return pagAtual;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas() {
        return totPaginas;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean getAberto(){
        return this.aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }




    //Metodos Especificos
    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
       this.aberto = false;
    }

    @Override
    public void folhear(int p ) {
        if(p >  totPaginas){
            this.totPaginas = 0;
        }
        else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    







}