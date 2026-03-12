public class HeartProfile {
    String firstName;
    String lastName;

    int birthDay;
    int birthMouth;
    int birthYear;

    int anoAtual = 2026;
    int idadeAtual;

    void calculateAge(int birthDay, int birthMouth , int birthYear){
        this.birthDay = birthDay;
        this.birthMouth = birthMouth;
        this.birthYear = birthYear;

        idadeAtual = anoAtual - birthYear;
        System.out.printf("IDADE ATUAL: %S%n",idadeAtual);
    }

    void frequenciaCardiaca(int idadeAtual){
        int frequenciaAtual = 220 - idadeAtual;
        System.out.printf("Sua frequencia atual é de: %s%n", frequenciaAtual);
    }

}
