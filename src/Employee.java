public class Employee {

    String firstName;
    String lastName;
    double monthlySalary;
    double salaryBonus;
    double porcentagem;

    void setResumo (double monthlySalary){
        this.monthlySalary = monthlySalary;

        if (monthlySalary > 0){
            System.out.printf("usuario: %s %s %n",firstName , lastName );
            System.out.printf("salario: %.2f%n",monthlySalary);
        } else {
            System.out.print("Seu salario é menor que zero");
        }
    }

    void setBonus (double monthlySalary , double porcentagem){
        this.monthlySalary = monthlySalary;
        this.porcentagem = porcentagem;

        if (monthlySalary > 0 ){
            salaryBonus = monthlySalary * (porcentagem / 100);
            double finalSalaty = salaryBonus + monthlySalary;

            System.out.printf("Salario bonificado: $%.2f", finalSalaty);
        } else {
            System.out.println("Sem adição de bonus");
            System.out.printf("Salario negativado: $%.2f",monthlySalary);
        }
    }
}
