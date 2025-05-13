public class Main {
    public static void main(String[] args) {

        Hangar hangar = new Hangar();

        hangar.aeronaves.add(
                new Aeronave(
                        "Boing 747-8",
                        410,
                        1050,
                        238.610,
                        12.5));

        hangar.aeronaves.add(
                new Aeronave(
                        "Airbus A380",
                        525,
                        1080,
                        323.546,
                        14.5));

        hangar.aeronaves.add(
                new Aeronave(
                        "Boeing 787 Dreamliner",
                        242,
                        903,
                        126.206,
                        6.5));

        hangar.aeronaves.add(
                new Aeronave(
                        "Embraer E195-E2",
                        146,
                        870,
                        13.500,
                        2.8));

        System.out.printf("A aeronave com maior capacidade de passgeiros é %s.\n",
                hangar.getNomeAeronaveComMaiorCapacidadeDePassageiros());

        System.out.printf("A aeronave com maior eficiencia é a %s.\n",
                hangar.getNomeAeronaveComMaiorEficiencia());

        System.out.printf("A aeronave com maior distancia máxiam é a %s.\n",
                hangar.getNomeAeronaveComMaiorDistanciaDeVoo());

    }

}
