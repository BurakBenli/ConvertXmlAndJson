import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Fibonnacci Sayısı Giriniz!!");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu = birinci + ikinci;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(birinci+ " "+ikinci+ " ");

        while(sayi>0){
            System.out.print(ucuncu+ " ");
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;


        }

    }

}
