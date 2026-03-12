import java.sql.SQLOutput;
import java.util.Scanner;

public class HeartProfileTeste {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        HeartProfile prontuario = new HeartProfile();

        System.out.println("-----------------------------------");
        System.out.print("PRIMEIRO NOME: ");
        prontuario.firstName = input.nextLine();

        System.out.print("ULTIMO NOME: ");
        prontuario.lastName = input.nextLine();

        System.out.print("DIA DE NASCIMENTO: ");
        int dia = input.nextInt();

        System.out.print("MES DE NASCIMENTO: ");
        int mes = input.nextInt();

        System.out.print("ANO DE NASCIMENTO: ");
        int ano = input.nextInt();
        System.out.println("-----------------------------------");

        prontuario.calculateAge(dia,mes ,ano );
        prontuario.frequenciaCardiaca(prontuario.idadeAtual);

    }
}
