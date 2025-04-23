public class Main {
    public static void main(String[] args) {
        
        /*
         * Crie uma classe chamada Circulo que tenha o atributo raio
         * Calcule a área de 5 objetos diferentes de Circulo
         * Para obter o valor de PI, use a função Math.PI do Java
         */

        double raios[] = { 5.60, 8.90, 10.15, 2.0, 1.36 };

        Circulo circulo1 = new Circulo();
        circulo1.raio = raios[0];

        Circulo circulo2 = new Circulo();
        circulo2.raio = raios[1];

        Circulo circulo3 = new Circulo();
        circulo3.raio = raios[2];

        Circulo circulo4 = new Circulo();
        circulo4.raio = raios[3];

        Circulo circulo5 = new Circulo();
        circulo5.raio = raios[4];


        System.out.printf("A área do circulo com raio de %.2fm² é %.2fm².\n",
                circulo1.raio,
                circulo1.calcularRaio());
        System.out.printf("A área do circulo com raio de %.2fm² é %.2fm².\n",
                circulo2.raio,
                circulo2.calcularRaio());
        System.out.printf("A área do circulo com raio de %.2fm² é %.2fm².\n",
                circulo3.raio,
                circulo3.calcularRaio());
        System.out.printf("A área do circulo com raio de %.2fm² é %.2fm².\n",
                circulo4.raio,
                circulo4.calcularRaio());
        System.out.printf("A área do circulo com raio de %.2fm² é %.2fm².\n",
                circulo5.raio,
                circulo5.calcularRaio());
        
    }
}
