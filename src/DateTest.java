
import java.util.Scanner;

public class DateTest{

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Date data = new Date();

        System.out.print("Qual o dia : ");
        data.day = input.nextInt();

        System.out.print("Qual o mes : ");
        data.mounth = input.nextInt();

        System.out.print("Qual o ano : ");
        data.year = input.nextInt();

        data.displayDate();

    }
}
