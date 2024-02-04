package HesapMakinesi;
import java.util.Scanner;
public class HesapMakinesi {
	public static void main(String[]args) {
		int n1,n2,select;
		Scanner input = new Scanner(System.in);
		System.out.print("İlk sayıyı girin:");
		n1 = input.nextInt();
		System.out.print("İkinci sayıyı girin:");
		n2 = input.nextInt();
		
		System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n");
		System.out.print("seçiniz:");
		select = input.nextInt();
		switch(select) {
		case 1:
			System.out.print("toplam:"+(n1+n2));
		break;
		case 2:
			System.out.print("çıkarma:"+(n1-n2));
		case 3:
			System.out.print("çarpma:"+(n1*n2));
		case 4:
			   if (n2 == 0) {
				      System.out.println("Bir sayı sıfıra bölünemez!");
				    } else {
				      System.out.print("Bölme:" + (n1 / n2)); }
			   break;
			   default:
				   System.out.println("Yanlış seçim, tekrar deneyin.");
		}
	}
}
