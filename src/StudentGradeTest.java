import java.util.Scanner;

public class StudentGradeTest {

    public static void main (String[] args){
        StudentGrade classe = new StudentGrade();

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o nome do curso: ");
        classe.courseName = input.nextLine();

        System.out.print("Qual o nome do instrutor: ");
        classe.instroctorName = input.nextLine();

        classe.displayMessage();
    }
}
