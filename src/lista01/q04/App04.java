package lista01.q04;

import java.util.Scanner;

public class App04 {
	private static boolean fibonnacci(int number){
		int n=1, n_1=0, n_2=0;
		while(n<number){
			n_2=n_1;
			n_1=n;
			n=n_1+n_2;
		}
		if(n==number){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int teste=kb.nextInt();
		if(fibonnacci(teste)){
			System.out.println(teste+" pertence a sequencia de Fibonnacci.");
		}
		else{
			System.out.println(teste+" nao pertence a sequencia de Fibonnacci.");
		}
		kb.close();
	}

}
