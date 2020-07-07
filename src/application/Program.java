package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int contador = 0;
		
		int[][] matriz = new int[N][N];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("Numeros negativos: " + contador);
			
		sc.close();
	}
}