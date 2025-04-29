public class Main {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();

        carro1.acelerar(10);
        carro1.reduzir(10);
        carro1.acelerar(35); // aqui lança a exceção
        carro1.acelerar(45); // aqui lança a exceção

    }
}
