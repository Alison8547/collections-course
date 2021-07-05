package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>(); // Queue o primeiro da fila é o primeiro a sair
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll(); // retorna e remove o primeiro da fila

        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

        String primeiroDaFila = filaBanco.peek(); // retorna o primeiro da fila

        System.out.println(primeiroDaFila);
        System.out.println(filaBanco);

//        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element(); // retorna o primeiro e lança um erro se a fila estiver vazia
        System.out.println(primeiroClienteOuErro);
        System.out.println();

        for (String client : filaBanco) {
            System.out.println(client);
        }

        System.out.println();
        Iterator<String> iterator = filaBanco.iterator();

        while (iterator.hasNext()) {
            System.out.println("==>" + iterator.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());


    }
}
