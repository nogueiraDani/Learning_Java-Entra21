

public class Main {

    public static void main(String[] args) {

        /*
         * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
         * nascimento e
         * estado civil de uma pessoa.
         * O sexo deve ser definido como um caractere.
         * A data deve ser definida como String.
         * Crie 2 objetos de Pessoa e atribua valores a esses objetos
         */
        
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
