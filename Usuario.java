import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void pegarEmprestado(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não está emprestado para você.");
        }
    }
}
