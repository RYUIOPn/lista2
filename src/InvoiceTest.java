import java.util.Scanner;

public class InvoiceTest {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Invoice loja = new Invoice();

        System.out.print("Descrição do produto: ");
        loja.description = input.nextLine();

        System.out.print("Numero de Serie do produto: ");
        loja.number = input.nextLine();

        System.out.print("Preço do produto: ");
        double preco = input.nextDouble();

        System.out.print("quantidade no estoque: ");
        int quantidade = input.nextInt();
        System.out.println();

        loja.setQuantity(quantidade);
        System.out.println();
        loja.setItemPrice(preco);
        System.out.println();
        loja.getInVoiceAmount();
    }



}
