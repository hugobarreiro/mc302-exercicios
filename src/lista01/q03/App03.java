package lista01.q03;

import java.util.Scanner;

public class App03 {
	private static int binary(int dec, int bin, int order){
		if(dec==0){
			return bin;
		}
		else{
			return binary(dec/2, (int) (Math.pow(10, order)*(dec%2)+bin), order+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int decimal;
		
		decimal=kb.nextInt();
		System.out.println(binary(decimal, 0, 0));
		kb.close();
	}
}
