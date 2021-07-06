package map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> alunos = new Hashtable<>();
        alunos.put("Alison", 23);
        alunos.put("Mariana", 33);
        alunos.put("Juliana", 20);
        alunos.put("Pedro", 18);

        System.out.println(alunos);

        alunos.put("Pedro", 25);

        System.out.println(alunos);

        alunos.remove("Pedro");

        int idadeAluno = alunos.get("Alison");
        System.out.println(idadeAluno);

        System.out.println(alunos.size());

        for (Map.Entry<String, Integer> list : alunos.entrySet()) {
            System.out.println(list.getKey() + " - " + list.getValue());
        }
        System.out.println();

        for (String i : alunos.keySet()) {
            System.out.println(i + " - " + alunos.get(i));
        }

        System.out.println(alunos);
    }
}
