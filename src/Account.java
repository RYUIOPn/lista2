public class Account {

    double  withdrawalAmount;


    void withdraw () {

        if (withdrawalAmount <= 0 ) {
            this.withdrawalAmount = 0;
            System.out.printf("Valor menor que 0, trasnformado para $%.2f", withdrawalAmount);

        } else {
            System.out.printf("voce possui $%.2f, valor execido ", withdrawalAmount);
        }
    }

}