package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundial = new HashMap<>();
        campeoesMundial.put("Brasil", 5);
        campeoesMundial.put("Alemanha", 4);
        campeoesMundial.put("Itália", 2);
        campeoesMundial.put("Uruguay", 2);
        campeoesMundial.put("Argentina", 2);
        campeoesMundial.put("França", 2);
        campeoesMundial.put("Inglaterra", 1);
        campeoesMundial.put("Espanha", 1);

        System.out.println(campeoesMundial);

        campeoesMundial.put("Brasil", 6); // Atualiza o valor da chave

        System.out.println(campeoesMundial);

        System.out.println(campeoesMundial.get("Argentina")); // pega o valor da chave

        System.out.println(campeoesMundial.containsKey("França")); // retorna true se contem key

        campeoesMundial.remove("França");

        System.out.println(campeoesMundial.containsKey("França"));

        System.out.println(campeoesMundial.containsValue(6));  // retorna se tem alguém com esse valor

        System.out.println(campeoesMundial.size());

        for (Map.Entry<String, Integer> list : campeoesMundial.entrySet()) {
            System.out.println(list.getKey() + "----" + list.getValue());

        }
        System.out.println();
        for (String key : campeoesMundial.keySet()) {
            System.out.println(key + "----" + campeoesMundial.get(key));
        }
        System.out.println(campeoesMundial);

        System.out.println(campeoesMundial.containsKey("Estados Unidos"));
        System.out.println(campeoesMundial.containsValue(5));

        System.out.println(campeoesMundial.size());

        campeoesMundial.clear();

        System.out.println(campeoesMundial.size());
    }
}
