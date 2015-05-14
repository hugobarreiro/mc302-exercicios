package lista01.q05;

import java.util.Scanner;

public class App05 {
	static int P, A, mes;
	static double i, somajuros=0;
	
	private static void pay(){
		double juros;
		
		if(P*(1+i)<A){
			A=(int)(P*(1+i));
		}
		
		juros=(P*i);
		if(juros>A){
			P+=(juros-A);
			juros=A;
		}
		somajuros+=juros;
		P-=(A-juros);
		
		System.out.println("Mes "+mes);
		System.out.println("Juros pagos: "+juros);
		System.out.println("Divida paga: "+(A-juros));
		System.out.println("Juros pagos ate aqui: "+somajuros);
		System.out.println("Saldo devedor: "+P);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		mes=0;
		P=kb.nextInt();
		A=kb.nextInt();
		i=kb.nextDouble();
		
		do{
			mes++;
			pay();
		}
		while (P>0);
		
		System.out.println("Quantidade de meses necessarios: "+mes);
		System.out.println("Ultima parcela: "+A);
		
		kb.close();
	}

}
