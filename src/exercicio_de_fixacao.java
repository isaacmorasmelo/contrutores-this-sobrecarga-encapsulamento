
import java.util.Locale;
import java.util.Scanner;
import entities.fixacao;

public class exercicio_de_fixacao {
    public static void main(String[] args) {
        double value;
        int number;
        fixacao fixacao = new fixacao();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        number = sc.nextInt();

        fixacao.setAccountCode(number);

        System.out.print("Enter account holder: ");
        String x = sc.nextLine();
        fixacao.name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);

        if (initialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            fixacao.depositValue(value);
        }

        System.out.println();

        System.out.println("Account data:");
        System.out.println("account: " + fixacao.toString());

        System.out.println();

        System.out.println("Enter a deposit value: ");
        value = sc.nextDouble();
        fixacao.depositValue(value);

        System.out.println("Updated account data: ");
        System.out.println("account: " + fixacao.toString());

        System.out.println();

        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        fixacao.withdrawValue(value);

        System.out.println("Account data:");
        System.out.println("account: "+ fixacao.toString());
    }
}
