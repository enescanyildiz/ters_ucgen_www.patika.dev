import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int sayi=input.nextInt();
        for (int i=0;i<=sayi;i++)
        {
            for(int a=1; a<=i+1; a++)
            {
                System.out.print(" ");
            }
            for (int b=0; b<=2*(sayi-i);b++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}