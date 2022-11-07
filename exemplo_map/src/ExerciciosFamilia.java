import java.util.*;

public class ExerciciosFamilia {
    public static void main(String[] args) {

        Map<String, Integer> moradores = new HashMap<>() {
            {
                put("Pai", 40);
                put("Mãe", 39);
                put("Julia", 18);
                put("Giselly", 15);
                put("Alice", 12);
            }
        };

        System.out.println(moradores);

        System.out.println("Substitua a idade do pai por : 41");
        moradores.put("Pai", 41);
        System.out.println(moradores);

        System.out.println("Confira se Julia está nos integrantes da familia ");
        moradores.put("Julia", 18);
        System.out.println(moradores);

        System.out.println("Exiba a idade de Alice " + moradores.get("Alice"));

        System.out.println("Exiba todos os familiares e suas idades na ordem em que foram informados: ");
        Map<String, Integer> moradores1Map = new LinkedHashMap<>() {
            {
                put("Pai", 40);
                put("Mãe", 39);
                put("Julia", 18);
                put("Giselly", 15);
                put("Alice", 12);
            }
        };
        System.out.println(moradores1Map);

        System.out.println("Exiba todos os moradores e suas idades por ordem alfabética: ");
        Map<String, Integer> moradores2 = new TreeMap<>(moradores);
        System.out.println(moradores2);

        Collection<Integer> moradores3 = moradores.values();
        String maiorIdade = "";
        String menorIdade = "";
        for (Map.Entry<String, Integer> entry : moradores.entrySet()) {
            if (entry.getValue().equals(Collections.max(moradores3)))
                maiorIdade = entry.getKey();
            if (entry.getValue().equals(Collections.min(moradores3)))
                menorIdade = entry.getKey();
        }
        System.out.printf("Exiba o morador com a menor idade (%s) e seu respectivo valor (%d)\n",
                menorIdade, Collections.min(moradores3));
        System.out.printf("Exiba o morador com a maior idade (%s) e seu respectivo valor (%d)\n",
                maiorIdade, Collections.max(moradores3));

        int soma = 0;
        Iterator<Integer> iterator = moradores.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da idade desses moradores: " + soma);

        System.out.println("Exiba a média da idade dos moradores: " + (soma / moradores.size()));

        System.out.println("Remova os moradores com idade menor que 39: ");
        Iterator<Integer> moradores4 = moradores.values().iterator();
        while (moradores4.hasNext()) {
            if (moradores4.next() <= 39)
                moradores4.remove();
        }
        System.out.println(moradores);

        System.out.println("Apague os moradores e suas respectivas idades: ");
        moradores.clear();
        System.out.println(moradores);

        System.out.println("Confira se a lista está vazia: " + moradores.isEmpty());
    }
}
