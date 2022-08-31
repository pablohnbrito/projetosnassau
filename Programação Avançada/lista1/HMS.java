package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HMS {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Informa a quantidade de segundos: ");
        int segundos = scan.nextInt();
        scan.close();
        int hh = segundos/3600;
        int hhresto = segundos%3600;
        if (hh<1) hh = 0;
        int mm = hhresto/60;
        if (mm<1) mm = 0;
        int mmresto = hhresto%60;
        int ss = mmresto/60;
        if (ss<1) ss = mmresto%60;
        System.out.println("HH:MM:SS = "+df.format(hh)+ ":"+df.format(mm)+":"+df.format(ss));
    }
}
