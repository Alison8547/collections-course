package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitaisTree = new TreeSet<>(); // Ordem fica em árvore binaria
        capitaisTree.add("Porto Alegre");
        capitaisTree.add("Florianópolis");
        capitaisTree.add("Curitiba");
        capitaisTree.add("São Paulo");
        capitaisTree.add("Rio de Janeiro");
        capitaisTree.add("Belo Horizonte");

        System.out.println(capitaisTree);

        System.out.println(capitaisTree.first()); // retorna o primeiro elemento da árvore

        System.out.println(capitaisTree.last()); // retorna o último elemento da árvore

        System.out.println(capitaisTree.lower("Florianópolis")); // retorna o elemento abaixo da capital da árvore

        System.out.println(capitaisTree.higher("Florianópolis")); // retorna o elemento a cima da capital da árvore

        System.out.println(capitaisTree.pollFirst()); // retorna a primeira capital do topo da árvore e remove

        System.out.println(capitaisTree.pollLast()); // retorna a primeira capital no fundo da árvore e remove

        System.out.println(capitaisTree);
        System.out.println();

        Iterator<String> iterator = capitaisTree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (String i : capitaisTree) {
            System.out.println(i);
        }
    }
}
