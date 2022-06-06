package Collections.Sets;

import java.util.*;

public class SetsMain {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.6, 9.3, 5d, 4d, 0d, 3.7));
        System.out.println(notas.toString());
        //não é possível trabalhar com índices (indexOf)
        //não é possível usar get e set para adicionar em determinada posição nem pegar um valor em determinada posição
        System.out.println("A nota 5 está no conjunto notas: "+notas.contains(5d));
        System.out.println("A menor nota é: "+ Collections.min(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba as somas dos valores: " +soma);
        double v = soma /notas.size();
        System.out.println("Exiba a média: " +v);
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem que foram exibidas");
        //deve ser usado o linkedHashSet para isso
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.6, 9.3, 5d, 4d, 0d));
        notas.add(3.7);
        System.out.println(notas1);
        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);
        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Verifique se o conjunto notas1 está vazio: " + notas1.isEmpty());
        System.out.println("Verifique se o conjunto notas2 está vazio: " + notas2.isEmpty());
    }
}