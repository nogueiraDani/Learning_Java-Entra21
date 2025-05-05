package model;
import exceptions.LivroEmprestadoException;
import exceptions.LivroNaoEmprestadoException;

public class Livro {

    private String tituloLivro;
    private boolean estaEmprestado;

    public Livro(String tituloLivro, boolean estaEmprestado) {
        setTituloLivro(tituloLivro);
        setEstaEmprestado(estaEmprestado);
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }

    public void emprestarLivro() throws Exception {
        if (!isEstaEmprestado()) {
            setEstaEmprestado(true);
        } else {
            throw new LivroEmprestadoException(
                String.format(">> Impossivel emprestar o livro %s.", getTituloLivro()));
        }
    }

    public void devolverLivro() throws Exception {

        if (isEstaEmprestado()) {
            setEstaEmprestado(false);
        } else {
            throw new LivroNaoEmprestadoException(
                String.format(">> Impossivel devolver o livro %s.", getTituloLivro()));
        }
    }

    @Override
    public String toString() {
        if (isEstaEmprestado()) {
            return String.format("O livro %s está emprestado.", getTituloLivro());
        } else {
            return String.format("O livro %s não está emprestado.", getTituloLivro());
        }
    }

}
