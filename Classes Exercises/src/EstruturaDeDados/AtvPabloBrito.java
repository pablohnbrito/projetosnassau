package Atv2;

import java.util.*;

public class AtvPabloBrito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dic2 = new TreeMap<>() {{
            put("cachorro", "dog");
            put("gato", "cat");
            put("agua", "water");
            put("morcego", "bat");
            put("urso", "bear");
            put("vaca", "cow");
            put("dinossauro", "dinosaur");
            put("leite", "milk");
        }};

        String[][] dic = {{"cachorro", "dog"}, {"gato", "cat"}, {"agua", "water"}, {"morcego", "bat"}, {"urso", "bear"}, {"vaca", "cow"}, {"leite", "milk"}};
        Map<String, String> orderDicPt = new TreeMap<>();
        Map<String, String> orderDicEn = new TreeMap<>();
        Map<String, String> orderDic = new TreeMap<>();
        String escolha;
        while (true) {
            System.out.println("Escolha a ou A para lista ordenada em português ou qualquer outro valor para lista ordenada em inglês: ");
            escolha = scanner.next();

            System.out.println("Escolha a palavra a ser traduzida: ");
            String word = scanner.next();

            if (escolha.equals("a") || escolha.equals("A")) {
                for (int i = 0; i < dic.length; i++) {
                    orderDicPt.put(dic[i][0], dic[i][1]);
                    orderDic = orderDicPt;
                }
            } else {
                for (int i = 0; i < dic.length; i++) {
                    orderDicEn.put(dic[i][1], dic[i][0]);
                    orderDic = orderDicEn;
                }
            }


            if (orderDic.get(word) != null) {
                System.out.println(orderDic.get(word));
            } else {
                System.out.println("Palavra não está na lista.");
            }
            String exit;
            System.out.println("Digite a ou A para sair do programa ou qualquer tecla para continuar: ");
            exit = scanner.next();

            if (exit.equals("a") || exit.equals("A")) break;
        }
        System.out.println("A lista completa: "+orderDic);
    }
}