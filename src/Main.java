import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        k=input.nextInt();
        int result=0;
        while (k>=0){
            if (k%2!=0){
                result= result+k;
            }
            k--;
        }
        System.out.println("tek sayılar toplamı :"+result);
    }
}