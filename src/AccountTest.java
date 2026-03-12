import java.util.Scanner;

public class AccountTest {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        Account conta = new Account();

        System.out.print("valor:");
        conta.withdrawalAmount = input.nextDouble();

        conta.withdraw();

    }
}
