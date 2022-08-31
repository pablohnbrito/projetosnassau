package lista1;

import java.util.Scanner;

public class AnimaisVeI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolhe entre vertebrado ou invertebrado: ");
        String VI = scan.nextLine();

        if (VI.toUpperCase().equals("VERTEBRADO")) {
                System.out.println("Ave ou mamífero?");
                String AM = scan.nextLine();
                if (AM.toUpperCase().equals("AVE")) {
                        System.out.println("Carnivoro ou onivoro? ");
                        String CO = scan.nextLine();
                        if (CO.toUpperCase().equals("CARNIVORO")) System.out.println("Águia");
                        else System.out.println("Pomba");
                } else {
                    System.out.println("Herbivoro ou onivoro? ");
                    String OH = scan.nextLine();
                    if (OH.toUpperCase().equals("ONIVORO")) System.out.println("Homem");
                    else System.out.println("Vaca");
                }
        } else {
            System.out.println("Inseto ou anelídeo?");
            String IA = scan.nextLine();
            if (IA.toUpperCase().equals("INSETO")) {
                System.out.println("Hematofogo ou herbivoro? ");
                String HO = scan.nextLine();
                if(HO.toUpperCase().equals("HEMATOFOGO")) System.out.println("Pulga");
                else System.out.println("Lagarta");
            } else {
                System.out.println("Hematofogo ou onivoro? ");
                String HO = scan.nextLine();
                if (HO.toUpperCase().equals("HEMATOFOGO")) System.out.println("Sanguessuga");
                else System.out.println("Minhoca");
            }
        }

    }
}
