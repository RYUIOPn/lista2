public class Date {
    int day = 0;
    int mounth = 0;
    int year = 0;

    void displayDate(){
        String mensagemData = String.format("hoje é : %d/%d/%d",this.day,this.mounth,this.year);
        System.out.println(mensagemData);
    }
}
