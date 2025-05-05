

public class Main {

    public static void main(String[] args) {
        
        Pessoa dani = new Pessoa();

        dani.nome = "Dani";
        dani.sexo = 'f';
        dani.dataNascimento = "06/11/1989";
        dani.estadoCivil = "casada";


        Pessoa teste = new Pessoa();

        teste.nome = "teste";
        teste.sexo = 'm';
        teste.dataNascimento = "01/01/2001";
        teste.estadoCivil = "solteiro";

        System.out.println(teste.nome);

    }

}
