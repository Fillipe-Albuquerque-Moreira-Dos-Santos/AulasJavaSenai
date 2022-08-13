package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		char estado_civil; 

		while(true){

	           System.out.println("Informe seu estado civil[c/s/v/d]: ");

	           estado_civil = sc.next().charAt(0);

	           if (estado_civil == 'c' || estado_civil == 's' || estado_civil == 'v' || estado_civil == 'd'){

	               break;

	           }else{

	               System.out.println("O estado civil inválido!");

	           }

	       }

	       

	   

	

		sc.close();
	}

}