package aulas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 10.0;
		
		double b = 5.0;
		
		double c = 2.0;
		
		/*
		System.out.println(	"A doma de a + b é: " + (a + b));
		
		System.out.println(	"A subtração de a - b é: " + (a - b));
		
		System.out.println(	"A multiplicação de a * b é: " + (a * c));
		
		System.out.println(	"A divisão de a / b é: " + (a / b));
		
		System.out.println(	"O resto da divisão entre a % c é: " + (a % c));
		*/
		double resultado1 = a * b + c;
		
		System.out.println(resultado1);
		
        double resultado2 = a * (b + c);
		
        System.out.println(resultado2);
		
        double resultado3 = a * c / b + a;
		
		System.out.println(resultado3);
		
		
		

	}

}
