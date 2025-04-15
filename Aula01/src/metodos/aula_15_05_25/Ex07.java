import java.util.Scanner;

public class Ex07 {

    /*
     * George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
     * histórias (Jar Jar Binks, ObiWan Kenobi, etc).
     * A fórmula, supostamente, é:
     * Seu primeiro nome na série Star Wars:
     * i.Pegue as três primeiras letras de seu sobrenome
     * ii.Adicione a ele as duas primeiras letras de seu nome
     * Seu sobrenome na série Star Wars:
     * i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
     * ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
     * Crie um método chamado generateStarWarsName que gera um nome completo Star
     * Wars conforme descrito.
     * Imprima o seu nome Star Wars
     * As entradas serão os nomes completos.
     * Para separar, por exemplo as três primeiras letras do seu sobrenome, use o
     * atributo
     * .charAt() das Strings
     */

    private static void generateStarWarsName(String string, String string2, String string3) {

        String tresPrimeirasLetrasSobrenome = string.substring(string.length() - 3);
        String duasPrimeirasLetrasNome = string.substring(0, 2);

        StringBuilder nomeAjustado = new StringBuilder();

        nomeAjustado.append(String.valueOf(tresPrimeirasLetrasSobrenome.charAt(0)).toUpperCase());
        nomeAjustado.append(tresPrimeirasLetrasSobrenome.substring(1));
        nomeAjustado.append(duasPrimeirasLetrasNome.toLowerCase());


        String listaSobrenomes[] = string2.split(" ");
        String duasPrimeirasLetrasSobrenomeMae = listaSobrenomes[listaSobrenomes.length - 1].substring(0, 2);
        String tresPrimeirasLetrasCidadeNatal = string3.substring(0, 3);
        
        StringBuilder sobrenomeAjustado = new StringBuilder();

        sobrenomeAjustado.append(String.valueOf(duasPrimeirasLetrasSobrenomeMae.charAt(0)).toUpperCase());
        sobrenomeAjustado.append(duasPrimeirasLetrasSobrenomeMae.substring(1));
        sobrenomeAjustado.append(tresPrimeirasLetrasCidadeNatal.toLowerCase());
        
        System.out.printf("Seu nome Star Wars é -> %s.\n", nomeAjustado + " " + sobrenomeAjustado);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome completo");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome completo da sua mãe");
        String nomeMae = scanner.nextLine();

        System.out.println("Digite a cidade onde você nasceu");
        String cidade = scanner.nextLine();

        generateStarWarsName(nome, nomeMae, cidade);

        scanner.close();
    }

}
