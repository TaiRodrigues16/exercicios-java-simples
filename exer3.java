/*Fa�a um programa que armazena 8 n�meros e imprimi todos os n�meros. Ao final,
teremos o total de n�meros m�ltiplos de seis digitados*/


package lista;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner (System.in);
		int cont=0;
		int vet[];
		vet = new int [8];
		System.out.println("digite oito numeros");
		for (int i = 0; i < 8; i++) {
			
			vet[i]= teclado.nextInt();
			
		}
		
		
			for (int i = 0; i < 8; i++) {
			
				if(vet[i]%2 == 0){
				cont ++;
				}
			
			}
		
		System.out.println(cont);
		
		
	}
	
	
	
}
