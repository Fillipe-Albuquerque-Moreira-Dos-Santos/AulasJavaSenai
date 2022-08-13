package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] numerosArray = new int [3][3];
		int contador = 10;
		
		for (int i = 0; i < numerosArray.length; i++){
			for (int j = 0; j < numerosArray.length; j++) {
				
				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador ++;
			}
			System.out.println("\n");
			
		}
		
		
		sc.close();
	}

}