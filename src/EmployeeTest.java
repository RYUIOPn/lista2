import java.util.Scanner;

public class EmployeeTest {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Employee pagamento = new Employee();

        System.out.println("-------------------");
        System.out.print("Qual o Seu Primeiro nome: ");
        pagamento.firstName = input.nextLine();

        System.out.print("Qual o seu ultimo nome: ");
        pagamento.lastName = input.nextLine();

        System.out.print("Qual o seu salario mensal? ");
        double salarioMes = input.nextDouble();

        System.out.print("Porcentage para a bonificação:");
        pagamento.porcentagem = input.nextDouble();

        pagamento.setResumo(salarioMes);
        System.out.println();
        pagamento.setBonus(salarioMes, pagamento.porcentagem);

    }
}
