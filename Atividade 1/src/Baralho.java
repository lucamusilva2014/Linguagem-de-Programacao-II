import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"copas", "ouros", "espadas", "paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei"};

        for (String naipe : naipes) {
            for (String nome : nomes) {
                cartas.add(new Carta(nome, naipe));
            }
        }

        for (int i = 0; i < 4; i++) {
            cartas.add(new Carta("coringa", "coringa"));
        }
    }


    public void embaralhar() {
        for (int i = 0; i < 100; i++) {
            int p1 = (int) (Math.random() * cartas.size());
            int p2 = (int) (Math.random() * cartas.size());
            Carta troca= cartas.get(p1);
            cartas.set(p1, cartas.get(p2));
            cartas.set(p2, troca);
        }
    }




    public Carta distribuirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }


    public boolean hasCarta() {
        return !cartas.isEmpty();
    }


    public void imprimirBaralho() {
        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);
            System.out.println(carta.getNome()+" de "+carta.getNaipe());
        }
    }
}
