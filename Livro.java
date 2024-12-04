public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false; // Inicialmente, o livro não está emprestado
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' já foi emprestado.");
        }
    }

    public void devolver() {
        emprestado = false;
        System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
    }
}
