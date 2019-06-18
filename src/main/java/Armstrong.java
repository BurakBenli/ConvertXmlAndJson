import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int deger = scan.nextInt();
        int n = deger;
        int kalan = 0;
        int yenideger = 0;
        int length = String.valueOf(deger).length();

        for(int i=1;i<=length;i++){
            kalan = deger%10;
            yenideger = yenideger + (int)Math.pow(kalan,length);
            deger = deger/10;
        }

        if(yenideger == n){
            System.out.println("Sayi Armstrong Sayidir : " + n + " = " + yenideger);
        }else{
            System.out.println("Sayi Armstrong Sayi Degildir");
        }
    }
}
