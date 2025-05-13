public class App {
    public static void main(String[] args) {
        

        try {
            Circulo c1 = new Circulo("Azul", 15.0);
            Cilindro c2 = new Cilindro("Anarelo", 20.0, 35.0);

            System.out.printf(
                    "A area do circulo %s é %.2fcm².\n",
                    c1.getClass().getName(),
                    c1.calcularArea());

            System.out.printf("A area do cilindro %s é %.2fcm³.\n",
                    c2.getClass().getName(),
                    c2.calcularVolume());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
