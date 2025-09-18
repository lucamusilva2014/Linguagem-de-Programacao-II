public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println("Baralho Inicial:");
        baralho.imprimirBaralho();

        baralho.embaralhar();
        System.out.println("\nBaralho embaralhado:");
        baralho.imprimirBaralho();

        System.out.println("\n Tem Cartas:"+ baralho.hasCarta());

        System.out.println("\nDistribuindo cartas:");
            System.out.println("Carta Distribuida: " + baralho.distribuirCarta());
        }
    }

