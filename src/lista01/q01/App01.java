package lista01.q01;

import java.util.Scanner;

public class App01 {
	public static void main(String[] args) {
		int A, B;
		Scanner teclado= new Scanner(System.in);
		A=teclado.nextInt();
		B=teclado.nextInt();
		
		for(int i=A;i<=B;i++){
			if(i%2==1){
				System.out.print(i);
				if(B-i>=2){
					System.out.print(" ");
				}
			}
		}
		System.out.println();
		teclado.close();

	}

}

