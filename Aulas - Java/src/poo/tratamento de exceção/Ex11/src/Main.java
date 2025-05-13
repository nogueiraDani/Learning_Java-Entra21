import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Titulo 1", false));
        livros.add(new Livro("Titulo 2", false));
        livros.add(new Livro("Titulo 3", false));
        livros.add(new Livro("Titulo 4", false));

        try {
            livros.get(0).emprestarLivro();
            livros.get(1).emprestarLivro();
            livros.get(2).emprestarLivro();
            livros.get(1).devolverLivro();
            livros.get(1).devolverLivro(); // lancara excecao
            //livros.get(2).emprestarLivro(); // lancara excecao
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            for (Livro livro : livros) {
                System.out.println(livro.toString());
            }
        }


    }
}
