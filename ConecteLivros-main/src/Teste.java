import br.senai.sc.livros.model.dao.LivroDAO;
import br.senai.sc.livros.model.entities.Livro;

import java.util.Collection;
import java.util.HashSet;

public class Teste {

    public static void main(String[] args) {
        LivroDAO dao = new LivroDAO();
        Collection<Livro> livros = new HashSet<>(dao.getAllLivros());
        livros.add(new Livro());
        Livro livro = new Livro();
        teste(livro.getTitulo());
        teste(livro.getISBN());
        teste(livro.getAutor());
    }

    public  static  void teste(Object o){
        System.out.println(o);
    }
}
