package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis");
        esportes.add("Handebol");
        esportes.add("Vôlei");

        System.out.println(esportes);

        esportes.set(2, "Ping Poong");

        esportes.remove(2);

        esportes.remove("Handebol");

        System.out.println(esportes.get(0));
        System.out.println();

        for (String listEsportes : esportes) {
            System.out.println(listEsportes);
        }
    }
}
