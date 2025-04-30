package exceptions;
public class LivroNaoEmprestadoException extends Exception {

    public LivroNaoEmprestadoException(String mensagem) {
        super(mensagem);
    }

    public LivroNaoEmprestadoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public LivroNaoEmprestadoException() {
        super();
    }

    public LivroNaoEmprestadoException(Throwable causa) {
        super(causa);
    }
}
