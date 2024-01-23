import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class DESAFIO_Combate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();
        System.out.print("ataque: ");
        int attack = sc.nextInt();
        System.out.print("armadura: ");
        int armor = sc.nextInt();

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife2 = sc.nextInt();
        System.out.print("ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("armadura: ");
        int armor2 = sc.nextInt();

        Champion champion = new Champion(name,initialLife,attack,armor);
        Champion champion2 = new Champion(name2,initialLife2,attack2,armor2);

        System.out.print("quantos turnos você deseja executar? ");
        int x = sc.nextInt();
        System.out.println();
        for (int l = 1 ;champion2.getLife() > 0 && champion.getLife() > 0 &&  l <= x; l++){

            champion.takeDamage(champion2);
            champion2.takeDamage(champion);

            System.out.println("resultado do turno " + l);

            System.out.println();

            System.out.println(champion.status());
            System.out.println(champion2.status());
            System.out.println();
        }
        System.out.println();
        System.out.println("FIM DO COMBATE");

    }
}
