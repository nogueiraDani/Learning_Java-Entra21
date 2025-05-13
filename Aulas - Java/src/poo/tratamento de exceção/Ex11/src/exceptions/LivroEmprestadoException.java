package exceptions;
public class LivroEmprestadoException extends Exception {

    public LivroEmprestadoException(String mensagem) {
        super(mensagem);
    }

    public LivroEmprestadoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public LivroEmprestadoException() {
        super();
    }

    public LivroEmprestadoException(Throwable causa) {
        super(causa);
    }
}
