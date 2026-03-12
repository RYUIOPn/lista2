public class Invoice {
    String number;
    String description;
    int quantity;
    double itemPrice;

    void setQuantity(int quantity){


        if (quantity <= 0){
            this.quantity = 0;
            System.out.printf("Quantidade inferior a 0 tranformada a : %d%N", quantity);
        } else if (quantity > 0) {
            this.quantity = quantity;
            System.out.printf("Quantidade: %d", quantity);

        } else {
            System.out.println("Erro ao setar o valor");
        }
    }

    void setItemPrice(double itemPrice){

        if (itemPrice <= 0){
            this.itemPrice = 0;
            System.out.printf("Item com valor inferior a $0, tornando a : $%.2f%n",itemPrice);

        } else if (itemPrice > 0) {
            this.itemPrice = itemPrice;
            System.out.printf("valor do item: $ %.2f%n", itemPrice);

        } else {
            System.out.println("Erro ao colocar valor");
        }

    }

    void  getInVoiceAmount(){

    double total = itemPrice * quantity;

        System.out.println("----------------------------------");
        System.out.printf("Descrição: %s%n",this.description);
        System.out.printf("Numero de Serie: %S%n", this.number);
        System.out.printf("Quantidade: %d%n", this.quantity);
        System.out.printf("Preço(item): $%.2f%n", this.itemPrice);
        System.out.printf("Preço(Total): $%.2f%n",total);
        System.out.printf("----------------------------------");

    }


}
