package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(9d);
        notas.add(9.1);
        notas.add(6.9);
        notas.add(5d);
        notas.add(5.5);
        notas.add(3.6);

        System.out.println("Exiaba a posição da nota 5.0: "+ notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8 na posição 4: ");
        notas.add(4, 8d);
        System.out.println("Substitua a nota 5.0 pela 7.0: ");
        notas.set(notas.indexOf(5d), 7.0);
        System.out.println("Verifique se a nota 5.0 está na lista: "+notas.contains(5d));
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " +notas.get(2));
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: " +Collections.min(notas));
        System.out.println("Exiba a maior nota: " +Collections.max(notas));
        System.out.println("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a média das notas: "+ (soma/notas.size()));
        System.out.println("Remova a nota zero: ");
        notas.remove(0d);
        System.out.println("Remova a nota na posição zero: ");
        notas.remove(0);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        notas.clear(); //apaga a nota
        System.out.println("Confira se a nota está vazia: " + notas.isEmpty());
    }
}
