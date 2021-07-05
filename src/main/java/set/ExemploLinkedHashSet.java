package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>(); // É na ordem q vc coloca mas é mais lento
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(1);
        numeros.add(10);

        System.out.println(numeros);

        numeros.remove(8);

        System.out.println(numeros);

        System.out.println(numeros.size());
        System.out.println();

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (Integer i : numeros) {
            System.out.println(i);
        }
        numeros.clear();
        System.out.println(numeros.isEmpty());
    }
}
