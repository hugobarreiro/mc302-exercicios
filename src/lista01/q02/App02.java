package lista01.q02;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		int salary, newsalary, sumsalary=0, sumnewsalary=0;
		String name;
		Scanner kb = new Scanner(System.in);
		
		name=kb.next();
		
		while(!name.equals("FIM")){
			salary=kb.nextInt();
			sumsalary+=salary;
			if(salary<=150){
				newsalary=salary+salary/4;
			}
			else if(salary<=300){
				newsalary=salary+salary/5;
			}
			else if(salary<=600){
				newsalary=salary+salary/10+salary/20;
			}
			else{
				newsalary=salary+salary/10;
			}
			sumnewsalary+=newsalary;
			System.out.println(name+": Antigo "+salary+"; Novo "+newsalary+".");
			name=kb.next();
		}
		System.out.println();
		System.out.println("Folha antiga: "+sumsalary+"\nFolha nova: "+sumnewsalary+"\nReajuste: "+(sumnewsalary-sumsalary));
		kb.close();
	}

}
