public class Book {

    String titulo;
    String autor;
    double preco;

    void setPreco( double preco){
        this.preco = preco;

        if (preco < 0){
            preco = 0;
            System.out.printf("valor transformado para $%f%n" , preco);
            System.out.printf("nome do livro: %s%n", titulo);
            System.out.printf("nome do autor: %s%n", autor);
        } else {
            System.out.printf("Maior que zero: $%.2f %n",preco);
            System.out.printf("nome do livro: %s%n", titulo);
            System.out.printf("nome do autor: %s%n", autor);
        }

    }
}
