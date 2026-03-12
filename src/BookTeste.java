import java.util.Scanner;

public class BookTeste {
    public static  void main(String[] args){

        Scanner input = new Scanner(System.in);

        //setando uma variavel que corresponde a classe do book
        Book meuLivro = new Book();

        //Atribuição de variavel que esta no book
        meuLivro.autor = "Rafael";
        meuLivro.titulo = "Fiap";

        System.out.print("Coloque o preço do livro:");
        double valorDigitado = input.nextDouble();

        meuLivro.setPreco(valorDigitado);
    }
}
