package set;

import java.util.HashSet;
import java.util.Iterator;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<Double> notasAlunos = new HashSet<>(); // HashSet ordem não existe
        notasAlunos.add(10.0);
        notasAlunos.add(5.0);
        notasAlunos.add(8.5);
        notasAlunos.add(3.5);
        notasAlunos.add(4.0);
        notasAlunos.add(9.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(8.5);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());
        System.out.println();

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (Double notas : notasAlunos) {
            System.out.println(notas);
        }
        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());
    }
}
