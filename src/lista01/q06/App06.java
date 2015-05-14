package lista01.q06;

import java.util.Scanner;

public class App06 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String original=kb.nextLine();
		boolean pal=true;
		
		for(int i=0;i<original.length()/2;i++){
			if(original.charAt(i)!=original.charAt(original.length()-i-1)){
				pal=false;
				break;
			}
		}
		if(pal){
			System.out.println("Eh palindromo");
		}
		else{
			System.out.println("Nao eh palindromo");
		}
		kb.close();
	}

}
