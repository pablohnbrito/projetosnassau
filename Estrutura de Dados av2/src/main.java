import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String[][] dic = {{"cachorro", "dog"}, {"gato", "cat"}, {"água", "water"},
                {"naive", "ingenuo"}, {"alfresco", "ao ar livre"}, {"hi there", "olá"},
                {"cow", "vaga"}, {"dinosaur", "dinossauro"}, {"milk", "leite"}};
        int i =0;
        Map<Integer, String> orderDic = new HashMap<>();

        /*
        while (true) {
            orderDic.put(i, dic[i][0] + " = " + dic[i][1]);
            i++;
            if (dic[i][0] == null) {break;}
        }

        i = 0;
        while (true) {
            orderDic.get(i);
            i++;
            if (orderDic.get(i) == null) {break;}
        }*/


        for (i = 0; i<9; i++) {
            orderDic.put(i, dic[i][0] + " = " + dic[i][1]);
        }
        for (i = 0; i<9; i++){
            System.out.println(orderDic.get(i));
        }
        System.out.println(orderDic);

    }
}
