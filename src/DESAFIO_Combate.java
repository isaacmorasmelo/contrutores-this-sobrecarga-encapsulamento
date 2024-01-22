import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class DESAFIO_Combate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome:");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();
        System.out.print("ataque: ");
        int attack = sc.nextInt();
        System.out.print("armadura: ");
        int armor = sc.nextInt();

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.println("Nome: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife2 = sc.nextInt();
        System.out.print("ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("armadura: ");
        int armor2 = sc.nextInt();

        Champion champion = new Champion(name,initialLife,attack,armor);

        System.out.print("quantos turnos você deseja executar? ");
        int x = sc.nextInt();
        System.out.println();
        for (int l = 1 ; l <= x ; l++){
            System.out.println("resultado do turno "+ l);
            System.out.println();
            System.out.println(Champion.status);
        }

        System.out.println("FIM DO COMBATE");

    }
}
