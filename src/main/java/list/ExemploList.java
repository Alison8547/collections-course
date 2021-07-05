package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Tiago");   // adiciona elementos
        nomes.add("Alison");
        nomes.add("Juliana");
        nomes.add("Zaro");
        nomes.add("Mario");

        nomes.set(2, "Larissa");    // coloca um elemento na posição desejada

        System.out.println(nomes);

        Collections.sort(nomes);  // ordenação basica

        System.out.println(nomes);

        nomes.remove(2);  // remove um elemento pelo index

        System.out.println(nomes);

        nomes.remove("Tiago");  // Remove o elemento pelo objeto

        System.out.println(nomes);

        String pegarNome = nomes.get(0);    // pega um nome pelo index

        System.out.println(pegarNome);

        int tamanho = nomes.size();     // tamanho total dos elementos

        System.out.println(tamanho);


        boolean temAlison = nomes.contains("Alison");  // verifica se contem tal objeto e retorna true ou false

        System.out.println(temAlison);

        boolean temSandryelly = nomes.contains("Sandryelly");

        System.out.println(temSandryelly);

        int posicao = nomes.indexOf("Zaro");  // verifica em qual posição está esse elemento

        System.out.println(posicao);

        for (String listaFor : nomes) {
            System.out.println("==>" + listaFor);
        }
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("===>" + iterator.next());
        }

        boolean vazio = nomes.isEmpty(); // verifica se a lista está vazia

        System.out.println(vazio);

        nomes.clear();  // limpa os elementos

        vazio = nomes.isEmpty();

        System.out.println(vazio);

    }
}
